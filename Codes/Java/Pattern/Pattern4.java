import java.util.*;

class Pattern4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter From = ");
		int from = sc.nextInt();
		System.out.print("Enter To = ");
		int to = sc.nextInt();

		for(int i=from;i<=to;i++) {
		
			for(int j=from;j<=to;j++) {
			
				System.out.print((char)i+" ");
			}

			System.out.println();
		}
	}
}
