class Pattern {

	public static void main(String[] args) {

		for(int row=4;row>=1;row--) {

			for(int print=1;print<=row;print++) {

				if(print%2==0) {

					System.out.print("= ");
				} else {

					System.out.print("+ ");
				}
			}

			System.out.println();
		}
	}
}
