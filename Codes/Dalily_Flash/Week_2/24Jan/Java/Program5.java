import java.util.*;

class PerfectDivisor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No = ");
		int no = sc.nextInt();

		for(int i=1;i<no;i++) {
		
			if(no%i==0) {
			
				System.out.print(i+" ");
			}
		}

		System.out.println();
	}
}
