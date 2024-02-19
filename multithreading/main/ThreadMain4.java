package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.MyResource;
import com.jspiders.multithreading.thread.MyThread7;
import com.jspiders.multithreading.thread.Mythread6;

public class ThreadMain4 {

	public static void main(String[] args) {
		
		MyResource myResource = new MyResource();
		Mythread6 mythread6 = new Mythread6(myResource);
		MyThread7 myThread7 = new MyThread7(myResource);
		
		mythread6.start();
		myThread7.start();
	}
}
