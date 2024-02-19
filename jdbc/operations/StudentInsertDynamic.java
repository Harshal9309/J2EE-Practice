package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentInsertDynamic {

	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no student want to add");
		int student =scanner.nextInt();
		try {
			openCoonection();
			for (int i = 0; i < student; i++) {
				System.out.println("Enter the user id");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Student Name");
				String name = scanner.nextLine();
				System.out.println("Enter the Student Email");
				String email = scanner.nextLine();
				System.out.println("Enter student age");
				int age = scanner.nextInt();
				query = "INSERT INTO student VALUES (?,?,?,?)";
				preparedStatement=connection.prepareStatement(query);
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, email);
				preparedStatement.setInt(4, age);
			    preparedStatement.executeUpdate();
				
			}
			System.out.println(student + "row(s) Affected");
			
		} catch (Exception e) {
			try {
				closeConnection();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}finally {
				try {
					closeConnection();
					scanner.close();
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
		if(preparedStatement != null) {
			preparedStatement.close();
		}
	}
}
