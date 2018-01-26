package Chapter7;

import java.util.Scanner;

/**
 * Program that tells which number is the min
 *
 *
 * @author Chad Marshall
 */
public class C7_9 {

    /**
     * Main method that displays stuff to console
     *
     * @param args displays things to command prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The minimum number is: " + min(numbers));
    }

    /**
     * Method tests to see what the min number is
     *
     * @param array gets values form numbers
     *
     * @return returns the min
     */
    public static double min(double[] array) {

        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;

    }
}
