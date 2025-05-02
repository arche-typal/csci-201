package csci201.asmt20;

public class Sphere extends SolidCircularObject {
	
	public Sphere(double radius) {
		super(radius);
	}

	public double calculateSurfaceArea() {
		double surfaceArea = 4 * super.PI() * Math.pow(super.radius(), 2);
		return surfaceArea;
	}
	  
	public double calculateVolume() {
		double volume = 4.0/3.0 * super.PI() * Math.pow(super.radius(), 3);
		return volume;
	}

}
