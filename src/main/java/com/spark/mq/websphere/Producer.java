package com.spark.mq.websphere;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.ibm.mq.jms.MQQueueConnectionFactory;

public class Producer {

	public static void main(String[] args) {
		try {
			// Create a ConnectionFactory
			MQQueueConnectionFactory factory = new MQQueueConnectionFactory();
			String host = "localhost";
			String port = "1463";
	        factory.setHostName(host);
	        factory.setPort(Integer.parseInt(port));

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
