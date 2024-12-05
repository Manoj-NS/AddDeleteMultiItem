package learningoops;

public class Vehicle {
	
	String model;
	int year;
	
	public Vehicle (String model, int year) {
		
		this.model = model;
		this.year=year;
	}
	
	public void displayInfo() {
		
		System.out.println("Model No: "+model+" and Year of Manufacture "+year);
	}

}
