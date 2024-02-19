package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Food;

public class Restarunt extends Thread{

	private Food food;

	public Restarunt(Food food) {
		this.food = food;
	}
	
	@Override
	public void run() {
		food.prepare();
	}
}
