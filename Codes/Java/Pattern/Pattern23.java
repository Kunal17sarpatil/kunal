class Pattern23 {

	public static void main(String[] args) {
	
		for(int row=65;row<=69;row++) {
		
			for(int print=69;print>=row;print--) {
			
				System.out.print((char)print+" ");
			}

			System.out.println();
		}
	}
}
