package spring.property.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.property.xml.Doe;
import spring.property.xml.Tao;

import java.lang.String;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/property/xml/springDoe.xml");
		
		Doe doe = (Doe) ctx.getBean("doe");
		Tao tao = doe.getTao();
		System.out.println("tao:" + tao.toString() + "," + tao.getSeq() + "");
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
