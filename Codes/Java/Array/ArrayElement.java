import java.util.*;

class ElementInArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[] {"kunal","shashi","digvijay"};
		System.out.print("Enter String to search = ");
		String str = sc.next();
		for(int n=0;n<=arr.length;n++) {
		
			if(str==arr[n]) {
			
				System.out.println("Element Found At"+arr[n]);
			}

		}
	}
}
