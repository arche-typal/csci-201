package csci201;

import java.util.Random;

public class RandomToTwentyFive {

	public static void main(String[] args) {
		/*
		 * Write a Java program that simulates picking three random numbers between 1 and 25 for a lottery. 
		 * The numbers can be repeated; 
		 * for example, it can choose 7 for all three numbers.
		 */
		
		int randNumOne, randNumTwo, randNumThree;
		
		Random random = new Random();
		randNumOne = random.nextInt(25) + 1;
		randNumTwo = random.nextInt(25) + 1;
		randNumThree = random.nextInt(25) + 1;
		
		System.out.print("Your three lottery numbers, from 1 to 25, are " + randNumOne + ", " + randNumTwo + ", and " + randNumThree + ".");
	}
}