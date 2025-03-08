package csci201;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        int number;
        int multiplier;
        int result;
        int max_number;
        int max_multiplier = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number up to which you want the multiplication table:");
        max_number = scanner.nextInt();
        System.out.println("Enter maximum multiplier you want to go up to:");
        max_multiplier = scanner.nextInt();

        number = 2;
//        while(number <= max_number) {
//            System.out.println();
//            System.out.println("Multiplication table for " + number);
//            System.out.println();
//            multiplier = 1;
//            while (multiplier <= max_multiplier) {
//                result = number * multiplier;
//                System.out.println(number + " X " + multiplier + " = " + result);
//                multiplier++;
//            }
//            number++;
//        }


        for(number = 2; number <= max_number; number++) {
            System.out.println();
            System.out.println("Multiplication table for " + number);
//            System.out.println();
//            multiplier = 1;
//            for (;multiplier <= max_multiplier;) {
            for (multiplier=1; multiplier <= max_multiplier; multiplier++) {
                result = number * multiplier;
                System.out.println(number + " X " + multiplier + " = " + result);
//                multiplier++;
            }
//            number++;
        }


//        while (multiplier <= max_multiplier) {
//            result = max_number * multiplier;
//            System.out.println(max_number + " X " + multiplier + " = " + result);
//            multiplier++;
//
//        }

        multiplier = 1;

//        for (multiplier = 1; multiplier <= max_multiplier; multiplier++) {
//            result = max_number * multiplier;
//            System.out.println(max_number + " X " + multiplier + " = " + result);
////            multiplier++;
//        }

        System.out.println("Thank you for using the app.");
        scanner.close();
    }
}