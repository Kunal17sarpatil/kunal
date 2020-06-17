class Pattern {

	public static void main(String[] args) {
		int temp=7,i=1;
		for(int row=1;row<=4;row++) {

			for(int no=4;no>=row;no--) {
				
				int ch = temp*i;
				System.out.print(ch+" ");
				i++;
			}

			System.out.println();
		}
	}
}
