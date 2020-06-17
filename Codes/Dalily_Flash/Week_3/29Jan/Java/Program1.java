import java.util.*;

class ReverseTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No = ");
		int table = sc.nextInt();
		for(int no=10;no>=1;no--) {

			System.out.println(table+" x "+no+" = "+(table*no));
		}
	}
}
