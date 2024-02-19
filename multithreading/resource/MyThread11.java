package com.jspiders.multithreading.resource;

public class MyThread11 extends Thread{

	@Override
	public void run() {
		String message = "Java is a Programing Language";
		char[] charArray = message.toCharArray();
		
		for(int i = 0; i < charArray.length; i++) {
			
			System.out.print(charArray[i]);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
	}
}
