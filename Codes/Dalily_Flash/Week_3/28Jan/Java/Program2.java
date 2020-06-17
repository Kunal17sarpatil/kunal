import java.util.*;

class InputFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First = ");
		int first = sc.nextInt();
		System.out.print("Enter Last = ");
		int last = sc.nextInt();
		for(int i=first;i<=last;i++) {  
			int fact = 1;
			for(int no=1;no<=i;no++) {

				fact = fact*no;
			}
			System.out.println("Factorial of "+i+" = "+fact);
		}
	}
}
