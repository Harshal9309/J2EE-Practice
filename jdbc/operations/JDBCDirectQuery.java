package com.jspiders.jdbc.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDirectQuery {

	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String query;
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Query you Want");
		try {
			openConnection();
			statement = connection.createStatement();
			query = scanner.nextLine();
			resultSet= statement.executeQuery(query);
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void openConnection() throws IOException, SQLException {
		File file = new File("D:File/db_info.txt");
		FileReader fileReader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(fileReader);
		connection = DriverManager.getConnection(properties.getProperty("url"), properties);
	}
	
	private static void closeConnection() throws SQLException{
		
		if(resultSet != null) {
			resultSet.close();
		}
		if (statement != null) {
			statement.close();
		}
		if(connection != null) {
			connection.close();
		}
	}
}
