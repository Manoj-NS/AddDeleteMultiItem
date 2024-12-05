package learning;

public class Transport {
	
	
	public static void main (String[] args) {
		
		Vehicle vehicle = new Vehicle();
		Car car=new Car();
//		Auto auto=new Auto();
		Bike bike=new Bike();
//		Truck truck=new Truck();
		
		System.out.println("Vehincal: ");
		vehicle.applyBreak();
		vehicle.horn();
		vehicle.Sterring();

		System.out.println("\nCar: ");
		car.applyBreak();
		car.autoDrive();
		
		System.out.println("\nbike: ");
		bike.applyBreak();
		bike.bikeType();
		bike.horn();
		
//		auto.applyBreak();
//		auto.headLight();
//		
		
	
		
	}

}
