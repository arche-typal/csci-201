package csci201;

public class DemoOne {

	public static void main(String[] args) {
		double radius = 1, volume;
		//volume = 4 / 3 * Math.PI * Math.pow(radius, 3);
		//If both integers, you get quotient instead of fractional result.
		//need at least one to 
		volume = 4.0 / 3 * Math.PI * Math.pow(radius, 3);
		System.out.println("Surface Area = " + volume);
	}
}
