class Pattern {

	public static void main(String[] args) {
	
		for(int row=1;row<=5;row++) {
		
			for(int no=1;no<=row;no++) {
			
				if(row%2==0) {
				
					System.out.print("1 ");
				} else {
				
					System.out.print("0 ");
				}
			}

			System.out.println();
		}
	}
}
