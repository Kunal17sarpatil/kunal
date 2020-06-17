import java.util.*;

class SumInput {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No For sum = ");
		int upto = sc.nextInt();
		int temp = 0;
		for(int i=1;i<=upto;i++) {
		
			temp = temp + i;
		}
		System.out.println("Sum = "+temp);
	}
}
