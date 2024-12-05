package learningoops;

public class Car extends Vehicle{
	
	int doors;
	
	public Car(String model, int year, int doors) {
		super(model, year);
		this.doors=doors;
	}
	
	public void displayCarinfo() {
		
		displayInfo();
		System.out.println("How many doors car have: "+doors+" doors");
	}

}
