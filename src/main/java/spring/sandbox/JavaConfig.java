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
//		Bar bar = new Bar();
		bar.setName("bar1");
		return bar;
	}
	
}
