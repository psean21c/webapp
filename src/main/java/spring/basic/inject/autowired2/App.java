package spring.basic.inject.autowired2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.autowire.MovieRecommender;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 1) configured in spring.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("./spring/basic/inject/autowired2/spring.xml");
		Foo foo = (Foo) context.getBean("foo");
		foo.write();

	}

}