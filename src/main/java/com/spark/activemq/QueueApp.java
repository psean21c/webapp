package com.spark.activemq;

public class QueueApp {

	public static void main(String[] args) {
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");

		Connection conn = factory.createConnection();
		conn.start();

	}

}
