package Chapter6;

import java.util.Scanner;

/**
 * program that converts currency
 *
 * @author Chad Marshall
 */
public class P6 {

    static Scanner globalInput = new Scanner(System.in);

    /**
     *
     * @param e getter for euros
     * @return - returns euros
     */
    public static double GetEuro(double e) {
        System.out.println("How many Euros will a dollar buy?...");
        e = globalInput.nextDouble();
        return e;
    }

    /**
     *
     * @param p getter for pounds
     * @return returns pounds
     */
    public static double GetPound(double p) {
        System.out.println("How many Pound Sterling will a dollar buy?...");
        p = globalInput.nextDouble();
        return p;
    }

    /**
     *
     * @param y getter for yen
     * @return returns yen
     */
    public static double GetYen(double y) {
        System.out.println("How many Yen will a dollar buy?...");
        y = globalInput.nextDouble();
        return y;
    }

    /**
     *
     * @param d getter for dollars
     * @return returns dollars
     */
    public static double GetDollar(double d) {
        System.out.println("enter the number of dollars you would like to convert...");
        d = globalInput.nextDouble();
        return d;
    }

    /**
     *
     * @param newCharge gets the charge that is manipulated by tax
     * @return returns the newCharge
     */
    public static double SetDollar(double newCharge) {
        /**
         * Dollars is a limit that assist with calculating tax
         */
        double Dollars = 0;
        Dollars = GetDollar(Dollars);
        if (Dollars > 100) {
            newCharge = Dollars - (Dollars * .05);
        } else {
            newCharge = Dollars - (Dollars * .10);
        }
        return newCharge;
    }

    /**
     * Main Method
     *
     * @param args prints output to console
     */
    public static void main(String[] args) {
        /**
         * yen, euro, pound, newCharge - vessels that will hold the values that
         * were made in the static double methods x,y - conditions for loops
         * newValue - changes newCharge choice, choice2 - user choice for input
         */
        Scanner input = new Scanner(System.in);
        double yen = 0, euro = 0, pound = 0;
        double newCharge = 0;
        int x = 0;
        int y = 0;
        euro = GetEuro(euro);
        pound = GetPound(pound);
        yen = GetYen(yen);
        do {
            newCharge = SetDollar(newCharge);
            System.out.println("What would you like to convert to dollars?...");
            System.out.println("'E' for euros, 'P' for pound sterling, and 'Y' for yen...");
            double newValue = 0;
            String choice = input.next();
            switch (choice) {
                case "E":
                case "e":
                    newValue = Math.round((euro * newCharge) * 100000d) / 100000d;
                    System.out.println("For $" + newCharge + ", you will be able to buy  " + newValue + " euros");
                    break;
                case "P":
                case "p":
                    newValue = Math.round((pound * newCharge) * 100000d) / 100000d;
                    System.out.println("For $" + newCharge + ", you will be able to buy  " + newValue + " pounds");
                    break;
                case "Y":
                case "y":
                    newValue = Math.round((yen * newCharge) * 100000d) / 100000d;
                    System.out.println("For $" + newCharge + ", you will be able to buy  " + newValue + " yen");
                    break;
                default:
                    break;
            }

            do {
                System.out.println("Would you like to do more conversions?.. type 'yes' or 'no'");
                String choice2 = input.next();
                switch (choice2) {
                    case "yes":
                    case "Yes":
                        x = 0;
                        y = 1;
                        break;
                    case "no":
                    case "No":
                        System.exit(0);
                    default:
                        ///x=0;
                        y = 0;
                }
            } while (y != 1);
        } while (x != 1);
    }
}
