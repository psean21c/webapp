package spring.basic.beans.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		DataSource dataSource = (DataSource) ctx.getBean(DataSource.class);
		
		System.out.println("dataSource :" + dataSource.toString());
		
		( (AnnotationConfigApplicationContext) ctx).close();
	}

}
