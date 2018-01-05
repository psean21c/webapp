package spring.basic.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/basic/beans/springBean.xml");
		Bar bar = (Bar) ctx.getBean("bar");
		int idx = bar.getIdx();
		
		System.out.println( "idx=" + idx);
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
