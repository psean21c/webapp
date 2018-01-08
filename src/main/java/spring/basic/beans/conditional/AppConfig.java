package spring.basic.beans.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
    @Bean
    @Conditional(LocaleConditionUSA.class)
    public MyService myBeanA () {
        return new MyServiceA();
    }

    @Bean
    @Conditional(LocaleConditionCanada.class)
    public MyService myBeanB () {
        return new MyServiceB();
    }

    @Bean
    public ClientBean clientBean () {
        return new ClientBean();
    }
}