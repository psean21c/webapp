package spring.basic.beans.component.scan.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("spring.basic.beans.component.scan.auto")
@Configuration
public class App {

	//http://www.javarticles.com/2016/01/spring-componentscan-annotation-example.html
	//http://www.logicbig.com/how-to/code-snippets/jcode-spring-framework-componentscan/
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(App.class);
		ctx.refresh();
		
		CustomerService cust = (CustomerService) ctx.getBean("customerService");
		System.out.println(cust);

		((AnnotationConfigApplicationContext) ctx).close();
	}

}
