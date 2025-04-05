package csci201;

public class Cylinder {
	
	public static final double PI = Math.PI;
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double radius() {
		return radius;
	}
	
	public double height() {
		return height;
	}
	
	public double calculateSurfaceArea() {
		double surfaceArea = 2 * PI * Math.pow(radius, 2) + 2 * PI * radius * height;
		return surfaceArea;
	}
	
	public double calculateVolume() {
		double volume = PI * Math.pow(radius, 2) * height;
		return volume;
	}

}
