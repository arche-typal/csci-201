package csci201;

import java.util.Scanner;

public class SphereDriverAsmt13 {
	
	public static void main(String[] args) {
		welcomeMessage();
		double radius = getRadius();
		SphereAsmt13 sphere = new SphereAsmt13(radius);
		results(radius, sphere.calculateSurfaceArea(), sphere.calculateVolume());
	}
	
	public static void results(double radius, double surfaceArea, double volume) {
		System.out.print("\n\nThe surface area of the sphere "
				+ "\nfor the radius given of " + radius + " units is \n" + surfaceArea
				+ " square units\nand the volume is \n" + volume + " cubic units.");
	}
	
	public static void welcomeMessage() {
		System.out.println("Hello, this application calculates the surface area and volume of a sphere using the radius you provide.");
	}
	
	public static double getRadius() {
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Please enter the radius you would like to use for calculations: ");
		double radius = scanner.nextDouble();
		scanner.close();
		return radius;
	}	
}
