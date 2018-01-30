package com.spark.activemq;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Producer {

	public static void main(String[] args) {
		try {
			// Create a ConnectionFactory
			ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://192.168.40.144:61616");

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
