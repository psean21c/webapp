package spring.abc.bean.namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/abc/bean/namespace/namespace.xml");
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
