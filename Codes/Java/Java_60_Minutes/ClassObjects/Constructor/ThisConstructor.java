
class Television {

	//public int channel;
	//public int volume;
	public Television() {
	
		this(4);
		System.out.println("Inside no Arg-Constructor....");
	}

	public Television(int a) {
	
		this(a,10);
		System.out.println("Inside one-arg constructor....");
	}

	public Television(int a, int b) {
	
		System.out.println("Inside Two-arg constructor....");
	}

	public static void main(String[] ags) {
	
		Television t = new Television();

		Television t1 = new Television(5);

		Television t2 = new Television(5,10);
	}
}
