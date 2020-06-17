import java.util.*;

class CubeSquare {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No = ");
		int no = sc.nextInt();
		for(int i=1;i<=no;i++) {
		
			if(i%2!=0) {
			
				System.out.println("Cube of "+i+" : "+(i*i*i)+" and Square of "+i+" : "+(i*i));
			}
		}
	}
}
