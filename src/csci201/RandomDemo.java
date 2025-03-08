package csci201;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random randomGen = new Random();
		
		int i1 = randomGen.nextInt();
		System.out.println("A random number: " + i1);
		i1 = randomGen.nextInt();
		System.out.println("Another random number: " + i1);
		
		i1 = randomGen.nextInt(2);
		System.out.println("i1 = " + i1);
		
		i1 = randomGen.nextInt(10) - 9;
		System.out.println("i1 = " + i1);
		
		float f1 = randomGen.nextFloat();
		System.out.println("floating random number: " + f1);
	}
}