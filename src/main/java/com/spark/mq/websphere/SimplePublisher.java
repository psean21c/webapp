package com.spark.mq.websphere;

import javax.jms.JMSException;
import javax.jms.Session;

import com.ibm.jms.JMSMessage;
import com.ibm.jms.JMSTextMessage;
import com.ibm.mq.jms.JMSC;
import com.ibm.mq.jms.MQTopic;
import com.ibm.mq.jms.MQTopicConnection;
import com.ibm.mq.jms.MQTopicConnectionFactory;
import com.ibm.mq.jms.MQTopicPublisher;
import com.ibm.mq.jms.MQTopicSession;
import com.ibm.mq.jms.MQTopicSubscriber;

public class SimplePublisher {

	public static void main(String[] args) {
		try {
		      MQTopicConnectionFactory cf = new MQTopicConnectionFactory();

		      // Config
		      cf.setHostName("tcp://localhost");
		      cf.setPort(1463);
		      cf.setTransportType(JMSC.MQJMS_TP_CLIENT_MQ_TCPIP);
		      cf.setQueueManager("TBKS2");
		      cf.setChannel("TBKS2.ERDSFX.N2");

		      MQTopicConnection connection = (MQTopicConnection) cf.createTopicConnection();
		      MQTopicSession session = (MQTopicSession) connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		      MQTopic topic = (MQTopic) session.createTopic("topic://foo");
		      MQTopicPublisher publisher =  (MQTopicPublisher) session.createPublisher(topic);
		      MQTopicSubscriber subscriber = (MQTopicSubscriber) session.createSubscriber(topic);      

		      long uniqueNumber = System.currentTimeMillis() % 1000;
		      JMSTextMessage message = (JMSTextMessage) session.createTextMessage("SimplePubSub "+ uniqueNumber);     

		      // Start the connection
		      connection.start();

		      publisher.publish(message);
		      System.out.println("Sent message:\\n" + message);

		      JMSMessage receivedMessage = (JMSMessage) subscriber.receive(10000);
		      System.out.println("\\nReceived message:\\n" + receivedMessage);

		      publisher.close();
		      subscriber.close();
		      session.close();
		      connection.close();

		      System.out.println("\\nSUCCESS\\n");
		    }
		    catch (JMSException jmsex) {
		      System.out.println(jmsex);
		      System.out.println("\\nFAILURE\\n");
		    }
		    catch (Exception ex) {
		      System.out.println(ex);
		      System.out.println("\\nFAILURE\\n");
		    }
		  }

}
