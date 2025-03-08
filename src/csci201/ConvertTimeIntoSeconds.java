package csci201;

import java.util.Scanner;

public class ConvertTimeIntoSeconds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int HOUR_TO_MINUTES = 60;
		final int MINUTES_TO_SECONDS = 60;
		
		int hours, minutes, seconds;
		
		System.out.print("Hello, enter the hours, minutes, and seconds."
				+ "\nIt will be converted into total number of seconds."
				+ "\n"
				+ "\nFirst enter the hours: ");
		hours = scanner.nextInt();
		System.out.print("Next enter the minutes: ");
		minutes = scanner.nextInt();
		System.out.print("Next enter the seconds: ");
		seconds = scanner.nextInt();
		seconds = seconds + (hours * HOUR_TO_MINUTES * MINUTES_TO_SECONDS) + (minutes * MINUTES_TO_SECONDS);
		System.out.print("The total amount of seconds is: " + seconds);
		
		scanner.close();
	}

}
