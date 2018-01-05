package spring.basic.beans.component.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "./spring/basic/beans/component/scan/springCustomer.xml" });

		CustomerService cust = (CustomerService) ctx.getBean("customerService");
		System.out.println(cust);

		((ClassPathXmlApplicationContext) ctx).close();
	}

}
