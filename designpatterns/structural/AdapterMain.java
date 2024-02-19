package com.jspiders.designpatterns.structural;

public class AdapterMain {

	public static void main(String[] args) {
		
		Adapter adapter = new Adapter();
		adapter.setName("Ranu Mondal");
		adapter.WomensDay();
		adapter.setName("Honey Singh");
		adapter.mensDay();
	}
}
