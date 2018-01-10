package spring.property.source;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		TestBean testBean = (TestBean) ctx.getBean(TestBean.class);
		
		System.out.println("testBean :" + testBean.getName());
		
		( (AnnotationConfigApplicationContext) ctx).close();
	}

}
