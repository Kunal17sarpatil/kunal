
public class BigScreen extends Television{

	public String aspectRatio;
	public short size;
	public BigScreen(int channel) {
	
		this("Unknown", (short)40, channel);
		System.out.println("Inside BigScreen (int)");
	}

	public BigScreen(String r, short s, int channel) {
	
		super(channel);
		System.out.println("Inside BigScreen(String, short, int)");
		aspectRatio = r;
		size = s;
	}

	public BigScreen(String r, short s, int channel, int volume) {
	
		super(channel, volume);
		System.out.println("Inside BigScreen(String, short, int, int)");
	}
}
