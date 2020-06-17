class Pattern1 {

	public static void main(String[] args) {
		int num=4;
		for(int row=1;row<=num;row++) {
		
			for(int space=num-1;space>=row;space--) {
			
				System.out.print(" ");
			}
			for(int no=1;no<=num;no++) {
			
				System.out.print(num);	
			}

			System.out.println();
		}
	}
}
