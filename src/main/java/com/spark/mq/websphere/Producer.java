package com.spark.mq.websphere;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.QueueConnection;
import javax.jms.QueueReceiver;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.ibm.mq.jms.JMSC;
import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQQueueConnectionFactory;

public class Producer {

	//https://hursleyonwmq.wordpress.com/2007/05/29/simplest-sample-applications-using-websphere-mq-jms/
	// API file:///C:/Program%20Files%20(x86)/IBM/WebSphere%20MQ/java/doc/WMQJMSClasses/index.html
	
	public static void main(String[] args) {
		callQueue();
	}
	
    static void callQueue(){
    	System.out.println("call MQ");

    	/***
		JMSException:javax.jms.JMSSecurityException: MQJMS2013: 
		invalid security authentication supplied for MQQueueManager,MQJMS2013: 
		invalid security authentication supplied for MQQueueManager
		>> Need to use system reserved words: SYSTEM.DEF.SVRCONN
    		***/
		String host = "localhost";
		String port = "1414";
		String channel = "SYSTEM.DEF.SVRCONN";
		String queueManager = "QM1";
		String ccsId = "850";
		String queueName = "Q1";
		String userName = "WHO";    			
    	
  	
        MQQueueConnectionFactory queueConnectionFactory = new MQQueueConnectionFactory();

        queueConnectionFactory.setHostName(host);
		try {
			System.out.println("Lab-1:");
			queueConnectionFactory.setPort(Integer.parseInt(port));
			queueConnectionFactory.setChannel(channel);
			queueConnectionFactory.setQueueManager(queueManager);
			queueConnectionFactory.setCCSID(Integer.parseInt(ccsId));
			queueConnectionFactory.setTransportType(JMSC.MQJMS_TP_CLIENT_MQ_TCPIP);

			// 1) Spring
//			UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
//			adapter.setTargetConnectionFactory(queueConnectionFactory);
//			adapter.setUsername(userName);
//			QueueConnection queueConnection = adapter.createQueueConnection();

			// 2) JAVAX JMS
			QueueConnection queueConnection = queueConnectionFactory.createQueueConnection();
			
					
			QueueSession queueSession = queueConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			MQQueue queue = (MQQueue) queueSession.createQueue("queue:///" + queueName);

			QueueSender queueSender = queueSession.createSender(queue);
			TextMessage textMessage = queueSession.createTextMessage();
			System.out.println("Lab-2:" + queueName + " starting");
			queueConnection.start();

			System.out.println("Lab-3:");
			textMessage.setText("message sent-2");
			queueSender.send(textMessage);   
			
			System.out.println("Lab-4:");
			
			QueueReceiver queueReceiver = queueSession.createReceiver(queue);
			Message message = queueReceiver.receive();
//			message.toString();
			
			System.out.println("Lab-5:" + message.toString());

			System.out.println("Lab-6:");
			
	         
		} catch (JMSException e) {
			System.out.println("JMSException:" + e + "," +  e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException:" + e);
		} catch (Exception e) {
			System.out.println("Exception:" + e);
		} finally {
			System.out.println("Lab-finally:");
		}
    	
    }
}
