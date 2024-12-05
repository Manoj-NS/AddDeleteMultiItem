package learningoops;

public class MethodOverloading {
	
	public int add (int a, int b) {
		return a+b;
	}
	
	public int add (int a, int b, int c){		
		return a+b+c;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public static void main (String[] args) {
		
		MethodOverloading calc = new MethodOverloading();
		System.out.println(calc.add(2,3));
		System.out.println(calc.add(2,2,2));
		System.out.println(calc.add(2.5, 2.5));
		
	}

}
