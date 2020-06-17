import 	java.util.*;

class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No = ");
		int no = sc.nextInt();
		int temp=0;
		for(int i=1;i<=no;i++) {

			if(no%i==0) {

				temp++;
			}
		}

		if(temp==2) {

			System.out.println(no+" is prime No.");
		} else {

			System.out.println(no+" is not a prime no...");
		}
	}
}
