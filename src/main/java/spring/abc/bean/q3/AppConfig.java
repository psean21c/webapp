package spring.abc.bean.q3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public MyServiceImpl myService(){
		return new MyServiceImpl();
	}
	
}
