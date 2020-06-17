
class GCDemo {

	public static void main(String[] args) {
	
		Employee1 e1, e2 ,e3;
		e1 = new Employee1();		
		e2 = new Employee1();
		e3 = new Employee1();

		e2 = e1;
		e3 = null;
		e1 = null;
	}
}
