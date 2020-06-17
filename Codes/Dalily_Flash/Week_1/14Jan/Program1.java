import java.io.*;

class Alphabet {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter key = ");
		char key = (char)br.read();
		
		if(key>=65 && key<=90 || key>=97 && key<=122) {
		
			System.out.println("Entered Key is alphabet");
		} else {
		
			System.out.println("Entered Key is not Alphabet....");
		}
	}
}
