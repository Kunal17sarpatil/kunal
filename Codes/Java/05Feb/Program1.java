/* Create an emloyee class with following fields: id name password role then accept data from the users and save it to a collecgtion of your choice. Use multiple threads to do it. Use one thread to accept data from the user the other to save the data to the collection. Wnen one thread is working other must not be actice.After ttaking all input, kill the extra thread and print the data using remaining thread.*/

import java.util.*;
class Employee extends Thread{

	int id;
	String name;
	String pass;
	String role;
		
	Employee(int id, String name, String pass, String role) {
	this.id=id;
	this.name=name;
	this.pass=pass;
	this.role=role;

	} 

	public void run() {
	
		System.out.println("Hello...");
		toString();
	}

	public String toString() {
	
		return name+" "+id+" "+pass+" "+role;
	}
}

class EmployeeDemo extends Employee{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No = ");
		int no = sc.nextInt();
		int id;
		String name;
		String pass;
		String role;
		ArrayList<Employee> ts = new ArrayList<Employee>();
		for(int i =1;i<=no;i++) {
		
			System.out.print("Enter id = ");
			id = sc.nextInt();
			System.out.print("Enter Name = ");
			name = sc.next();
			System.out.print("Enter Password = ");
			pass = sc.next();
			System.out.print("Enter role = ");
			role = sc.next();
			ts.add(new Employee(id,name,pass,role));
			System.out.println("Employee "+i+" Added..");
		} 
		//Employee ed = new EmployeeDemo();
		//ed.start();
		System.out.println(ts);
	}
}
