
public class CalOverload {

	public static void main(String[] args) {
	
		System.out.println();
		System.out.println("Initiating Calculator....");
		CalculatorDemo cd = new CalculatorDemo();
		System.out.println("Declaring some default values....");
		int a = 2;
		int b = 3;
		double d = 2.5;
		double e = -1.0;
		float f = 4.5f;
		int intAnswer=0;
		double doubleAnswer=0.0;
		
		System.out.println();
		intAnswer = cd.multiply(a,b);
		System.out.println("a * b = "+intAnswer);

		System.out.println();
		doubleAnswer = cd.multiply(d,e);
		System.out.println("d * e = "+doubleAnswer);

		System.out.println();
		doubleAnswer = cd.multiply(a,d);
		System.out.println("a * d = "+doubleAnswer);

		System.out.println();
		intAnswer = cd.multiply(a,b,a);
		System.out.println("a * b * a = "+intAnswer);

		System.out.println();
		intAnswer = cd.multiply(a);
		System.out.println("a * a = "+intAnswer);
	}
}
