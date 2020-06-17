import java.util.*;

class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Limit = ");
		int limit = sc.nextInt();
		int temp;
		for(int no = 1;no<=limit;no++) {
			
			temp=0;
			for(int no1=1;no1<no;no1++) {

				if(no%no1==0) {

					temp = temp+no1;
				}
			}

			if(temp==no) {

				System.out.print(no+" ");
			}
		}
		System.out.println();

	}
}
