package spring.cron;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CronApp {
	// http://websystique.com/spring/spring-4-quartz-scheduler-integration-example/
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("./spring/cron/quartz-context.xml");
		
		try {
			// milisecond : 10000 = 10 seconds
			Thread.sleep(30000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext)context).close();
	}
}
