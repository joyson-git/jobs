package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
   
	private static Connection connection;
	public static Connection getConn() {
		try {
			
			if(connection==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobs","root","root123");
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
}
