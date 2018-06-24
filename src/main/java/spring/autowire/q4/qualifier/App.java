package spring.autowire.q4.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * Reviewed by SPark
 * Purpose : Practice @Qualifier on method()
 * You will have Runtime Error exception below;
 *  org.springframework.beans.factory.BeanCreationException: 
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("./spring/autowire/q4/qualifier/springAutowired4.xml");

		Logger logger = (Logger)context.getBean("logger");
		logger.writeConsole("Hello there: ");
		
		((ConfigurableApplicationContext) context).close();
	}
}
