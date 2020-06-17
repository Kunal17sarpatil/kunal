import java.util.*;

class Velocity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Distance = ");
		int dist = sc.nextInt();
		System.out.print("Enter Time = ");
		int time = sc.nextInt();
		int velocity = dist/time;
		System.out.println("The velocity of a particle roaming in space is "+velocity+"m/s.");
	}
}
