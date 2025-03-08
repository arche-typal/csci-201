package csci201;
import java.util.Scanner;

public class LeapYearInClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        final int GREGORIAN_START = 1582;
        Scanner scanner = new Scanner(System.in);
        boolean toContinue = true;
        int year = scanner.nextInt();

        do {
            System.out.println("Enter a year (or negative value to quit): ");
            if (year < 0) {
                toContinue = false;
                System.out.println("You have asked to quit.");
            } else {
                System.out.println("You have entered the year " + year);
                if (year < GREGORIAN_START)
                    System.out.println("Leap year system did not start until the year " +
                            GREGORIAN_START + " so " + year + " is not a valid input.");
                boolean isLeapYear = false;
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                    isLeapYear = true;
                if (isLeapYear)
                    System.out.println(year + " is a leap year.");
                else
                    System.out.println(year + " is NOT a leap year.");
            }
        } while (year >= 0);
        System.out.println("Thanks for using the app!");
        scanner.close();
    }
}
