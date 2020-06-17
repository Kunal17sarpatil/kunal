class Pattern {

	public static void main(String[] args) {
		
		int let = 65;
		for(int row=1;row<=4;row++) {

			int temp=let;
			for(int print=4;print>=row;print--) {
				System.out.print((char)temp+" ");
				temp = temp+2;
			}

			let++;
			System.out.println();
		}
	}
}
