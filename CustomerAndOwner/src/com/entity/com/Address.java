package com.entity.com;

public class Address {
	String houseNo;
	String streetName;
	String state;
	int pincode;
	public Address(String houseNo, String streetName, String state, int pincode) {
		
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetName=" + streetName + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	

}
