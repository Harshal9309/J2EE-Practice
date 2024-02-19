package com.jspiders.designpatterns.main;

import java.util.Scanner;

import com.jspiders.designpatterns.creational.Beverage;
import com.jspiders.designpatterns.creational.GingerTea;
import com.jspiders.designpatterns.creational.GreenTea;
import com.jspiders.designpatterns.creational.LemonTea;
import com.jspiders.designpatterns.creational.MasalaTea;

public class BeverageMain {

	public static void main(String[] args) {
		try {
			BeverageMain().order();
		} catch (Exception e) {
			System.out.println("No tea is orderd");
			e.printStackTrace();
		}
	}
	
	public static Beverage BeverageMain() {
		Beverage beverage = null;
		System.out.println("enter 1 to order masala tea\n enter 2 to order lemon tea \n enter 3 to order green tea\n enter 4 to order guinger tea");
		System.out.println("Enter your choice : ");
		Scanner  scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		switch(choice) {
		case 1 : 
			beverage = new MasalaTea();
			break;
		case 2 :
			beverage = new LemonTea();
			break;
		case 3 :
			beverage = new GreenTea();
			break;
		case 4 :
			beverage = new GingerTea();
			break;
		default :
			System.out.println("Invalid choice");
		
		}
		return beverage;
	}
}
