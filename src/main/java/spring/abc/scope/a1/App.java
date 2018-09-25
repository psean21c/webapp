package spring.abc.scope.a1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App {

	public static void main(String[] args) {

		System.out.println("Singleton vs. Prototype");

		ApplicationContext ctx =  new FileSystemXmlApplicationContext( "classpath:./spring/abc/scope/a1/springScope.xml");

		// 1) ModelSingleton : singleton
		ModelSingleton modelSingleton = (ModelSingleton) ctx.getBean("modelSingleton");
		String name = modelSingleton.getName();
		System.out.println(name + ":" + modelSingleton.getCount());
		
		// 2) ModelSingleton : singleton
		ModelSingleton modelSingleton2 = (ModelSingleton) ctx.getBean("modelSingleton");
		String name2 = modelSingleton2.getName();
		System.out.println(name2 + ":" + modelSingleton2.getCount());
		
		// 3) ModelPrototype : prototype
		ModelPrototype modelPrototype1 = (ModelPrototype) ctx.getBean("modelPrototype");
		String user1 = modelPrototype1.getPreferName();
		System.out.println(user1 + ":" + modelPrototype1.getCount());

		// 4) ModelPrototype : prototype
		ModelPrototype modelPrototype2 = (ModelPrototype) ctx.getBean("modelPrototype");
		String user2 = modelPrototype2.getPreferName();
		System.out.println(user2 + ":" + modelPrototype2.getCount());
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
