package learning;

public class LearningObjBike {
	
	String model;
	String color;
	
	public LearningObjBike(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	public static void main(String[] args) {
		
		LearningObjBike myBike=new LearningObjBike("Bajaj", "Black");
		
		System.out.println(myBike.model);
		System.out.println(myBike.color);
	}

}
