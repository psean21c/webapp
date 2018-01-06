package spring.jdbc.transaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("spring.jdbc.transaction")
@Configuration
public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(App.class);
		ctx.refresh();
		
		CustomerService cust = (CustomerService) ctx.getBean("customerService");
		System.out.println(cust.toString());

		CustomerDAO customer = cust.getCustomerDAO();
		System.out.println("customer:"+ customer.getCustomer());
		
		((AnnotationConfigApplicationContext) ctx).close();
	}

}
