package javacourse.asmt20;

import java.util.Scanner;

public class CylinderDriver {

	public static void main(String[] args) {
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		welcomeMessage();
		double radius = getRadius(scanner);
		double height = getHeight(scanner);
		Cylinder cylinder = new Cylinder(radius, height);
		results(radius, height, cylinder.calculateSurfaceArea(), cylinder.calculateVolume());
	
		scanner.close();
	}
	
	public static void results(double radius, double height, double surfaceArea, double volume) {
		System.out.print("\n\nThe surface area of the cylinder "
				+ "\nfor the radius given of " + radius + " units and the given height of " + height + " units is \n" + surfaceArea
				+ " square units\nand the volume is \n" + volume + " cubic units.");
	}
	
	public static void welcomeMessage() {
		System.out.println("Hello, this application calculates the surface area and volume of a cylinder using the radius and height you provide.");
	}
	
	public static double getRadius(Scanner scanner) {
		System.out.println("Please enter the radius you would like to use for calculations: ");
		double radius = scanner.nextDouble();
		return radius;
	}
	
	public static double getHeight(Scanner scanner) {
		System.out.println("Please enter the height you would like to use for calculations: ");
		double height = scanner.nextDouble();
		return height;
	}

}
