package Chapter2;

import java.util.Scanner;

/**
 * program that converts celsius to fahrenheit
 *
 * @author Chad Marshall
 */
public class C2_1 {

    /**
     *
     * Main Method
     *
     * @param args argument from command line prompt
     *
     */
    public static void main(String[] args) {
        //input is a scanner to take user input for Celsius
        //celsuis is the varible that stores user input to later be manipulated 
        //fahrenheit is the varible that stores a new varible by manipulating celsius 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius...");
        double celsuis = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsuis + 32;
        System.out.println(" The temp is " + fahrenheit + " degrees");

    }
}
