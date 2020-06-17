import java.util.*;

class Pattern5 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter From = ");
		int from = sc.nextInt();
		System.out.print("Enter To = ");
		int to = sc.nextInt();

		for(int row=from;row<=to;row++) {
		
			for(int print=from;print<=to;print++) {
			
				System.out.print((char)print+" ");
			}

			System.out.println();
		}
	}
}
