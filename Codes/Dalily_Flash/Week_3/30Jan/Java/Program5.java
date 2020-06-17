import java.util.*;

class ComplexImaginary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1:");
		System.out.print("Real Part = ");
		int no = sc.nextInt();
		System.out.print("Imaginary Part = ");
		int img = sc.nextInt();
		
		System.out.println("Enter No2: ");
		System.out.print("Real Part = ");
		int no1 = sc.nextInt();
		System.out.print("Imaginary Part = ");
		int img1 = sc.nextInt();
		int no2 = no+no1;
		int img2 = img+img1;
		System.out.println("The Addition of "+no+"+"+img+"i"+" & "+no1+"+"+img+"i is "+no2+"+"+img2+"i");

		
	}	
}
