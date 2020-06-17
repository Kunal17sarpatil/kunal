public class EmployeeDemo {

	public static void main(String[] args) {
	
		Employee1 emp1, emp2;
		emp1 = new Employee1();
		emp2 = new Employee1();
		emp1.name = "Kunal Sarpatil";
		emp1.address = "B2/208, Dangat Patil Nagar, Shivane, Pune";
		emp1.number = 117;
		emp1.SSN = 456789;
		emp1.salary = 900000.00;
		System.out.println(emp1.computePay());
		emp1.mailCheck();
		emp2.name = "Digvijay Jadhav";
		emp2.address = "Kuthe Pan";
		emp2.number = 121;
		emp2.SSN = 123321;
		emp2.salary = 1000000.00;
		System.out.println(emp2.computePay());
		emp2.mailCheck();
	}
}
