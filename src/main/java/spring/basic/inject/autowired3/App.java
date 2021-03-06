package spring.basic.inject.autowired3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 1) configured in spring.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("./spring/basic/inject/autowired3/setinject.xml");
		Foo foo = (Foo) context.getBean("foo");
		foo.write();

	}

}