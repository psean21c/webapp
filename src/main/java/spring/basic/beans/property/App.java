package spring.basic.beans.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.basic.beans.property.Doe;
import spring.basic.beans.property.Tao;

import java.lang.String;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/basic/beans/property/springDoe.xml");
		
		Doe doe = (Doe) ctx.getBean("doe");
		Tao tao = doe.getTao();
		System.out.println(tao.toString());
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
