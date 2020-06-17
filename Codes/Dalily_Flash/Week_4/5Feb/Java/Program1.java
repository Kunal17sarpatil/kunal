class Fibo {

	public static void main(String[] args) {
		
		int temp=0,temp1=1;
		for(int i=1;i<=5;i++) {
		
			System.out.print(temp+" ");
			int sum = temp+temp1;
			temp = temp1;
			temp1 = sum;
		}

		System.out.println();
	}
}
