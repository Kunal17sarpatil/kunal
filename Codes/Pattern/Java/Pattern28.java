class Pattern28 {

	public static void main(String[] args) {

		for(int row=0;row<5;row++) {
			int ch=65;
			for(int chr=0;chr<5;chr++) {
				if((row+chr)<=3) {
					System.out.print(" ");
				} else {	
					System.out.print((char)ch);
					ch++;
				}
			}

			System.out.println();
		}
	}
}