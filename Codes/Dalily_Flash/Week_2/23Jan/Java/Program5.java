import java.util.*;

class Factorial {

	public static void main(String[] arhs) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No1 = ");
		int no = sc.nextInt();
		int fact=1;

		for(int no1=1;no1<=no;no1++) {
		
			fact = fact * no1;
		}

		System.out.println("Factorial of "+no+" is "+fact);
	}
}
