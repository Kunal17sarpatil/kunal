class Pattern1 {

	public static void main(String[] args) {

		int no1=7;
		for(int row=1;row<=4;row++) {

			int no2=no1;
			for(int no=1;no<=row;no++) {
				System.out.print(no2+" ");
				no2--;
			}
			no1--;
			System.out.println();
		}
	}
}
