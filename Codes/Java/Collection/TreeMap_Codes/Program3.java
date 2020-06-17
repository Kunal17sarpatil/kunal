import java.util.*;

class Player implements Comparator<Player> {
	String plName;
	int runs;
	Player(String plName,int runs) {

		this.plName = plName;
		this.runs = runs;
	}

	public int compare(Player p1, Player p2) {

		return p1.runs-p2.runs;
	}

	public String toString() {

		return plName+" ";
	}
}

class WonBy {

	public static void main(String[] args) {

		HashMap<Player,Integer> hm1 = new HashMap<>();
		hm1.put(new Player("Sachin Tendulkar",18426),62);
		HashMap<Player,Integer> hm2 = new HashMap<>();
		hm2.put(new Player("Virat Kohli",11792),36);
		HashMap<Player,Integer> hm3 = new HashMap<>();
		hm3.put(new Player("MS Dhoni",10773),21);
		
		TreeMap<Integer,HashMap> tm = new TreeMap<>();

		tm.put(363,hm1);
		tm.put(245,hm2);
		tm.put(350,hm3);

		System.out.println(tm);
	}
}
