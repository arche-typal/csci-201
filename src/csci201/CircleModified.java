package csci201;

public class CircleModified {
	public final static double  PI = Math.PI;
	
	public static double calculateCircumference(double radius) {
		double circumference = 2 * PI * radius;
		return circumference;
	}
	
	public static double calculateArea(double radius) {
		double area = PI * Math.pow(radius, 2);
		return area;
	}
}