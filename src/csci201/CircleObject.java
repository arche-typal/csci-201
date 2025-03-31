package csci201;

public class CircleObject {
	
	//static (class) attributes
	public final double  PI = Math.PI;
	
	//instance (object) attributes
	private double radius;
	
	public CircleObject(double radius) {
		this.radius = radius;
	}
	
	//getter methods	
	public double radius() {
		return radius;
	}
	
	//setter method
	public double setRadius(double radius) {
		this.radius = radius;
		return this.radius;
	}
	
	//instance operations
	public double calculateCircumference() {
		double circumference = 2 * PI * radius;
		return circumference;
	}
	
	public double calculateArea() {
		double area = PI * Math.pow(radius, 2);
		return area;
	}
}
