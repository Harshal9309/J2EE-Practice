package com.jspiders.designpatterns.structural;

public class Adapter extends Employee implements Event {

	@Override
	public void WomensDay() {
		System.out.println("Chief Guest of the womens day event is " +getName());
	}

	@Override
	public void mensDay() {
		System.out.println("Chief Guest of the mens day event is " +getName());
	}

}
