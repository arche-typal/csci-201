package csci201;

/*
	Write an Object-oriented Java program that reads one input, the radius of a sphere, from the user and displays the sphere's surface area and volume.
	
	Instructions:
	
	*Create a class named Sphere (or something meaningful) that defines a new data type (a new type of object) with one instance attribute containing the 
	*sphere's radius and 
	*three instance methods that return the 
	*radius, 
	*surface area, and 
	*volume of the sphere. 
	
	Write another class named SphereDriver (or something meaningful) that creates an object of the type Sphere class by providing a radius you get from the user.
	
	~Give meaningful names to all the identifiers (class names, attribute names, method names, local variable names, and parameter variable names) you create in your program. Before submission, test and fix your program to ensure it runs without errors.
	
	~I have attached the source codes of a simplified version of a similar program we did in class. Use these as a guideline.
	
	~Submission Instructions: 
	
	~Submit only the source code (*.java) files, such as Sphere.java and SphereDriver.java.
*/

public class SphereAsmt13 {

	public static final double PI = Math.PI;

	//Create a class named Sphere (or something meaningful) that defines a new data type (a new type of object) 

	//with 
	//one instance attribute containing the sphere's radius 
	private double radius;
	
	public SphereAsmt13(double radius) {
		this.radius = radius;
	}
	
	//and three instance methods that return the radius, 
	//getter method
	public double radius() {
		return radius;
	}

	//surface area, and
	public double calculateSurfaceArea() {
		double surfaceArea = 4 * PI * Math.pow(radius, 2);
		return surfaceArea;
	}
	 
	//volume of the sphere. 
	public double calculateVolume() {
		double volume = 4.0/3.0 * PI * Math.pow(radius, 3);
		return volume;
	}
	
}
