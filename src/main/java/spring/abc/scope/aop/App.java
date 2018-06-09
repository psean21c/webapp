package spring.abc.scope.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;


public class App {

	public static void main(String[] args) {
		
		// https://www.javadoc.io/doc/org.springframework/spring-web/5.0.6.RELEASE
		// By default, the configuration will be taken from "/WEB-INF/applicationContext.xml" for the root context
		ApplicationContext ctx = new XmlWebApplicationContext();
		String location = "./spring/abc/scope/aop/springScope.xml";
		ctx.getResource(location);
		UserManager userManager = (UserManager) ctx.getBean(UserManager.class);

		String name = userManager.getName();
		System.out.println(name);
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
