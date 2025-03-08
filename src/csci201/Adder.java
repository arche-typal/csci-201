package csci201;

import java.util.Scanner;

public class Adder {
	/*
	 * This method reads two integers
	 * and adds them together
	 * and displays the result
	 */
	public static void main(String[] args) {
		//Can use $ and _. Cannot start with digit, can use digits otherwise
		int firstNumber, secondNumber = 7, result; //declare variables
		//secondNumber = firstNumber; //gives error because firstNumber has not been assigned a value.
		
		Scanner scanner = new Scanner(System.in);
		//Scanner scanner;
		//scanner = new Scanner;
		
		//thing on the left is an address for the value on of the object (aka what's on the right).
		//firstNumber = 59 + 2;
		//secondNumber = 9;
		//String intro = new String("Welcome to the Adder App"); //also valid
		
		//String intro = "Welcome to the Adder App";
		//System.out.println(intro);
		
		System.out.println("Welcome to the Adder App");
		System.out.println("Enterr the first number: ");
		firstNumber = scanner.nextInt();
		System.out.println("Enterr the second number: ");
		secondNumber = scanner.nextInt();
		result = firstNumber + secondNumber;
		System.out.println(firstNumber + " + " + secondNumber + " = " + result);
		
		//secondNumber = 9; //can update variable.
		
		//result stored in binary, then translated into Strings
	}
}
