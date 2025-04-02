package csci201;

public class CircleObjectInClass {
	
	// static (class) attribute
	
	public static final double PI = Math.PI;
	
	// instance (object) attributes
	
	private double radius;
	
	// constructor
	
	public CircleObjectInClass(double radius) {
		this.radius = radius;
	}
	
	// getter methods
	
	public double radius() {
		return radius;
	}
	
	// setter methods
	/* making the object immutable
	public void setRadius(double radius) {
		this.radius = radius;
	}
	*/
	// instance operations
	
	public double calculateCircumference() {
		double circumference = 2 * PI * radius;
		return circumference;
	}
	
	public double calculateArea() {
		double area = PI * Math.pow(radius, 2);
		return area;
	}
}
