import java.util.*;

class VowelAlphaConso {

	public static void main(String[] ag) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Key = ");
		char key = sc.next().charAt(0);

		if(key>=65 && key<=90 || key>=97 && key<=122) {
		
			System.out.println("Entered Key is Alphabet.....");
		} else if(key>=48 && key<=57) {
		
			System.out.println("Entered Key is Number");
		} else {
		
			System.out.println("Entered Key is Special character....");
		}
	}
}
