package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {


	public static void main(String[] args) throws SQLException {
//		load or register the driver
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
//		Open the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&&password=root");
		
//		create the statement
		Statement statement = connection.createStatement();
		
//		Execute the statement
		statement.execute("INSERT INTO user VALUES (4,'Gaurav','gaurav123@gmail.com','gaurav123')");
		 
//		Process the result
		System.out.println("Data inserted");
		
//		Close the connection
		
		statement.close();
		connection.close();
		
//		De-register Driver
		DriverManager.deregisterDriver(driver);
		
	}
	
}
