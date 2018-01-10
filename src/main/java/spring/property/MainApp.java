package spring.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./spring/property/property.xml");
		BasicDataSource data = (BasicDataSource) context.getBean("dataSource");

		System.out.println("datasource:" + data.getDriverClassName());
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
