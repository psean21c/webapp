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

 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/abc/bean/getbean/q1/beanQ1.xml");
		AirService airService = (AirService) ctx.getBean("airService1");
		System.out.println( "airService=" + airService.getName());
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
