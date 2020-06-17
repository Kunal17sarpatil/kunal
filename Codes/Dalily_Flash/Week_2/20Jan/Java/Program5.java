class Pattern {

	public static void main(String[] args) {
	
		for(int row=1;row<=4;row++) {
		
			for(int no=1;no<=4;no++) {
			
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
