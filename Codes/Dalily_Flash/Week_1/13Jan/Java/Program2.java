import java.io.*;

class PosNeg {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter No = ");
		int no = Integer.parseInt(br.readLine());
		if(no<0) {
		
			System.out.println(no+" is negative no....");
		} else if(no>0) {
		
			System.out.println(no+" is positive no....");
		} else {
		
			System.out.println("Entered no. is zero....");
		}
	}
}
