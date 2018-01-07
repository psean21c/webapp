package spring.basic.beans.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/basic/beans/constructor/springConstructor.xml");
		Person john = (Person) ctx.getBean("john");

		System.out.println( "idx=" + john.toString());
		 john.talk();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
