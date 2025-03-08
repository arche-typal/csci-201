package csci201;

import java.util.Scanner;

public class ReverseSeconds {

	public static void main(String[] args) {
		
		final int SECONDS_IN_HOUR = 60 * 60;
		final int SECONDS_IN_MINUTE = 60;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter total number of seconds: ");
		
		int totalSeconds = scanner.nextInt();
		int hours = totalSeconds / SECONDS_IN_HOUR;
		
		int seconds = totalSeconds % SECONDS_IN_HOUR;
		
		int minutes = seconds / SECONDS_IN_MINUTE;
		
		seconds = seconds % SECONDS_IN_MINUTE;
		
		System.out.print("There are " + hours + " hours and, " 
		+ minutes + " minutes, and " 
				+ seconds + " seconds in " + totalSeconds + " total seconds.");
		
		scanner.close();
	}
}
