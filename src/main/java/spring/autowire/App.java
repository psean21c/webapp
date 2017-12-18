package spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.autowire.MovieRecommender;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("./spring/autowire/spring.xml");
		MovieRecommender recommender = (MovieRecommender) context.getBean("recommender");
		recommender.write();
	}

}