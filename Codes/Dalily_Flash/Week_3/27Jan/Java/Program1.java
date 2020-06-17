import java.util.*;

class EvenInput {

	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First = ");
		int no1 = sc.nextInt();
		System.out.print("Enter Last = ");
		int no2 = sc.nextInt();

		for(int no=no1;no<=no2;no++) {

			if(no%2==0) {

				System.out.print(no+" ");
			}
		}

		System.out.println();
	}
}

