package Chapter2;

import java.util.Scanner;

/**
 * program that calculates the area of a cylinder
 *
 * @author Chad Marshall
 */
public class C2_2 {

    /**
     *
     * Main Method
     *
     * @param args argument from command line prompt
     *
     */
    public static void main(String[] args) {
        // input is the scanner that records data entered by user and stores it into raduis
        // radius is the varible that is retrieved by the user
        // length is the next varible that is retrieved by the user
        // volume is made up of the varibles area multiplied by length
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a raduis of a cylinder...");
        double radius = input.nextDouble();

        System.out.println("Enter a length of a cylinder...");
        double length = input.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("The area is " + area + ". The volume is " + volume);

    }

}
