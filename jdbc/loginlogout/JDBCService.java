package com.jspiders.jdbc.loginlogout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCService {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	
	
	public static void singUp(Scanner scanner) {
		System.out.println("Enter the id");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Username");
		String name = scanner.nextLine();
		System.out.println("Enter the Email");
		String email = scanner.nextLine();
		System.out.println("Enter the User Password");
		String password = scanner.nextLine();
		
		try {
			openConnection();
			query ="INSERT INTO user VALUES (?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
			int res =preparedStatement.executeUpdate();
			if(res ==1) {
				System.out.println("Logged in");
			}else {
				System.out.println("Error");
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
	
	public static void login(Scanner scanner) {
		
		scanner.nextLine();
		System.out.println("Enter the Email");
		String email = scanner.nextLine();
		System.out.println("Enter the User Password");
		String password = scanner.nextLine();
		
		try {
			openConnection();
			query ="SELECT * FROM user WHERE email = ? AND password = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			resultSet =preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println("Logged in");
				System.out.println("Welcome to Application");
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
	private static void openConnection() throws SQLException {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4", "root", "root");
	}
	
	private static void closeConnection() throws SQLException {
		if(preparedStatement != null) {
			preparedStatement.close();
		}
		if(connection != null) {
			connection.close();
		}
		if(resultSet != null) {
			resultSet.close();
		}
	}
}
