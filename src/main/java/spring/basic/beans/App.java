package spring.basic.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/basic/beans/springBar.xml");
		Bar bar = (Bar) ctx.getBean("bar");

		System.out.println( "idx=" + bar.getName());
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
