package spring.basic.inject.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("./spring/basic/inject/autowired/spring.xml");

		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		Shape t1 = (Shape) context.getBean("triangle");
		t1.draw();
	}

}