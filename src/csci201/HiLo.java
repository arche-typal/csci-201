package csci201;
import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[]  args) {
        /*
        Design and implement an application that plays the Hi-Lo guessing
        game with numbers.

        ~The program should pick a random number
        between 1 and 100 (inclusive)


        ~and then repeatedly prompt the
        user to guess the number.

        On each guess, report to the user that the or she is correct or that the guess is high or low. Continue ac-
        cepting guesses until the user guesses correctly or chooses to quit.

        Use a sentinel value to determine whether the user wants to quit.


        Count the number of guesses, and report that value when the user
        guesses correctly.

        At the end of each game (by quitting or a correct
        guess), prompt to determine whether the user wants to play again.
        Continue playing games until the user chooses to stop.
        */

        Random random = new Random();
        int randomNumb;
        int guess;
        int numberOfGuesses = 0;
        int sentinelVal = -1;
        boolean guessIsHigh = false;
        boolean toContinue = false;
        int answer;
        Scanner scanner = new Scanner(System.in);

        

        do {
        	randomNumb = random.nextInt(100) + 1;
        	//Remove below line after testing
            System.out.println("Random number: " + randomNumb);
            System.out.println("To guess the random number generated, enter a number between 1-100, "
            		+ "or enter -1 to quit: ");
            guess = scanner.nextInt();
            while (guess != sentinelVal) {
                while ((guess < 1 || guess > 100) && guess != sentinelVal) {
                    System.out.println("Your guess is not within the range of 1-100. Please try again: ");
                    guess = scanner.nextInt();
                }
                if ((guess > 1 || guess < 100) && guess != sentinelVal) {
                    numberOfGuesses++;
                    if (guess > randomNumb) {
                        guessIsHigh = true;
                    } else {
                        guessIsHigh = false;
                    }
                    System.out.println("Your guess is " + (guessIsHigh ? "high" : "low") + ". "
                    		+ "Please guess again: ");
                    guess = scanner.nextInt();
                }
//                System.out.println("While loop continued.");
            }
            //System.out.println("While loop ended.");
            System.out.println("Thanks for playing! Would you like to play again?"
            		+ "\nEnter -1 to fully quit and anything else to keep playing: ");
            guess = scanner.nextInt();
            if (guess == sentinelVal) {
                System.out.println("You have decided to quit.");
            }
        } while (guess != sentinelVal);

        System.out.println("Exited do loop.");

        scanner.close();

    }
}
