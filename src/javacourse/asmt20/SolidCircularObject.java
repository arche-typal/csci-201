package javacourse.asmt20;

public class SolidCircularObject {

	private static final double PI = Math.PI;
	private double radius;
	
	public SolidCircularObject(double radius) {
		this.radius = radius;
	}
	
	//getters
	public double PI() {
		return PI;
	}
	
	public double radius() {
		return radius;
	}
	
	//setters
	public void setRadius(double radius) {
		this.radius= radius;	
	}
	
}
