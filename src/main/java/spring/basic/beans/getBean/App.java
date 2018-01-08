package spring.basic.beans.getBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		/***
		 * <T> T 	getBean(java.lang.Class<T> requiredType)
		 * <T> T 	getBean(java.lang.Class<T> requiredType, java.lang.Object... args)
		 * Object 	getBean(java.lang.String name)
		 * <T> T 	getBean(java.lang.String name, java.lang.Class<T> requiredType)
		 * Object 	getBean(java.lang.String name, java.lang.Object... args)
		 * 
		 */
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"./spring/basic/beans/getBean/springGetBean.xml");
		
//		Person person1 = ctx.getBean(Person.class);
//		System.out.println("person1=" + person1);
		
//		Person person2 = ctx.getBean(Person.class, Person.getInstance(0, null));
//		System.out.println("person2=" + person2);
//
		Person person2 = ctx.getBean(Person.class, new Person(),new Person(1,"Phil Kulh"));
		System.out.println("person2=" + person2);
//
//		Person person3 = (Person) ctx.getBean("person1");
//		System.out.println("person3=" + person3);
//
//		Person person4 = ctx.getBean("person4", Person.class);
//		System.out.println("person4=" + person4);
		
		
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
