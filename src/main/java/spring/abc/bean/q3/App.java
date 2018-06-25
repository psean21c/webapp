package spring.abc.bean.q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * 
refer to: spring.basic.beans.component.scan.auto;
Question: 
Change AP(ApplicationContext) from AnnotationConfigApplicationContext to ClassPathXmlApplicationContext

As of now, we don't use any configuration xml file even though we have beanQ3.xml
Because we are using AnnotationConfigApplicationContext().
Change it with ClassPathXmlApplicationContext() which has to call beanQ3.xml file

 *
 */
public class App {
	public static void main(String[] args) {
		
		// Need to change below
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		// until here

		MyServiceImpl myService = ctx.getBean(MyServiceImpl.class);
		String name = myService.getName();
		int id = myService.getId();
		System.out.println("id=[" + id + "]\tname=[" + name + "]");
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
