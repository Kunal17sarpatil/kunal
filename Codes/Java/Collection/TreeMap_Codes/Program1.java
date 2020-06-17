import java.util.*;

class ContractBCCI implements Comparable<ContractBCCI> {

	double money;

	ContractBCCI(double money) {
	
		this.money = money;
	}

	public int compareTo(ContractBCCI cb) {
	
		return (int)(cb.money-money);
	}

	public String toString() {

		return money+"cr"; 
	}
}

class Player {

	String plName;
	String plClass;

	Player(String plName, String plClass) {
	
		this.plName = plName;
		this.plClass = plClass;
	}

	public String toString() {

		return plName+", "+plClass;
	}
}

class GetMoney {

	public static void main(String[] args) {
	
		TreeMap<ContractBCCI,Player> tm = new TreeMap<>();
		tm.put(new ContractBCCI(5),new Player("Virat Kohli","Class A"));
		tm.put(new ContractBCCI(3),new Player("Hardik Pandya","Class B"));
		tm.put(new ContractBCCI(1),new Player("Kedar Jadhav","Class C"));
		System.out.println(tm);
	}
}
