class Pattern19 {

	public static void main(String[] args) {
	
		for(int row=69;row>=65;row--) {
		
			for(int print=65;print<=row;print++) {
			
				System.out.print((char)print+" ");
			}

			System.out.println();
		}
	}
}
