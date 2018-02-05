package com.spark.mq.activemq;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumer {

	public static void main(String[] args) {
		try {
			//
			ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://192.168.40.145:61616");

			//
			Connection conn = factory.createConnection();
			conn.start();
			
			//
			Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			// Create a destination 
			Destination dest1 = session.createQueue("HELLO.TESTQ");
			
			// Create a MessageConsumer from the session to the Topic / Queue
			MessageConsumer consumer = session.createConsumer(dest1);
			//consumer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

			Message message = consumer.receive(1000);
			
			if(message instanceof TextMessage){
				TextMessage txt = (TextMessage) message;
				System.out.println("received:" + txt);
			} else {
				System.out.println("received:" + message);
			}

			session.close();
			conn.close();
			
		} catch (JMSException e) {
			System.out.println(" JMS Error:" + e);
		} catch (Exception e){
			System.out.println(" Error:" + e);
		}
	}

}
