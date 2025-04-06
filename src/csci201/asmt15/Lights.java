package csci201.asmt15;

public class Lights {

	public static void main(String[] args) {
		Bulb bulb1 = new Bulb();
		Bulb bulb2 = new Bulb();
		Bulb bulb3 = new Bulb();
		
		bulb1.turnOn();
		bulb3.turnOn();
		
		System.out.println("The light, bulb1, is " + bulb1.isOnString() 
		+ ". The light, bulb2, is " + bulb2.isOnString() 
		+ ". The light, bulb3, is " + bulb3.isOnString() + ".");
	}

}
