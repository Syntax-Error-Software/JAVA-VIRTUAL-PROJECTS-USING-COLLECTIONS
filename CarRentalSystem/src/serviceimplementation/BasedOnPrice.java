package serviceimplementation;

import java.util.Comparator;

import entity.Car;

class BasedOnPrice implements Comparator<Car>
{

	@Override
	public int compare(Car a1, Car a2) {
		
	 if(a1.getPrice()>a2.getPrice())
	 {
		 return 1;
	 }
	 else if(a1.getPrice()<a2.getPrice())
	 {
		 return -1;
	 }
	 return 0;
	}
	
}
class BasedOnFuel implements Comparator<Car>
{

	@Override
	public int compare(Car arg0, Car arg1) {
		return arg0.getFuelType().compareTo(arg1.getFuelType()) ;
	}
	
}
