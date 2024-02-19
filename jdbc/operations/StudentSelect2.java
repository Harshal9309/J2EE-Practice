package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentSelect2 {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void main(String[] args) {
		try {
			openConnection();
			statement = connection.createStatement();
			query = "SELECT * FROM student WHERE name LIKE '%jay%' ";
			resultSet= statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1)+ " ");
				System.out.print(resultSet.getString(2) +" ");
				System.out.print(resultSet.getString(3)+ " ");
				System.out.print(resultSet.getString(4)+ " ");
				System.out.println();
			}
		} catch (Exception e) {
			
		}
	}
	
	private static void openConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4","root", "root") ;
	}
	
	private static void closeConnection() throws SQLException {
		if(statement != null) {
			statement.close();
		}
		if(connection != null) {
			connection.close();
		}
	}
}
