package Chapter6;

import java.util.Scanner;

/**
 * prgram that checks passwords
 *
 * @author Chad Marshall
 */
public class C6_18 {

    /**
     *
     * Main Method
     *
     * @param args argument from command line prompt
     *
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Password... ");
        String Password = input.next();
        if (goodPassMethod(Password) == true) {
            System.out.println("Password Valid");
        } else {
            System.out.println("Pasword Invalid");
        }
    }

    /**
     *
     * @param passWord - gets length of password
     * @return - returns goodPass
     */
    public static boolean goodPassMethod(String passWord) {
        /**
         * MAX -upper limit MIN - lower limit goodPass - returns final result
         */

        final int MAX = 8;
        final int MIN = 2;
        boolean goodPass = goodLengthMethod(passWord, MAX) && noSpecialChar(passWord) && hasNumbers(passWord, MIN);
        return goodPass;
    }

    /**
     * public boolean
     *
     * @param password gets length of password
     * @param goodLength applies limits
     * @return - returns that result
     */
    public static boolean goodLengthMethod(String password, int goodLength) {

        return password.length() >= goodLength;
        ///return password.length() >= 8; 
    }

    /**
     * public boolean
     *
     * @param passWord - parameter that gets length of password
     * @return - returns bool as true or false
     */
    public static boolean noSpecialChar(String passWord) {

        for (int i = 0; i < passWord.length(); i++) {
            if (!Character.isLetterOrDigit(passWord.charAt(i))) {
                return false;
            }

        }
        return true;
    }

    /**
     * public boolean
     *
     * @param passWord - password is a parameter that gets the length of the
     * password
     * @param Number - is parameter that is compared to num that goes up when
     * password is checked
     * @return - returns the boolean as false if not true
     */
    public static boolean hasNumbers(String passWord, int Number) {
        /**
         * num is an accumulator that goes up when password is checked
         *
         */
        int num = 0;
        for (int i = 0; i < passWord.length(); i++) {
            if (Character.isDigit(passWord.charAt(i))) {
                ///num++;
                ++num;
            }
            if (num >= Number) {
                return true;
            }

            /*f(num <= Number)
                        {
                            return false;
                        }
                        else
                        {
                            return true;
                        }*/
        }
        return false;
    }

}
