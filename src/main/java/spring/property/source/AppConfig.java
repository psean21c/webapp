package spring.property.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:spring/property/source/source.properties")
public class AppConfig {

	@Autowired
	Environment env;
	
	@Bean
	public TestBean testBean(){
		TestBean testBean = new TestBean();
		testBean.setName(env.getProperty("testbean.name"));
		return testBean;
	}
}
