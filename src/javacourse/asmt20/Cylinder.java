package javacourse.asmt20;

public class Cylinder extends SolidCircularObject {
		
	private double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double height() {
		return height;
	}
	
	public double calculateSurfaceArea() {
		double surfaceArea = 2 * super.PI() * Math.pow(super.radius(), 2) + 2 * super.PI() * super.radius() * height;
		return surfaceArea;
	}
	
	public double calculateVolume() {
		double volume = super.PI() * Math.pow(super.radius(), 2) * height;
		return volume;
	}

}
