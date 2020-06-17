import java.util.*;

class Prime {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No = ");
		int no = sc.nextInt();
		int count=0;
		for(int i=1;i<=no;i++) {
		
			if(no%i==0) {
			
				count++;
				
			}
		
		}

		if(count==2) {
		
			System.out.println(no+" is a Prime no");
		} else {
		
			System.out.println(no+" is not a Prime No.");
		}
	}
}
