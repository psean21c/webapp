package spring.autowire.q7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("./spring/autowire/q7/springAutowired7.xml");

		Logger logger = (Logger)context.getBean("logger");

		logger.writeConsole("Hello there: ");

		
		((ConfigurableApplicationContext) context).close();
	}
}
