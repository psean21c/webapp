package spring.basic.beans.constructor.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"./spring/basic/beans/constructor/list/springList.xml");


		BookBasket johnBooks = (BookBasket) ctx.getBean("basket");
		System.out.println("" + johnBooks.toString());
	}

}
