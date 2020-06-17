import java.io.*;

class StringOccur {

	public static void main(String[] args) throws IOExceptioni
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter String = ");

		String str = br.readLine();

		System.out.print("Enter character to search = ");
		char ch = br.readLine().charAt(0);

		int count = 0;

		for(int i=0;i<str.length();i++) {
		
			if(str.charAt(i) == ch ) {
			
				count++;
			}
		}

		System.out.println(count);
	} 
}
