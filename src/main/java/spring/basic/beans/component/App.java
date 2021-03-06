package spring.basic.beans.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	// https://www.mkyong.com/spring/spring-auto-scanning-components/
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "./spring/basic/beans/component/springCustomer.xml" });

		CustomerService cust = (CustomerService) ctx.getBean("customerService");
		System.out.println(cust);

		((ClassPathXmlApplicationContext) ctx).close();
	}

}
