package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.creational.Contact;
import com.jspiders.designpatterns.creational.ContactBuilder;

public class ContactMain {

	public static void main(String[] args) {
		Contact contact = new ContactBuilder().setFirstName("Harshal").setMobile(9309816998l).contactBuild();
		System.out.println(contact);
	}
	
}
