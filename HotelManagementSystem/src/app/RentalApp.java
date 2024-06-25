package app;

import java.util.Scanner;

import serviceImplementation.RentalServiceImpln;
import services.RentalService;

public class RentalApp {
	public static void main(String[] args) {
		System.out.println("=============Welcome To Room Rental Application================");
		Scanner s=new Scanner(System.in);
		RentalService r1=new RentalServiceImpln();
		while(true)
		{
			System.out.println("=====Menu====");
			System.out.println("1.Info\n2.Rooms Available\n3.Check-In\n4.Check-Out\n5.Customer Details\n6.Exit");
			System.out.println("Enter Your Option:");
			int op=s.nextInt();
			switch(op)
			{
			case 1:r1.info();
			       break;
			case 2:r1.roomsAvailable();
			       break;
			case 3:r1.checkIn();break;  
			case 4:r1.checkOut();break;
			case 5:r1.customerDetails();break;
			case 6:System.out.println("=====Thank You Visit Again=====");
			       System.exit(0);
				default:System.out.println("Invalid Option:-");
			}
		}
	}

}
