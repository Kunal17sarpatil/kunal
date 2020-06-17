import java.util.*;

class DateValidity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Date: ");
		int date = sc.nextInt();
		//char slash = sc.next().charAt(0);
		int month = sc.nextInt();
		//char slash1 = sc.next().charAt(0);
		int year = sc.nextInt();
		
		if(year>=1900&&year<=1999) {
		
			if(month>=1&&month<=12) {
				if((date<=31&&date>=1)&&(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)) {

					System.out.println("Date is Valid");
				} else if((date<=30&&date>=1)&&(month==4 || month==6 || month==9 || month==11)) {

					System.out.println("Date is Valid");
				} else if((date==29 && month==2)&&(year%400==0)||(year%4==0)||(year%100!=0)) {

					System.out.println("Date is Valid");
				} else {

					System.out.println("Date is Invalid..");
				}
			} else {

				System.out.println("Month is invalid...");
			}

		} else {

			System.out.println("year is invalid");
		}
	}
}
