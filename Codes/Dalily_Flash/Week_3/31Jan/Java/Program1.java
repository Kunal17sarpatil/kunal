import java.util.*;

class InputNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number = ");
		int no = sc.nextInt();
		System.out.print("Enter Increase Number = ");
		int no1 = sc.nextInt();
		int temp = 1;
		for(int i=1;i<=no;i++) {
	
			System.out.print(" "+temp);
			temp = temp+no1;
		}

		System.out.println();
	}
}
