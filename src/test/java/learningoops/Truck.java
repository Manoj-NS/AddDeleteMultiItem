package learningoops;

public class Truck extends Vehicle{
	
	Double loadCapacity;
	
	public Truck (String model, int year, double loadCapacity) {
		super(model,year);
		this.loadCapacity=loadCapacity;
	}
	
	public void displayTruckInfo() {
		displayInfo();
		System.out.println("Load Capacity: "+loadCapacity+" tons");
	}

}
