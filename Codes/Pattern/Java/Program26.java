class Pattern26 {

	public static void main(String[] args) {

		
		for (int row=0;row<5;row++) {

			int temp=1;
			for(int no=0;no<5;no++) {

				if((row+no)<=3) {

					System.out.print("  ");
				} else {

					System.out.print(temp+" ");
					temp++;
				}
			}

			System.out.println();
		}
	}
}