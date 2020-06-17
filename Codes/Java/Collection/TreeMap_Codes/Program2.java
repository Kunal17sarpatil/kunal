import java.util.*;

class WorldCup implements Comparable<WorldCup> {

	int year;

	WorldCup(int year) {

		this.year = year;
	}

	public int compareTo(WorldCup wc) {

		return year-wc.year;
	}

	public String toString() {

		return year+" ";
	}
}

class Captain {

	public static void main(String[] args) {

		HashMap<String,String> hm1 = new HashMap<>();
		hm1.put("Kapil Dev ", " Lord's");
		HashMap<String,String> hm2 = new HashMap<>();
		hm2.put("MS Dhoni ", " Wankhede");
		HashMap<String,String> hm3 = new HashMap<>();
		hm3.put("Michael Clark ", " MCG");
		HashMap<String,String> hm4 = new HashMap<>();
		hm4.put("Eon Morgan ", " Lord's");

		TreeMap<WorldCup,HashMap> tm = new TreeMap<>();

		tm.put(new WorldCup(1983),hm1);
		tm.put(new WorldCup(2011),hm2);
		tm.put(new WorldCup(2015),hm3);
		tm.put(new WorldCup(2019),hm4);

		System.out.println(tm);
	}
}
