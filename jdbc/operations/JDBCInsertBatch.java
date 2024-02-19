package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertBatch {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) {
		
		try {
			openConnection();
			query = "INSERT INTO user VALUES (?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter hw many records you want insert?");
			int count = scanner.nextInt();
			for (int i = 1; i <= count; i++) {
				System.out.println("Enter the user id");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter the User Name");
				String name = scanner.nextLine();
				System.out.println("Enter the User Email");
				String email = scanner.nextLine();
				System.out.println("Enter the Password");
				String password = scanner.nextLine();
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, email);
				preparedStatement.setString(4, password);
				preparedStatement.addBatch();
			}
			
			scanner.close();
			int[] res = preparedStatement.executeBatch();
			System.out.println(res.length + "row(s) Inserted");
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
