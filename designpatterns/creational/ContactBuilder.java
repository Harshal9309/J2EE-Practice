package com.jspiders.designpatterns.creational;

public class ContactBuilder {

	private String firstName;
	private String lastName;
	private long mobile;
	private long work;
	private long home;
	private long landLine;
	private String email;
	private String website;
	private String address;
	
	public ContactBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public ContactBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public ContactBuilder setMobile(long mobile) {
		this.mobile = mobile;
		return this;
	}
	public ContactBuilder setWork(long work) {
		this.work = work;
		return this;
	}
	public ContactBuilder setHome(long home) {
		this.home = home;
		return this;
	}
	public ContactBuilder setLandLine(long landLine) {
		this.landLine = landLine;
		return this;
	}
	public ContactBuilder setEmail(String email) {
		this.email = email;
		return this;
	}
	public ContactBuilder setWebsite(String website) {
		this.website = website;
		return this;
	}
	public ContactBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	
	public Contact contactBuild() {
		return new Contact(firstName, lastName, mobile, work, home, landLine, email, website, address);
	}
	
	
}
