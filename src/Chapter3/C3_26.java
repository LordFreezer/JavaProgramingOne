package Chapter3;

import java.util.Scanner;

/**
 * program that gathers an integer of choice and decides if it is divisible by
 *
 * @author Chad Marshall
 */
public class C3_26 {

    /**
     *
     * Main Method
     *
     * @param args argument from command line prompt
     *
     */
    public static void Main(String[] args) {
        // input records data from user input
        //integer is a int number that is retrieved by user as input

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer...");
        int integer = input.nextInt();
        System.out.println("Is it divisible by 5 and 6? " + ((integer % 5 == 0) && (integer % 6 == 0)));
        System.out.println("Is it divisible by 5 or 6? " + ((integer % 5 == 0) || (integer % 6 == 0)));
        System.out.println("Is it divisible by 5 or 6, but not both? " + ((integer % 5 == 0) ^ (integer % 6 == 0)));
    }
}
