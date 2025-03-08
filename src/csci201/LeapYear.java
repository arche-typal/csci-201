package csci201;

import java.util.Scanner;

public class LeapYear {

	/*
	 * Work was checked using this website:
	 * https://www.omnicalculator.com/everyday-life/leap-year
	 * */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int year;
		String yearStr;
		boolean isCenturyYear = false;
		System.out.print("Hello, please enter a year to check if it's a leap year. "
				+ "\nMake sure to enter a year greater than or equal to 1582: ");
		year = scanner.nextInt();
		
		//Check if year is less than 1582
		if (year > 1582) {
			/*
			 * I was reading leap years need to be checked if they're divisible by 100 and 400
			 * only if they're century years (i.e. 1600, 1700)
			 * 
			 * So, I'm checking if the year entered is a century year
			 * before deciding how to calculate it.
			 * */
			
			yearStr = String.valueOf(year);
			yearStr = yearStr.substring(yearStr.length()-2);
			
			if (yearStr.equals("00")) {
				isCenturyYear = true;
			}
			
			if (isCenturyYear) {
				if (year%4 == 0 && year%100 == 0 && year%400 == 0) {
					System.out.println("Yep, this is a leap year!!");
				} else {
					System.out.print("Sorry, this is not a leap year!");
				}
			} else if (year%4 == 0) {
				System.out.println("Yep, this is a leap year!");
			} else {
				System.out.print("Sorry, this is not a leap year!");
			}
		} else {
			System.out.print("Sorry, please select a year greater than or equal to 1582.");
		}
		scanner.close();
	}
}
