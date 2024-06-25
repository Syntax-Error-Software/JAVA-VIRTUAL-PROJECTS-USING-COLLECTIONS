package serviceImplementation;

import java.util.LinkedHashMap;
import java.util.Scanner;

import entity.Address;
import entity.Customer;
import services.RentalService;

public class RentalServiceImpln implements RentalService {
	{
		
		for(int i=101;i<=108;i++)
		{
			nac.put(i, null);
		}
		for(int i=201;i<=205;i++)
		{
			ac.put(i, null);
		}
		for(int i=301;i<=303;i++)
		{
			deluxe.put(i, null);
		}
	}

	@Override
	public void info() {
		System.out.println("=======Room Details======");
		System.out.println("=========Non AC==========");
		System.out.println("Fan");
		System.out.println("TV");
		System.out.println("Wifi");
		System.out.println("only 2 members");
		System.out.println("2000");
		System.out.println("====================AC===================");
		System.out.println("Fan");
		System.out.println("TV");
		System.out.println("Wifi");
		System.out.println("only 3 members");
		System.out.println("2500");
		System.out.println("====================Deluxe===================");
		System.out.println("Fan");
		System.out.println("TV");
		System.out.println("Wifi");
		System.out.println("Fridge");
		System.out.println("only 3 members");
		System.out.println("3000");
	}

	void checkRooms(LinkedHashMap<Integer, Customer> m,String type)
	{
		System.out.println("==========Room Type "+type+"==========");
		int c=0;
		for(Integer room:m.keySet())
		{
			if(m.get(room)==null)
			{
				System.out.print(room+" ");
				c++;
			}
		}
		System.out.println();
		if(c==0)
		{
			System.out.println("No Rooms Available.........!!!");
		}
	}

	@Override
	public void roomsAvailable() {
     checkRooms(nac,"Non Ac");
     checkRooms(ac,"AC");
     checkRooms(deluxe,"Deluxe");
	}
	void allocate(LinkedHashMap<Integer, Customer> m,String roomType,double roomPrice)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Room Number");
		int roomno=s.nextInt();
		if(m.containsKey(roomno)&&m.get(roomno)==null)
		{
			System.out.println("Enter Customer Id:");
			int cid=s.nextInt();
			System.out.println("Enter Customer Name:");
			String cname=s.next();
			System.out.println("Enter Phno:");
			long phno=s.nextLong();
			System.out.println("Enter Customer House No:");
			String houseNo=s.next();
			System.out.println("Enter Street Name:");
			String streetName=s.next();
			System.out.println("Enter Pincode:");
			int pincode=s.nextInt();
			Customer c=new Customer(cid, cname, phno, new Address(houseNo, streetName, pincode), roomType, roomPrice,roomno);
			m.put(roomno, c);
			l1.add(c);
			System.out.println(c.getCname()+" had been allocated for "+roomType+" roomno "+roomno);
			System.out.println(c.getCname()+" need to pas Rs. "+roomPrice);
		}
		else
		{
			System.out.println("Invalid Roomno............!!!");
		}
		
	}

	@Override
	public void checkIn() {
	System.out.println("======Check-In Details=======");
	System.out.println("1.Non Ac\n2.AC\n3.Deluxe");
	System.out.println("Enter The Option");
	Scanner s=new Scanner(System.in);
	int op=s.nextInt();
	switch(op)
	{
	case 1:allocate(nac,"Non Ac",2000);break;
	case 2:allocate(ac,"Ac",2500);break;
	case 3:allocate(deluxe,"Deluxe",3000);break;
	default:System.out.println("Invalid Option");
	}
	}
	void deAllocate(LinkedHashMap<Integer, Customer>m)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the roomno:");
		int roomno=s.nextInt();
		if(m.containsKey(roomno)&&m.get(roomno)!=null)
		{
			Customer c=m.get(roomno);
			System.out.println(c.getCname()+"Thanks For Visiting Our Hotel....!!!");
			m.put(roomno, null);
		}
		else
		{
			System.out.println("Invalid RoomNo");
		}
	}

	@Override
	public void checkOut() {
		System.out.println("======Check-In Details=======");
		System.out.println("1.Non Ac\n2.AC\n3.Deluxe");
		System.out.println("Enter The Option");
		Scanner s=new Scanner(System.in);
		int op=s.nextInt();
		switch(op)
		{
		case 1:deAllocate(nac);break;
		case 2:deAllocate(ac);break;
		case 3:deAllocate(deluxe);break;
		default:System.out.println("Invalid Option");
		}
		
	}

	@Override
	public void customerDetails() 
	{
		int c=0;
		System.out.println("=====customer details=======");
		for (Customer ele: l1) 
		{
			System.out.println(ele);
			c++;
			
		}
		if(c==0)
		{
			System.out.println("No Customer Data Found.....!!");
		}
		
	}

}



