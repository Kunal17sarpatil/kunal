
public class CalculatorDemo {

	public int multiply(int x, int y) {
		
		System.out.println("Multiplication of Integer to Integer....");
		return x*y;
	}

	public double multiply(double x, double y) {
	
		System.out.println("Multiplication of Double to Double....");
		return x*y;
	}

	public double multiply(int x, double y) {
	
		System.out.println("Multiplication of Int and Double....");
		return x*y;
	}

	public int multiply(int x) {
	
		System.out.println("Square of Integer....");
		return x*x;
	}

	public int multiply(int x, int y, int z) {
	
		System.out.println("Multiplication of three Integers....");
		return x*y*z;
	}
}
