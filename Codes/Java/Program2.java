import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter No of Elements = ");
		int a = Integer.parseInt(br.readLine());

		int arr[] = new int[a];
		System.out.print("\nEnter Elements = ");
		for(int i=0;i<a;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		
	}
}