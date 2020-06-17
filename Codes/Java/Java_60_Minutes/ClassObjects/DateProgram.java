
public class DateProgram {

	public static void main(String[] args) {
	
		System.out.println("Let's Begin....");
		Date d = new Date();
		d.day = 02;
		d.month = 01;
		d.year = 2020;

		System.out.println("Todays date is = ");
		d.printDate();
	}
}
