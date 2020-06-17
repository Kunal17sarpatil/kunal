import java.util.*;

class Pattern13 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		for(int row=65;row<=69;row++) {
		
			for(int print=65;print<=row;print++) {
			
				System.out.print((char)row+" ");
			}

			System.out.println();
		}
	}
}
