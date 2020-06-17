class Pattern25 {

	public static void main(String[] args) {

		for(int row=0;row<5;row++) {

			for(int no=0;no<5;no++) {

				if((row+no)<=3) {

					System.out.print(" ");
				} else {

					System.out.print(row+1);
				}
			}

			System.out.println();
		}
	}
}