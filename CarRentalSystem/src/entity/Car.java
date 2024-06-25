package entity;

import java.util.Comparator;

public class Car implements Comparable<Car> {
	private int cid;
	private String brand;
	private String color;
	private double price;
	private String fuelType;
	private int model;
	private int milage;
	
	public Car(int cid, String brand, String color, double price, String fuelType, int model, int milage) {
		super();
		this.cid = cid;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.fuelType = fuelType;
		this.model = model;
		this.milage = milage;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", brand=" + brand + ", color=" + color + ", price=" + price + ", fuelType="
				+ fuelType + ", model=" + model + ", milage=" + milage + "]";
	}

	@Override
	public int compareTo(Car arg0)
	{
		if(this.cid>arg0.getCid())
		{
			return 1;
		}
		else if(this.cid<arg0.getCid())
		{
			return -1;
		}
		return 0;
	}	

}
//class BasedOnPrice implements Comparator<Car>
//{
//
//	@Override
//	public int compare(Car a1, Car a2) {
//		
//	 if(a1.getPrice()>a2.getPrice())
//	 {
//		 return 1;
//	 }
//	 else if(a1.getPrice()<a2.getPrice())
//	 {
//		 return -1;
//	 }
//	 return 0;
//	}
//	
//}
//class BasedOnFuel implements Comparator<Car>
//{
//
//	@Override
//	public int compare(Car arg0, Car arg1) {
//		return arg0.getFuelType().compareTo(arg1.getFuelType()) ;
//	}
//	
//}
