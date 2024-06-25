package serviceimplementation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Car;
import service.CarRentalService;

public class CarRentalServiceImpln implements CarRentalService   
{
    ArrayList<Car> l1=new ArrayList<Car>();
    Scanner s=new Scanner(System.in);
	public void addCar()
	{
		System.out.println("Enter Your Car Id:");
		int cid=s.nextInt();
		System.out.println("Enter Car Brand Name:");
		String brand=s.next();
		System.out.println("Enter Color Of Car:");
		String color=s.next();
		System.out.println("Enter The Price:");
		double price=s.nextDouble();
		System.out.println("Enter Fuel Type:");
		String ft=s.next();
		System.out.println("Enter The modal:");
		int model=s.nextInt();
		System.out.println("Enter The Milage:");
		int milage=s.nextInt();
	    l1.add(new Car(cid, brand, color, price, ft, model, milage));
		System.out.println("====details Had Been Saved====");
		
	}

	public void allDetails() 
	{
		System.out.println("=======Car Details======");
		int c=0;
		for(Car ele:l1)
		{
			System.out.println(ele);
			c++;
		}
		if(c==0)
		{
			System.out.println("No Data Found");
		}
		
		
	}

	@Override
	public void findByCarId()
	{
		System.out.println("Please enter car id:");
		int id=s.nextInt();
		int c=0;
		for (Car c1 : l1) 
		{
			if(c1.getCid()==id)
			{
				System.out.println(c1);
				c++;
				break;
			}
		}
		if(c==0)
		{
			System.out.println("Car Id Not Found");
		}
			
		
		
	}

	@Override
	public void sortCarById()
	{
		Collections.sort(l1);
		System.out.println("==================Car Details Are================");
		int c=0;
		for(Car ele:l1)
		{
			System.out.println(ele);
			c++;
		}
		if(c==0)
		{
			System.out.println("No Data Found");
		}
		
		
	}

	public void sortCarByPrice() 
	{
	  Collections.sort(l1,new BasedOnPrice());
	  System.out.println("=======Car Details======");
		int c=0;
		for(Car ele:l1)
		{
			System.out.println(ele);
			c++;
		}
		if(c==0)
		{
			System.out.println("No Data Found");
		}
		
	}

	public void sortCarByFuelType() 
	{
		  Collections.sort(l1,new BasedOnFuel());
		  System.out.println("=======Car Details======");
			int c=0;
			for(Car ele:l1)
			{
				System.out.println(ele);
				c++;
			}
			if(c==0)
			{
				System.out.println("No Data Found");
			}
	}
			
		
	}





	
		
	


