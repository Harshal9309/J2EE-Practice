package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Food;
import com.jspiders.multithreading.thread.Customer;
import com.jspiders.multithreading.thread.Restarunt;

public class ThradMain9 {

	public static void main(String[] args) {
		 Food food = new Food();
		 
		 Customer customer = new Customer(food);
		 customer.start();
		 
		 Restarunt restarunt = new Restarunt(food);
		 restarunt.start();
	}
}
