class Pattern1 {

	public static void main(String[] args) {

		for(int row=0;row<5;row++) {

			for(int star=0;star<5;star++) {

				if((row+star)<=3) {

					System.out.print("  ");
				} else {

					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}