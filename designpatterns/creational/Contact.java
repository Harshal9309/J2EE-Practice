package com.jspiders.designpatterns.creational;

public class Contact {

	private String firstName;
	private String lastName;
	private long mobile;
	private long work;
	private long home;
	private long landLine;
	private String email;
	private String website;
	private String address;
	
	public Contact(String firstName, String lastName, long mobile, long work, long home, long landLine, String email,
			String website, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.work = work;
		this.home = home;
		this.landLine = landLine;
		this.email = email;
		this.website = website;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile + ", work=" + work
				+ ", home=" + home + ", landLine=" + landLine + ", email=" + email + ", website=" + website
				+ ", address=" + address + "]";
	}
	
	
	
}
