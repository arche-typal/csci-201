package csci201;
public class OperatorsTwo {

    public static void main(String[] args) {
        boolean b;
        b = 2 < 1|| 1 < 2;
        System.out.println("b = " + b);

        b = 2 < 1 || 1 > 2; // short circuit
        System.out.println("b = " + b);

        b = 2 < 1 && 1 > 2; // short circuit
        System.out.println("b = " + b);

        int i = 1;
        b = i > 0 || i++ < 5;
        System.out.println("b = " + b);
        System.out.println("i = " + i);
        // i = 1 due to short circuit

        i = 1;
        b=i < 0 || i++ < 5; // NO short circuit
        System.out.println("b = " + b);
        System.out.println("i = " + i);

        b = 2 > 1 && 4 > 2;
        System.out.println("b = " + b);

        b = 2 < 1 && 4 > 2;
        System.out.println("b = " + b);

        i = 1;
        b = i > 0 && i++ < 5; // NO short circuit
        System.out.println("b = " + b);
        System.out.println("i = " + i);
        // i = 1 due to short circuit

        i = 1;
        b=i < 0 && i++ < 5; // short circuit
        System.out.println("b = " + b);
        System.out.println("i = " + i);

        boolean t = true, f = false;
        b = t || f && false; // t || (f && false)
        System.out.println("b = " + b);

        b = ! t && f; // (!t) && f
        System.out.println("b = " + b);

        int speed = 60;

        if (speed  < 40 || speed > 70) {
            System.out.println("Your speed is outside the limit.");
        } else {
            System.out.println("Your speed is within the limit.");
        }

        if (!(speed  < 40 || speed > 70)) {
            System.out.println("Your speed is within the limit.");
        } else {
            System.out.println("Your speed is outside the limit.");
        }

        if (!(speed  < 40) && !(speed > 70)) {
            System.out.println("Your speed is within the limit.");
        } else {
            System.out.println("Your speed is outside the limit.");
        }

        if (speed  >= 40 && speed <= 70) {
            System.out.println("Your speed is within the limit.");
        } else {
            System.out.println("Your speed is outside the limit.");
        }
    }
}
