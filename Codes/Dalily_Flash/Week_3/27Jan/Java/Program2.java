import java.util.*;

class MinInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No1 = ");
		int no1 = sc.nextInt();
		System.out.print("Enter no2 = ");
		int no2 = sc.nextInt();

		if(no1>no2) {

			System.out.print("The Min no amongst "+no1+" and "+no2+":"+no2);
		} else {
			System.out.print("The Min no amongst "+no1+" and "+no2+" is "+no1);
		}
		System.out.println();
	}
}
