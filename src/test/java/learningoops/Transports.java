package learningoops;

public class Transports {
	
	public static void main(String[] args) {
		
		Bike myBike=new Bike("Bajaj", 2017, true);
		Car myCar=new Car("Tata", 2020, 4);
		Truck myTruck=new Truck("Mahindra", 2010, 20.5);
		
		myBike.displayBikeInfo();
		myCar.displayCarinfo();
		myTruck.displayTruckInfo();
	}

}
