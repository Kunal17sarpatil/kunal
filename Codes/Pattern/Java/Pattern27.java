class Pattern27 {
 
	public static void main(String[] args) {

		int ch=65;
		for(int row=0;row<5;row++) {

			for(int chr=0;chr<5;chr++) {

				if((row+chr)<=3) {
					System.out.print(" ");
				} else {
					System.out.print((char)ch);
				}
			}
			ch++;
			System.out.println();
		}
	}
}