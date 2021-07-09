package com.tahir.project.tahirproject.model;

public class CustomerDetails {

	private int customerId;
	private String name;
	private int age;
	
	public CustomerDetails(int customerId, String name, int age) {
		this.customerId = customerId;
		this.name = name;
		this.age = age;
	}
	
	public CustomerDetails() {
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "customerDetails [customerId=" + customerId + ", name=" + name + ", age=" + age + "]";
	}
}
