package csci201;
import java.util.Scanner;

public class LeapYearTwo {

	/*
	 * Work was checked using this website:
	 * https://www.omnicalculator.com/everyday-life/leap-year
	 * */

	public static void main(String[] args) {
		final int GREGORIAN_START = 1582;
		Scanner scanner = new Scanner(System.in);
		int year;
		String yearStr;
		boolean isCenturyYear = false;
		System.out.print("Hello, please enter a year to check if it's a leap year. "
				+ "\nMake sure to enter a year greater than or equal to 1582: ");
		year = scanner.nextInt();
		System.out.print("The year you have entred is " + year);
		//Check if year is less than 1582
		if (year > GREGORIAN_START) {

			//check if century year
			if (year % 100 == 0) {
				isCenturyYear = true;
			}

			if (isCenturyYear) {
				if (year%400 == 0)
					System.out.println("\nYep, this is a leap year!!");
				else
					System.out.print("\nSorry, this is not a leap year!");

			} else if (year%4 == 0)
				System.out.println("\nYep, this is a leap year!");
		}
		scanner.close();
	}
}
