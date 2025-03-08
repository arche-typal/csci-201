package csci201;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		final double PASSING_SCORE = 60;
		char grade;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your score in the range 0 to 100: ");
		double score = scanner.nextDouble();
		while (score > 100 || score < 0) {
			System.out.print("Sorry, that score is not within range of 0-100. Please re-enter the score: ");
			score = scanner.nextDouble();
		}
		if (score < PASSING_SCORE) {
			System.out.println("Sorry! You have failed.");
			grade = 'F';
		} 
		else 
		{
			System.out.println("Congratulations, you have passed!");
			if (score < 70)
				grade = 'D';
			else if (score < 80)
				grade = 'C';
			else if (score < 90)
				grade = 'B';
			else
				grade = 'A';			
		}
		System.out.println("Your grade is " + grade + "\nThanks for using this app!");
	}
}
