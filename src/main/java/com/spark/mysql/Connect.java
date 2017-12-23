package com.spark.mysql;

import java.sql.Connection;
import java.sql.DriverManager;


// Need to import mysql-connector-java-.5.1.45.jar

public class Connect {
	public static void main(String[] args) {
		Connection conn = null;

		try {

//			String url = "jdbc:mysql://192.168.40.139:3306/spring";
			String url = "jdbc:mysql://localhost:3306/spring";
			String user = "spark";
			String password = "spark123";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user,password);
			System.out.println("Database connection established");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Database connection failed:" + e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
					System.out.println("Database connection terminated");
				} catch (Exception e) {
					System.out.println("Ignoring closing error:");
				}
			}
		}
	}
}