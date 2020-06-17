import java.util.*;

class VowelCons {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Key = ");
		char key = sc.next().charAt(0);

		if(key=='a'|| key=='e'|| key=='i' || key=='o' ||key=='u' && key=='A'|| key=='E'|| key=='I' || key=='O' ||key=='U') {
		
			System.out.println("Entered Key is Vowel");
		} else {
		
			System.out.println("Entered key is consonent....");
		}
	}
}
