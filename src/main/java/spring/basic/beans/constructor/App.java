package spring.basic.beans.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"./spring/basic/beans/constructor/springConstructor.xml");
		
		Person john = (Person) ctx.getBean("john");
		Person tom = (Person) ctx.getBean("john");
		john.setSinID(50);
		
		System.out.println("john=" + john);
		System.out.println("john=" + tom);
//		john.talk();

		((ClassPathXmlApplicationContext) ctx).close();
	}

}
