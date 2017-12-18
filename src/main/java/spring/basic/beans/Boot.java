package spring.basic.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import spring.basic.beans.Messenger;

public class Boot {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//		Messenger messenger = (Messenger) ctx.getBean("messenger");
//		System.out.println(messenger);
	}

}
