package spring.autowire.q8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("./spring/autowire/q8/springAutowired8.xml");

		Logger logger = (Logger)context.getBean("logger");

		logger.writeConsole("\tHello: ");
		
		((ConfigurableApplicationContext) context).close();
	}
}
