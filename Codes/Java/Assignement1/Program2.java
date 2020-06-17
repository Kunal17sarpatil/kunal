import java.util.*;

class Admin {

	Admin(int id, String adName, double salary){

		this.id = id;
		this.adName = adName;
		this.salary = salary;

	}
}

class Manager extends Admin{

	Manager(int id, String mName, double salary) {

		this.id = id;
		this.mName = mName;
		this.salary = salary;

	}
}

class Employee extends Manager{

	Employee(int id, String empName, double salary) {

		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}
}

class CmpDemo {

	public static void main(String[] args) {

		ArrayList<Admin> al = new ArrayList<Admin>();
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String adName = sc.next();
		double salary = sc.nextDouble();
		al.add(new Admin(id,adName,salary));
		ArrayList<Manager> al1 = new ArrayList<Manager>();
		int

	}
}
