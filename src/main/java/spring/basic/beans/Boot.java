package spring.basic.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.basic.beans.DemoBeanPostProcessor;

public class Boot {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/basic/beans/spring2.xml");
		DemoBeanPostProcessor demo = (DemoBeanPostProcessor) ctx.getBean("demo");
		System.out.println(demo);
		demo.postProcessAfterInitialization(demo, "test1");
		demo.postProcessBeforeInitialization(demo, "test1");
	}

}
