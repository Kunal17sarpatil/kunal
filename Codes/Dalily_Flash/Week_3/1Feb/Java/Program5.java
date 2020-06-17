import java.util.*;

class GCD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No1 = ");
		int no1 = sc.nextInt();
		System.out.print("Enter No2 = ");
		int no2 = sc.nextInt();
		int temp=0;
		for(int i=1;i<=no1 && i<=no2;i++) {

			if(no1%i==0 && no2%i==0) {

				temp=i;
			}
		}

		System.out.println("The GCD of "+no1+" & "+no2+" is "+temp);
	}
}
