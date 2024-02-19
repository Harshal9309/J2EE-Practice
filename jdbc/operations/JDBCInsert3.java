package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCInsert3 {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user id");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enetr the User Name");
		String name = scanner.nextLine();
		System.out.println("Enetr the User Email");
		String email = scanner.nextLine();
		System.out.println("Enetr the User Password");
		String password = scanner.nextLine();
		scanner.close();
		
		try {
			openConnection();
			query = "INSERT INTO user VALUES (?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
			int res = preparedStatement.executeUpdate();
			System.out.println(res + " row(s) Affetcted");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void openConnection() throws  SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4","root", "root");
		
	}
	
	private static void closeConnection() throws SQLException{
		
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if(connection != null) {
			connection.close();
		}
	}
}
