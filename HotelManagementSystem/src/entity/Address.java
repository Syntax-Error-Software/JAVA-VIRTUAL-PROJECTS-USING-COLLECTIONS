package entity;

public class Address {
	 private String houseNo;
	 private String streetName;
	 private int pincode;
	public Address(String houseNo, String streetName, int pincode) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.pincode = pincode;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetName=" + streetName + ", pincode=" + pincode + "]";
	}
	 
	
}
