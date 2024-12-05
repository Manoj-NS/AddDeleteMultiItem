package learningoops;

public class Bike extends Vehicle{
	
	Boolean hasSideCar;
	
	public Bike (String model, int year, boolean sidedoor) {
		super(model,year);
		this.hasSideCar=sidedoor;
	}
	
	public void displayBikeInfo() {
		displayInfo();
		System.out.println("Does bike have sidecar: "+hasSideCar);
	}

}
