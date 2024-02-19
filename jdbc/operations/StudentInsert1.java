package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsert1 {
	
	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	public static void main(String[] args) {
		try {
			openCoonection();
			statement = connection.createStatement();
			query = "INSERT INTO student VALUES(5,'Vijay','vijay312@gmail.com',27)";
			statement.executeUpdate(query);
			System.out.println("Student inserted Succesfully");
		} catch (Exception e) {
			try {
				closeConnection();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}finally {
				try {
					closeConnection();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	private static void openCoonection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&&password=root");
		
	}
	
	private static void closeConnection() throws SQLException {
		if(connection != null) {
			connection.close();
		}
		if(statement != null) {
			statement.close();
		}
	}
}
