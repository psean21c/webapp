package spring.abc.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/***
 * 
Question : It will run the error when you are running FileSystemXmlApplicationContext()

Exception in thread "main" org.springframework.beans.factory.BeanDefinitionStoreException: 
(The system cannot find the path specified)
Caused by: java.io.FileNotFoundException: spring\abc\context\springCustomer.xml (The system cannot find the path specified)

 *
 */
public class runApplicationContext {

	public static void main(String[] args) {
		
		// Problem occurred
		//ApplicationContext ctx =  new FileSystemXmlApplicationContext( "/spring/abc/context/springCustomer.xml");
		
		// Solution-1
		//ApplicationContext ctx =  new FileSystemXmlApplicationContext( "/src/main/java/spring/abc/context/springCustomer.xml");
		ApplicationContext ctx =  new FileSystemXmlApplicationContext( "classpath:./spring/abc/context/springCustomer.xml");

		CustomerService cust = (CustomerService) ctx.getBean("customerService");
		System.out.println(cust);

		( (FileSystemXmlApplicationContext) ctx).close();
	}
}
