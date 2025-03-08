package csci201;

import java.util.Scanner;

public class Circle {
	public final static double  PI = Math.PI;
	//static = "goes with class"
	
	public static void main(String[] args) {
		double radius, circumference, area;
		Scanner scanner; 
		scanner = new Scanner(System.in);
		System.out.println("This app calculates the circumference and "
				+ "area of a circle.");
		System.out.print("Enter the radius: ");
		radius = scanner.nextDouble(); //converts to double
		circumference = 2 * PI * radius;
		area = PI * Math.pow(radius, 2);
		System.out.println("PI = " + PI);
		System.out.println("Radius = " + radius 
				+ ", Circumference = " + circumference
				+ ", Area = " + area);
	}
}