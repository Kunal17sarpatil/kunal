class Pattern2 {

	public static void main(String[] arhs) {
		int temp=0;
		for(int row=1;row<=4;row++) {
		
			for(int no=1;no<=row;no++) {
			
				temp = temp + 1;
				System.out.print(temp+" ");
			}

			System.out.println();
		}
	}
}
