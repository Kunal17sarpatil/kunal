
import java.util.*;

class UpperLower {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Character = ");
		char key = sc.next().charAt(0);

		if(key>=65 && key<=90) {
		
			System.out.println("Entered Character is in UpperCase....");
		} else if(key>=97 && key<=122) {
		
			System.out.println("Entered Character is in LowerCase....");
		} else {
		
			System.out.println("Entered Key is Invalid!!!!");
		}
	}
}
