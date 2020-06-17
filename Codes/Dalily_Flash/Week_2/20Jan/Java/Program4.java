import java.util.*;

class SumAverage {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int no;
		int sum=0;
		float temp=0;
		for(int i=1;i<=10;i++) {
		
			System.out.print("Enter No = ");
			no = sc.nextInt();
			sum = sum + no; 	
		}

		temp = (float)sum/10;
		System.out.println("Sum of 10 entered no = "+sum);
		System.out.println("Average = "+temp);

	}
}
