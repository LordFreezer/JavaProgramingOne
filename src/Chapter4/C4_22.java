package Chapter4;

import java.util.Scanner;

/**
 * program evaluates strings entered by user and compares the second string to
 * the first string to test substrings
 *
 * @author Chad Marshall
 */
public class C4_22 {

    /**
     *
     * Main Method
     *
     * @param args argument from command line prompt
     *
     */
    public static void main(String[] args) {
        // input is a scanner that records data
        // s1 and s2 are the first and second string that the user enters respectivly
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = input.next();
        System.out.print("Enter the second string: ");
        String s2 = input.next();
        System.out.println(s2 + ((s1.contains(s2)) ? " is " : " is not ") + "a substring of " + s1);
    }

}
