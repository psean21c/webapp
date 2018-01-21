package spring.sandbox;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.basic.beans.config.JavaConfig;

public class App {

	public static void main(String[] args) {
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/sandbox/sandbox.xml");
//		Bar bar = (Bar) ctx.getBean("bar");
//		System.out.println( "bar=" + bar.getName());
//////		Foo foo = (Foo) ctx.getBean("foo");
////
////		System.out.println( "bar=" + bar.getName());
//////		System.out.println( "foo=" + foo.getName());
//		((ClassPathXmlApplicationContext)ctx).close();

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		Bar bar = (Bar) ctx.getBean(Bar.class);
		System.out.println("bar=" + bar.getName());
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
