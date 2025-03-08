package csci201;

import java.util.Scanner;

public class AverageOfThreeIntegers {

	public static void main(String[] args) {
		//I made the variables Doubles because I'm not sure how large the numbers the user enters will be.
		Double numOne, numTwo, numThree, average;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hello, this program reads three integers and prints their average. \nPlease enter the first number: ");
		numOne = scanner.nextDouble();
		System.out.print("Please enter the second number: ");
		numTwo = scanner.nextDouble();
		System.out.print("Please enter the third number: ");
		numThree = scanner.nextDouble();
		average = (numOne + numTwo + numThree) / 3.0;
		System.out.print("The average is: " + average);
		scanner.close();
	}
}
