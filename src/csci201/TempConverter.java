package csci201;

import java.util.Scanner;

public class TempConverter {
	public static void main(String[] args) {
		Double fahrenheit, celsius; 
		System.out.print("Hello, this program converts Fahrenheit to Celsius. \nPlease enter the Fahrenheit: ");
		Scanner scanner = new Scanner(System.in);
		fahrenheit = scanner.nextDouble();
		//Formula: (F - 32)5/9  = C
		celsius = (fahrenheit - 32.0) * 5.0/9.0;
		System.out.print(fahrenheit + " converted to Celsius is: " + celsius);
		scanner.close();
	}
}
