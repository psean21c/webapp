package spring.basic.beans.conditional;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	//http://www.logicbig.com/tutorials/spring-framework/spring-core/bean-conditional-registration/
	public static void main(String[] args) {

		runApp(Locale.US);
		System.out.println("----------");
//		runApp(Locale.CANADA);
	}

	public static void runApp(Locale locale) {

		/**
		 * In real application, Locale will be set with your machine depending
		 * on your location. Here we are setting it manually to test our example
		 */
		System.out.printf("setting default locale: %s\n", locale);
		Locale.setDefault(locale);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ClientBean bean = context.getBean(ClientBean.class);
		System.out.printf("Injected MyService: %s\n", bean.getMyService().getClass().getSimpleName());
		
		((AnnotationConfigApplicationContext) context).close();
		
	}

}
