import java.util.*;

class QuotientRemainder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no1 = ");
		int no1 = sc.nextInt();
		System.out.print("Enter no2 = ");
		int no2 = sc.nextInt();
		System.out.println("Quotent: "+no1/no2);
		System.out.println("Remainder: "+no1%no2);
	}
} 
