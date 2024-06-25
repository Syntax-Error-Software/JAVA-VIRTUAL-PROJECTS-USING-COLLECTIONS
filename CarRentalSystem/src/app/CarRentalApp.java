package app;

import java.util.Scanner;

import service.CarRentalService;
import serviceimplementation.CarRentalServiceImpln;

public class CarRentalApp {
	public static void main(String[] args) {
		System.out.println("============Welcome To CarRentalApp============");
		CarRentalService c1=new CarRentalServiceImpln();  // upcasting
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("============Menu==========");
			System.out.println("1.Add Car\n2.AllDetails\n3.Find Car By Id\n4.Sort Car By Id\n5.BasedOnPrice\n6.BasedOnFuel\n7.Exit");
			System.out.println("Enter Your Option:");
			int op=s.nextInt();
			switch(op)
			{
			   case 1:c1.addCar(); 
				     break;
			   case 2:c1.allDetails();
			          break;
			   case 3:c1.findByCarId();
			          break;
			   case 4:c1.sortCarById();
			          break;
			   case 5:c1.sortCarByPrice();
			          break;       
			   case 6:c1.sortCarByFuelType();
			          break;
			   case 7:System.out.println("=========Thank You Visit Again==========");
			       System.exit(0);
			       break;
			   default:System.out.println("Invalid Option");
			}
		}
	}

}
