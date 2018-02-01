package com.spark.mq.websphere;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.ibm.mq.jms.MQConnectionFactory;
import com.ibm.mq.jms.MQQueueConnectionFactory;

public class Producer {

	//https://hursleyonwmq.wordpress.com/2007/05/29/simplest-sample-applications-using-websphere-mq-jms/
	// API file:///C:/Program%20Files%20(x86)/IBM/WebSphere%20MQ/java/doc/WMQJMSClasses/index.html
	
	public static void main(String[] args) {
		try {
			/***
			// Create a ConnectionFactory
			MQQueueConnectionFactory factory = new MQQueueConnectionFactory();
			String host = "localhost";
			String port = "1463";
	        factory.setHostName(host);
	        factory.setPort(Integer.parseInt(port));

			// Create a connection
			Connection conn = factory.createConnection();
			conn.start();
	        **/
			//MQQueueConnectionFactory factory = new MQQueueConnectionFactory("tcp://192.168.40.144:61616");
			MQQueueConnectionFactory factory = new MQQueueConnectionFactory();
//			factory.setLocalAddress("localhost");
//			factory.setPort(1463);
//			factory.setQueueManager("TBKS2");
//			factory.setChannel("TBKS2.ERDSFX.N2");

			 MQConnectionFactory cf = new MQConnectionFactory();
			 //CommonConstants.WMQ_CONNECTION_MODE;
			 
//			    assertThat(cf.getIntProperty(CommonConstants.WMQ_CONNECTION_MODE), 
//			    		is(equalTo(CommonConstants.WMQ_CM_BINDINGS)));
//			    cf.setIntProperty(CommonConstants.WMQ_CONNECTION_MODE, CommonConstants.WMQ_CM_CLIENT);
//			    assertThat(cf.getIntProperty(CommonConstants.WMQ_CONNECTION_MODE),
//			    		is(equalTo(CommonConstants.WMQ_CM_CLIENT)));
//			}
		
			String host = "localhost";
			String port = "1463";
	        factory.setHostName(host);
	        factory.setPort(Integer.parseInt(port));
			factory.setQueueManager("TBKS2");
			factory.setChannel("TBKS2.ERDSFX.N2");
			
			// Create a connection
			Connection conn = factory.createConnection();
			conn.start();
			
			
			// Create a Session
			Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);

			// Create a destination (Topic / Queue)
			Destination dest1 = session.createQueue("HELLO.Q");
			MessageProducer producer = session.createProducer(dest1);
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

			String txt = "Hello World! " + Thread.currentThread().getName();
			TextMessage message = session.createTextMessage(txt);

			producer.send(message);

			session.close();
			conn.close();
			
		} catch (JMSException e) {
			System.out.println(" JMS Error:" + e);
		} catch (Exception e){
			System.out.println(" Error:" + e);
		}
	}

}
