package com.jspiders.multithreading.resource;

public class Food {
 
	private boolean available ;
	public synchronized void order() {
		System.out.println("Order is recived");
		
		if(available) {
			System.out.println("order deliverd");
			
		}else {
			System.out.println("order is not available");
			System.out.println("wait for some timme!!!!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(available) {
				System.out.println("order is deliverd");
			}
		}
	}
	
	public synchronized void prepare() {
		System.out.println("order is being prepared");
		System.out.println("order is ready");
		available = true;
		notify();
	}
}
   