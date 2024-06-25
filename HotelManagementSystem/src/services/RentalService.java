package services;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import entity.Customer;

public interface RentalService {
	ArrayList<Customer> l1=new  ArrayList<Customer>();
	LinkedHashMap<Integer, Customer> nac=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> ac=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> deluxe=new LinkedHashMap<Integer, Customer>();
	void info();
	void roomsAvailable();
	void checkIn(); 
	// check ac/nac/deluxe,room no,validate room
	void checkOut();
	void customerDetails();
	

}
