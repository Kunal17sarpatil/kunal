import java.util.*;

class PerfectNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No = ");
		int no1 = sc.nextInt();
		int temp = 0;
		for(int no=1;no<no1;no++) {

			if(no1%no==0) {

				temp = temp + no;
			}
		}

		if(temp==no1) {

			System.out.println(no1+" is a perfect No");
		} else {

			System.out.println(no1+" is not a perfect No...");
		}
	}
}
