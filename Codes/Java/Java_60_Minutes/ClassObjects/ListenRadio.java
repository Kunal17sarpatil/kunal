
public class ListenRadio {

	public static void main(String[] ag) {
	
		System.out.println("Setting Up your radio....");
		
		RadioDemo rd = new RadioDemo();
		
		float initialStation = Float.parseFloat(ag[0]);
		int initialVolume = 5;
		rd.turnOn(initialVolume,initialStation, 'F');
		
		System.out.println("The tunned Channel is = "+rd.getTuning());
		
		int x =7;
		rd.setVolume(x);
		System.out.println("X = "+x);
		
		rd.turnUp();
		rd.turnUp();
		rd.changeBand();

		System.out.println("The Volume = "+rd.volume+" The Band is "+rd.band+" and you are listening to "+rd.tuning);

	}
}
