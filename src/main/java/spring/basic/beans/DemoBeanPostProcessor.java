package spring.basic.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before Bean[" + beanName + "] created:" + bean.toString());
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After Bean[" + beanName + "] created:" + bean.toString());
		return bean;
	}

}
