import java.util.*;

class HourSecond {

	public static void main(String[] ags) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Hour = ");
		int hr = sc.nextInt();
		int sec = hr*3600;
		System.out.println("Seconds = "+sec);
	}
}
