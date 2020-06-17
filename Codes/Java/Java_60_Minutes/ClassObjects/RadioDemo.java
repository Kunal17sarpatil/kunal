
public class RadioDemo {

	public int volume;
	public float tuning;
	public char band;

	public void turnOn(int v, float t, char b) {
	
		System.out.println("Turning on the radio");
		setVolume(v);
		setBand(b);
		tuning = t;
	}

	public void setVolume(int volume) {
	
		System.out.println("Setting the volume = "+volume);
		if(volume >= 0 && volume <=10) {
		
			this.volume = volume;
		} else {
		
			this.volume = 0;
		}

		//For example let's take volume = -5 and see what happens
		
		volume = -5;
	}

	public void setBand(char b) {
	
		System.out.println("Setting the band to = "+b);
		if(b == 'A' || b == 'F') {
		
			band = b;
		} else {
		
			band = 'F';
		}
	}

	public void turnUp() {
	
		if (volume>0) {
		
			volume += 1;
		}
	}

	public void turnDown() {
	
		System.out.println("Turning the volume down");
		if(volume> 0) {
		
			volume -= 1;
		}
	}

	public float getTuning() {
	
		System.out.println("Inside Tuning");
		return tuning;
	}

	public void changeBand() {
	
		System.out.println("Changing Band");
		if(band == 'A') {
		
			band = 'F';
		} else {
		
			band = 'A';
		}
	}
}
