package com.bminor.springtest.projectOne.spring;

import java.util.*;

import com.bminor.springtest.projectOne.spring.Phone.PhoneType;

public class Person {
	
	private int id;
	private String name;
	
	private int taxId;
	private Address address;
	
	private Map<PhoneType, Phone> phoneNumbers;
	
	public static Person getInstance(int id, String name){
		return new Person(id, name);
	}

	public Person() {}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		phoneNumbers = new HashMap<PhoneType, Phone>();
	}
	
	public void onCreate(){
		System.out.println("Person created: " + this );
	}
	
	public void onDestroy(){
		System.out.println("Person destroyed");
	}
	
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Map<PhoneType, Phone> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Map<PhoneType, Phone> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + ", phoneNumbers="
				+ phoneNumbers + "]";
	}
}
