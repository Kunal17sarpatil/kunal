import java.util.*;

class ThreeInput {

	public static void main(String[] ars) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ente No1 = ");
		int no1 = sc.nextInt();
		System.out.print("Ente No2 = ");
		int no2 = sc.nextInt();
		System.out.print("Ente No3 = ");
		int no3 = sc.nextInt();

		if(no1>no2 && no1>no3) {

			System.out.print("The Maximum number amongst "+no1+" , "+no2+" and "+no3+" is "+no1);
		} else if(no2>no1 && no2>no3) {

			System.out.print("The Maximum number amongst "+no1+" , "+no2+" and "+no3+" is "+no2);

		} else {	
			System.out.print("The Maximum number amongst "+no1+" , "+no2+" and "+no3+" is "+no3);
		}
		
		System.out.println();
	}
}
