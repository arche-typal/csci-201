package csci201;
import java.util.Random;
import java.util.Scanner;

public class HiLoInClass {
    public static void main (String[] args) {
        Random randGen = new Random();
        Scanner scanner = new Scanner(System.in);
        int randNum, guess;
        int numOfAttempts = 0;
        String response;
        do {
            randNum = randGen.nextInt(100) + 1;
            System.out.println("randNum " + randNum);
            System.out.println("A random number between 1 and 100 is picked.");
            do {
                System.out.println("Enter your guess (out a number outside the range 1-100 to quite): ");
                guess = scanner.nextInt();
                if (guess < 1 || guess > 100)
                    System.out.println("You have decided to quit after " + numOfAttempts + " attempts to guess correctly.");
                else {
                    numOfAttempts++;
                    System.out.println("Your guess is " + guess);
                    if (guess == randNum) {
                        System.out.println("Your guess is " + guess + " is correct." +
                                "\nIt took you " + numOfAttempts + " attempts to guess correctly.");
                    } else if (guess < randNum) {
                        System.out.println("Your guess is " + guess + " is low. Guess again.");
                    } else {
                        System.out.println("Your guess is " + guess + " is high. Guess again.");
                    }
                }
            } while (guess != randNum && guess >= 1 && guess <= 100);
            System.out.println("The number that was picked randomly was " + randNum);
            System.out.print("Enter 'Y' to play another game, or 'N' to quite: ");
            response = scanner.next();
        } while (response.charAt(0) == 'Y' || response.charAt(0) == 'y');
        scanner.close();
        System.out.println("Thanks for using the app.");
    }
}
