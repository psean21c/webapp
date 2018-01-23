package spring.abc.bean.q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/abc/bean/q1/beanQ1.xml");
		Bar bar = (Bar) ctx.getBean("bar");
		System.out.println( "bar=" + bar.getName() + ",foo=" + bar.getFoo().getName());
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
