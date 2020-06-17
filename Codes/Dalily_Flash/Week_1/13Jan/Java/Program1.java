import java.io.*;

class MaxMin {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter No1 = ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter No2 = ");
		int b = Integer.parseInt(br.readLine());

		if(a>b) {
		
			System.out.println("No1 is greater among 1&2 ");
		} else {
		
			System.out.println("No2 is greater among 1&2 ");
		}
	}
}
