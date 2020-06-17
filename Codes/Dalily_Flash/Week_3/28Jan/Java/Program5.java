import java.util.*;

class MinNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No1 = ");
		int no1 = sc.nextInt();
		System.out.print("Enter No2 = ");
		int no2 = sc.nextInt();
		System.out.print("Enter NO3 = ");
		int no3 = sc.nextInt();
		if(no1<no2 && no1<no3) {

			System.out.println("The Minimun no amongst "+no1+" "+no2+" & "+no3+" is "+no1);
		} else if(no2<no3 && no2<no1) {
			System.out.println("The Minimun no amongst "+no1+" "+no2+" & "+no3+" is "+no2);
		} else {
			System.out.println("The Minimun no amongst "+no1+no2+" "+" & "+no3+" is "+no3);
	
		}
	}
}
