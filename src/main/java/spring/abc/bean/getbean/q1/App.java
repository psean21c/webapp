package spring.abc.bean.getbean.q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./spring/abc/bean/getbean/q1/beanQ1.xml");
		Foo foo = (Foo) ctx.getBean("foo");
		System.out.println( "foo=" + foo.getName());
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
