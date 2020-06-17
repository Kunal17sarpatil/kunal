import java.util.*;

class ReverseOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No = ");
		int no = sc.nextInt();
		for(int i=no;i>=1;i--) {

			if(i%2!=0) {

				System.out.print(i+" ");
			}
		}

		System.out.println();
	}
}
