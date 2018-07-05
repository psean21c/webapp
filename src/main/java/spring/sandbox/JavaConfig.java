package spring.sandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Autowired
	Bar bar;
	
	@Bean
	public Bar bar() {
//		AppConfig bar = new AppConfig();
		bar.setName("bar1");
		return bar;
	}
	
}
