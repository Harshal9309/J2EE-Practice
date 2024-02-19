package com.jspiders.jdbc.loginlogout;

import java.util.Scanner;

public class JDBCMain {

	public static void main(String[] args) {
		System.out.println("Enter 1 to SingUp\nEnter 2 Login\nEnter 3 to Exit");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		boolean flag = true;
		while(flag) {
			switch (choice) {
			case 1:JDBCService.singUp(scanner);
				break;
			case 2:JDBCService.login(scanner);
				break;
			case 3:
				flag=false;
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
