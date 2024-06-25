package com.entity.com;

public class MainClass {
	public static void main(String[] args) {
		Address a1=new Address("#3-72", "G PALYA", "KA", 560029);
		Owner o1=new Owner("Nandu", 951522551, 23, "nandu@123", a1);
		System.out.println(o1);
	}

}
