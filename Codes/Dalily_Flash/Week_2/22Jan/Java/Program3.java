import java.util.*;

class CubeSquare {

	public static void main(String[] arhgs) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No1 = ");
		int no1 = sc.nextInt();
		System.out.print("Enter No2 = ");
		int no2 = sc.nextInt();
		int add,sub;
		add = (no1*no1*no1) + (no2*no2*no2);
		System.out.println("Addition of "+(no1*no1*no1)+" and "+(no2*no2*no2)+" = "+add);
		sub = (no1*no1) - (no2*no2);
		System.out.println("Substraction of "+(no1*no1)+" and "+(no2*no2)+" = "+sub);
		
	}
}
