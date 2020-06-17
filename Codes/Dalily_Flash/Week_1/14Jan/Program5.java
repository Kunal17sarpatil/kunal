import java.util.*;

class MaxNum {

	public static void main(String[] ars) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No1 = ");
		int a = sc.nextInt();
		System.out.print("Enter No2 = ");
		int b = sc.nextInt();
		System.out.print("Enter No3 = ");
		int c = sc.nextInt();

		if(a>b && a>c) {
		
			System.out.println(a+" is greater among "+b+" "+c);
		}else if(b>a && b>c) {
		
			System.out.println(b+" is greater among "+a+" "+c);
		} else {
		
			System.out.println(c+" is greater among "+a+" "+b);
		}
	}
}
