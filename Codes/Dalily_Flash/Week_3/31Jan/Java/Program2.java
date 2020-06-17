import java.util.*;

class DollarRupeee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Dollar($) = ");
		int dollar = sc.nextInt();
		double rupee = dollar*71.54;
		System.out.println("Rupees = "+rupee);
	}
}
