package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.MyResource;

public class Mythread6 extends Thread {
 
	private MyResource myResource;

	public Mythread6(MyResource myResource) {
		this.myResource = myResource;
	}

	@Override
	public void run() {
		synchronized (myResource.resource1) {
			System.out.println("Lock is applied on Resource1 by Thread6");
			
			synchronized (myResource.resource2) {
				System.out.println("Lock is applied on Resource2 by Thread6");
			}
		}
		}
	}

