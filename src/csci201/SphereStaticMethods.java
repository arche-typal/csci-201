package csci201;

import java.util.Scanner;

public class SphereStaticMethods {
	final static double PI = Math.PI;
	static double radius;
	static double surfaceArea;
	static double volume;
	
	public static double readInput() {
		System.out.print("Hello, please enter the radius to calculate the aurface area and volume: ");
		Scanner scanner = new Scanner(System.in);
		double radius = scanner.nextDouble();
		scanner.close();
		return radius;
	}
	
	public static double calculateSurfaceArea(double radius) {
		double surfaceArea = 4 * PI * Math.pow(radius, 2);
		return surfaceArea;
	}
	
	public static double calculateVolume(double radius) {
		volume = 4.0/3.0 * PI * Math.pow(radius, 3);
		return volume;
	}
	
	public static void displayResults(double radius, double surfaceArea, double volume) {
		System.out.print("The surface area for the radius given  is " + surfaceArea + "."
				+ "\nThe voume is " + volume + ".");
	}
	
	public static void main(String[] args) {
		radius = readInput();
		surfaceArea = calculateSurfaceArea(radius);
		volume = calculateVolume(radius);
		displayResults(radius, surfaceArea, volume);
	}
}