class Pattern21 {

	public static void main(String[] args) {
	
		for(int row=1;row<=5;row++) {
		
			for(int print=5;print>=row;print--) {
			
				System.out.print(print+" ");
			}

			System.out.println();
		}
	}
}
