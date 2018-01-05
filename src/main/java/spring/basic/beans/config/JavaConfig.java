package spring.basic.beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public DataSource dataSourceDevelopment() {
		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1/test");
		dataSource.setUsername( "username");
		dataSource.setPassword("password");
		return dataSource;
	}
	
}
