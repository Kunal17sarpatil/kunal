import java.util.*;

class OhmInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Current(I) = ");
		int i = sc.nextInt();
		System.out.print("Enterr Resistance(R) = ");
		int r = sc.nextInt();
		int volt = i*r;
		System.out.println("Voltage V = "+volt);
	}
}
