
class MultiConst {

	MultiConst() {
	
		System.out.println("No-Arg Constructor....");
	}

	MultiConst(int a) {
	
		System.out.println("Single Argument Constructor....");
	}

	MultiConst(int a, int b) {
	
		System.out.println("Two Argument constructor....");
	}


	public static void main(String[] args) {
	
		MultiConst mc = new MultiConst();
		
		MultiConst mc1 = new MultiConst(5);

		MultiConst mc2 = new MultiConst(5,5);
	}
}
