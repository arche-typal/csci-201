package csci201;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {


		Random randGen = new Random();
		int dice1, dice2, total;
		
		dice1 = randGen.nextInt(6) + 1;
		dice2 = randGen.nextInt(6) + 1;
		total = dice1 + dice2;
		System.out.println("Dice 1: " + dice1 
				+ ", Dice 2: " + dice2
				+ ", Total = " + total);
	}

}
