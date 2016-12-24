package com.bminor.maven.projectOne.LearnMaven;

public class Person {
	
	private int id;
	private String name;
	
	private int taxId;
	private Address address;
	
	public static Person getInstance(int id, String name){
		System.out.println("Creating person using Factory MEthod");
		return new Person(id, name);
	}

	public Person() {}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	public void speak()
	{
		System.out.println("Hello");
	}
}
