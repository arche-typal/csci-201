package csci201;

import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		/*
		 * The PI constant is initialized in main because
		 * there is currently no need to use it in other projects
		 * as a class-level constant.
		 * It also has the final modifier 
		 * to prevent the variable from being updated.
		 * */
		final double PI = Math.PI;
		
		double radius, surfaceArea, volume;
		
		Scanner scanner = new Scanner(System.in);
		
		//Display welcome message for user.
		System.out.println("Hello!\nPlease enter the radius of a sphere below"
				+ "\nto calculate it's surface area"
				+ "\nand volume.");
		radius = scanner.nextDouble();
		
		/*
		 * Calculate the surface area.
		 * 
		 * SA = 4 * PI * (radius)^2
		 * */
		surfaceArea = 4 * PI * Math.pow(radius, 2);
		
		/*
		 * Calculate the volume.
		 * 
		 * Volume = 4/3 * PI * r
		 * Make sure at least one double is used to write out
		 * the 4/3 fraction to avoid 
		 * truncation of the decimal part.
		 */
		volume = 4.0/3.0 * PI * Math.pow(radius, 3);
		
		System.out.print("\n\nThe surface area of the sphere "
				+ "\nfor the radius given is \n" + surfaceArea
				+ "\nand the volume is \n" + volume + ".");
		
		scanner.close();
	}

}
