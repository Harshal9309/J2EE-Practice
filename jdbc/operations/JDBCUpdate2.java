package com.jspiders.jdbc.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCUpdate2 {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the email to be updated");
		String email = scanner.nextLine();
		System.out.println("Enter the id");
		int id = scanner.nextInt();
		try {
			openConnection();
			query = "UPDATE user SET email = ? WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setInt(2, id);
			int res = preparedStatement.executeUpdate();
			System.out.println("Email updated");
			System.out.println(res + "row(s) Affected");
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
		
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if(connection != null) {
			connection.close();
		}
	}
}
