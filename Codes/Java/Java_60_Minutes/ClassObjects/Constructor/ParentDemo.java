
public class ParentDemo {

	public static void main(String[] args) {
	
		System.out.println("\n*** Big Screen TV 1 ***");
		int channel = 4;
		new BigScreen(channel);
		short size = 53;
		channel =3;
		String ratio = "16:9";
		System.out.println("\n*** Big Screen TV 2 ***");
		new BigScreen(ratio, size, channel);
		ratio = "5:4";
		size = 42;
		channel = 4;
		int volume = 7;
		System.out.println("\n*** Big Screen TV 3 ***");
		new BigScreen(ratio, size, channel, volume);
	}
}
