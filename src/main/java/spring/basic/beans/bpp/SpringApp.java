package spring.basic.beans.bpp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.basic.beans.bpp.DemoBeanPostProcessor;

public class SpringApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/basic/beans/springBPP.xml");
		DemoBeanPostProcessor demo = (DemoBeanPostProcessor) ctx.getBean("demo");
		System.out.println(demo);
		demo.postProcessAfterInitialization(demo, "test2-after");
		demo.postProcessBeforeInitialization(demo, "test1-before");
	}

}
