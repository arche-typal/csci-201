 package csci201;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		int rectangleLength, rectangleWidth, rectangleArea;
		
		Scanner scanner = new Scanner(System.in);
		
		//display welcome message
		System.out.println("Welcome! Let's calculate the area of a rectangle.");
		//get length from user
		System.out.print("Enter the rectangle's length: ");
		rectangleLength = scanner.nextInt();
		//get width from user
		System.out.print("Enter the  rectangle's width: ");
		rectangleWidth = scanner.nextInt();
		
		//calculate area
		rectangleArea = rectangleLength * rectangleWidth;
		System.out.print("The rectangle's length of " 
		+ rectangleLength
		+ "\nmultiplied by the rectangle's width of " 
		+ rectangleWidth + "\nis equal to an area of " 
		+ rectangleArea + ".");

	}

}
