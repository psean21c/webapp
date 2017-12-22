package spring.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//https://www.tutorialspoint.com/spring/aspectj_based_aop_appoach.htm

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./spring/aspectj/aspectj.xml");

		Student student = (Student) context.getBean("student");
		student.getName();
		student.getAge();

		student.printThrowException();

	}
}