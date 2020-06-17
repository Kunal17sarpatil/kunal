import java.util.*;

class OddEven {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No = ");
		int no = sc.nextInt();

		if(no%2==0) {
		
			System.out.println(no+" is Even no....");
		} else {
		
			System.out.println(no+" is Odd no....");
		}
	}
}
