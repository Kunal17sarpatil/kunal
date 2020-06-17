import java.util.*;

class KineticEnergy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mass = ");
		int m = sc.nextInt();
		System.out.print("Enter Velocity = ");
		int v = sc.nextInt();
		
		double ke = 0.5*m*v*v;
		System.out.println("Kinetic Energy of that object is: = "+ke);
	}
}
