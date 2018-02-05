package com.spark.mq.activemq.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
//import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQConnectionFactoryConfiguration;
//$PooledConnectionFactoryConfiguration

public class Publish {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("./com/spark/mq/websphere/spring/activemq.xml");
		
//		JmsTemplate 
		JmsTemplate template = (JmsTemplate) ctx.getBean("jmsTemplate");

//		ActiveMQConnectionFactoryConfiguration bar = (ActiveMQConnectionFactoryConfiguration) ctx.getBean("connectionFactory");
//		System.out.println( "bar=" + bar.getName() + ",foo=" + bar.getFoo().getName());
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
