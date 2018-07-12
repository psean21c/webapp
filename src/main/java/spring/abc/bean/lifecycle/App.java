package spring.abc.bean.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * 
 * Reviewed by SPark Purpose :
 * 
 * 
 */
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "./spring/abc/bean/lifecycle/lifeCycle.xml" });
		CustomerService cust = (CustomerService) context.getBean("customerService");
		System.out.println(cust);
		context.close();
	}

}
