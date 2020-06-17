import java.util.*;

class AddSub {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No1 = ");
		int no1 = sc.nextInt();
		System.out.print("Enter No2 = ");
		int no2 = sc.nextInt();
		int sum,sub;

		sum = no1+no2;
		System.out.println("Addition = "+sum);
		if(no1>no2) {
		
			sub = no1-no2;
		} else {
		
			sub = no2-no1;
		}
		System.out.println("Substraction = "+sub);
	}
}
