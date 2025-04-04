package csci201;

public class SphereAsmt13 {

	public static final double PI = Math.PI;

	private double radius;
	
	public SphereAsmt13(double radius) {
		this.radius = radius;
	}
	
	public double radius() {
		return radius;
	}

	public double calculateSurfaceArea() {
		double surfaceArea = 4 * PI * Math.pow(radius, 2);
		return surfaceArea;
	}
	  
	public double calculateVolume() {
		double volume = 4.0/3.0 * PI * Math.pow(radius, 3);
		return volume;
	}
}
