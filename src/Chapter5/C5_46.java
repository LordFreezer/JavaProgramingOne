package Chapter5;

import java.util.Scanner;

/**
 * program that reverses user string
 *
 * @author Chad Marshall
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args - displays output to console
     */
    public static void main(String[] args) {
        /**
         * string - is user input reverse - is just "", but is manipulated later
         *
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string... ");
        String string = input.nextLine();

        String reverse = "";
        for (int k = string.length() - 1; k >= 0; k--) {
            reverse += string.charAt(k);
        }
        System.out.println("The reversed string reads: " + reverse);

    }

}
