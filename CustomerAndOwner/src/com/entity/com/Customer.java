package com.entity.com;

public class Customer {
	 String name;
	 long phno;
	 int age;
	 String email;
	 Address a;
	public Customer(String name, long phno, int age, String email, Address a) {
		
		this.name = name;
		this.phno = phno;
		this.age = age;
		this.email = email;
		this.a = a;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phno=" + phno + ", age=" + age + ", email=" + email + ", a=" + a + "]";
	}
	 
	
	
	
	

}
