package learning;

public class ConstructorCar {
	
	String model;
	String color;
	
	public ConstructorCar () {
		
		System.out.println("This is default Constructor");
	}
	
	public ConstructorCar (String model, String color) {
		
		this.model=model;
		this.color =color;
		
		System.out.println("This is parameterized constructor");
		
	}
	
		
	public static void main(String args[]) {
		
		ConstructorCar myCar=new ConstructorCar();
		ConstructorCar myCar2=new ConstructorCar("Tata", "Black");
		
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		
		System.out.println(myCar2.model);
		System.out.println(myCar2.color);
		
		
		
		
	}

}
