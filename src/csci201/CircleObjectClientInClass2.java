package csci201;

import java.util.Scanner;

public class CircleObjectClientInClass2 {

	public static void main(String[] args) {	
		displayIntro();
		double radius = getInput();
		CircleObject circle = new CircleObject(radius);
		displayResults(radius, circle.calculateCircumference(), circle.calculateArea());
	}
	
	public static double getInput() {
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = scanner.nextDouble();
		scanner.close();
		return radius;
	}
	
	public static void displayResults(double radius, double circumference, double area) {
		System.out.println("PI = " + CircleObjectInClass.PI);
		System.out.println("Radius = " + radius + ", Circumference = " + circumference +
				", Area = " + area);
	}
	
	public static void displayIntro() {
		System.out.println("This application calculates the circumference and "
				+ "area of a circle.");
	}
	
}
