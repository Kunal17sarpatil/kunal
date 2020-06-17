import java.util.*;

class Sport implements Comparable<Sport> {

	double earning;
	String playerName;

	Sport(double earning, String playerName) {
	
		this.earning=earning;
		this.playerName=playerName;
	}

	public int compareTo(Sport s) {
	
		return (int)(this.earning-earning);
	}
}

class Player extends Sport {

	double earning;
	String sports;

	Player(double earning, String sports) {
	
		this.earning = earning;
		this.sports = sports;
	}
}

class Demo {

	public static void main(String[] args) {
	
		TreeMap<Sport,Player> tm = new TreeMap<Sport,Player>();
		tm.put(new Sport(50000.00,"Virat Kohli"),new Player(30000.00,"Cricket"));
		tm.put(new Sport(60000.00," Kohli"),new Player(50000.00,"BOt"));
		System.out.println(tm);
	}
}
