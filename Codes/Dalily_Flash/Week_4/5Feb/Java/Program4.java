class Pattern {

	public static void main(String[] args) {
	
		int temp=97;
		for(int row=1;row<=4;row++) {
			int temp1 = temp;
			for(int let=4;let>=row;let--) {
			
				System.out.print((char)temp1+" ");
				temp1++;
			}

			temp=temp+2;
			System.out.println();
		}
	}
}	
