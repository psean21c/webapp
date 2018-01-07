package spring.basic.beans.getBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"./spring/basic/beans/getBean/springGetBean.xml");
		
		Person person1 = (Person) ctx.getBean("person1");
		Person person2 = ctx.getBean("person1", Person.class);
		Person person3 = (Person) ctx.getBean("person1");
		Person person4 = (Person) ctx.getBean("person1");

		Person tom =  ctx.getBean(Person.class);
		
		System.out.println("person1=" + person1);
		System.out.println("person1=" + person2);
		System.out.println("person1=" + person3);
		System.out.println("person1=" + person4);
		
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
