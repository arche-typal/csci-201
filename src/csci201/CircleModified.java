package csci201;

import java.util.Scanner;

public class CircleModified {
	public final static double  PI = Math.PI;
	
	public static void main(String[] args) {
		double radius, circumference, area;
		// intro
		displayIntro();
		// get radius
		radius = getInput();
		// calculate circumference
		circumference = calculateCircumference(radius);
		// calculate area
		area = calculateArea(radius);
		// display results
		displayResults(radius, circumference, area);
	}
	
	public static double calculateCircumference(double radius) {
		double circumference = 2 * PI * radius;
		return circumference;
	}
	
	public static double calculateArea(double radius) {
		double area = PI * Math.pow(radius, 2);
		return area;
	}
	
	public static double getInput() {
		Scanner scanner; 
		scanner = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = scanner.nextDouble();
		scanner.close();
		return radius;
	}
	
	public static void displayResults(double rad, double cir, double a) {
		/* 
		 * variables are never passed, only values
		 * PI = 3.141592653589793, double rad = 4.0, double cir = 25.132741228718345, double a = 50.26548245743669
		 */
		System.out.println("PI = " + PI);
		System.out.println("Radius = " + rad 
				+ ", Circumference = " + cir
				+ ", Area = " + a);
	}
	
	/*
	If called outside of class = public, 
	if called within class = private,
	static - goes with the class, you can not make an object out of it. 
	Right now, we are making a library of functions.
	Next class we'll learn the object-oriented way.
	*/
	public static void displayIntro() {
		System.out.println("This app calculates the circumference and "
				+ "area of a circle.");
	}
}