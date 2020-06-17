
public class Employee1 {

	public String name;
	public String address;
	public int number;
	public int SSN;
	public double salary;
	
	public void mailCheck() {
	
		System.out.println("Mail check to "+name+"\n"+address);
	}

	public double computePay() {
	
		return salary/52;
	}	

	public static void main(String[] args) {
	
		Employee1 emp, emp1;
		emp = new Employee1();
		emp1 = emp;
		emp1.mailCheck();
	}
}
