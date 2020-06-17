class Pattern {

	public static void main(String[] args) {

		int charac=65;
		for(int row=5;row>=1;row--) {

			
			for(int let=1;let<=row;let++) {
				
				System.out.print((char)charac+" ");
				
			}
			charac++;
			System.out.println();
		}
	}
}
