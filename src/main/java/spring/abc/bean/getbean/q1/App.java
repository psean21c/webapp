package spring.abc.bean.getbean.q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * 
 * I-2) Question

A) AirService service1 = (AirService) context.getBean("airService1").
B) AirService service2 = context.getBean("airService1", AirService.class).
C) AirService service3 = context.getBean(AirService).
D) AirService service3 = context.getBean(AirService.class).

>>
spring-beans
BeanFactory.getBean()

<T> T	getBean(java.lang.Class<T> requiredType)
<T> T	getBean(java.lang.Class<T> requiredType, java.lang.Object... args)
Object	getBean(java.lang.String name)
<T> T	getBean(java.lang.String name, java.lang.Class<T> requiredType)
Object	getBean(java.lang.String name, java.lang.Object... args)

https://www.javadoc.io/doc/org.springframework/spring-beans/5.0.5.RELEASE


 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/abc/bean/getbean/q1/beanQ1.xml");
		
		// 1)
		AirService airService = (AirService) ctx.getBean("airService1");
		System.out.println( "airService=" + airService.getName());
		// 2)
//		AirService airService2 = ctx.getBean("airService1", AirService.class);
//		System.out.println( "airService2=" + airService2.getName());
//		// 3)
//		AirService airService3 = ctx.getBean(AirService);
//		System.out.println( "airService3=" + airService3.getName());
//		// 4)
		AirService airService4 = ctx.getBean(AirService.class);
		System.out.println( "airService4=" + airService4.getName());
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
