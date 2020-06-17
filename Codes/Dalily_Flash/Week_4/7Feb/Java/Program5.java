class Pattern1 {

	public static void main(String[] args) {
	
		for(int row=1;row<=4;row++){
		
			for(int no=1;no<=4;no++) {
			
				if(no==row) {
					
					System.out.print("= ");
				} else {
				
					System.out.print(no+" ");
				}
			}

			System.out.println();
		}
	}
}
