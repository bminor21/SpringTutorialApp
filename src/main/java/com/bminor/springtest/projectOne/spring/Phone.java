package com.bminor.springtest.projectOne.spring;

public class Phone {
	
	public enum PhoneType { HOME, MOBILE, WORK } 
	
	private String phoneNumber;
	private PhoneType phoneType;
	
	public Phone(){}
	
	public Phone(String number, PhoneType phoneType ){
		this.phoneNumber = number;
		this.phoneType = phoneType;
	}
	
	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + ", phoneType=" + phoneType + "]";
	}
	
	/* Getters and Setters */

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PhoneType getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}
	
	
}
