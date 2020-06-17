import java.util.*;

class MulDiv {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No1 = ");
		int no1 = sc.nextInt();
		System.out.print("Enter No2 = ");
		int no2 = sc.nextInt();
		int mul,div;

		mul = no1*no2;
		System.out.println("Multiplication = "+mul);
		if(no1<no2) {
		
			div = no2/no1;
		} else {
		
			div = no1/no2;
		}
		System.out.println("Division = "+div);
	}
}
