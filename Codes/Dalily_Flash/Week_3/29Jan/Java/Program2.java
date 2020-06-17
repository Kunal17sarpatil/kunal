import java.util.*;

class SucPred {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Input = ");
		int no = sc.nextInt();
		System.out.println("Second Predecessor:"+(no-2));
		System.out.println("Second Successor:"+(no+2));
	}
}
