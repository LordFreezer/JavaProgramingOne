package Chapter2;

import java.util.Scanner;

/**
 * program that calculates the gratuity and total of something
 *
 * @author Chad Marshall
 */
public class C2_5 {

    /**
     *
     * Main Method
     *
     * @param args argument from command line prompt
     *
     */
    public static void Main(String[] args) {
        // input is the scanner that records user data and stores it into
        // subTotal is a variable that is recorded from the user input
        //gratuityRate is a variable that is recorded from the user input
        // Gratuity is a variable that is gratuityRate divided by 100, and then it is multiplied by subTotal
        // Total is a varible that is the subTotal plus Gratuity

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal...");
        double subTotal = input.nextDouble();

        System.out.println("Enter the gratuity rate as a percentege...");
        double gratuityRate = input.nextDouble();

        double Gratuity = (gratuityRate / 100) * subTotal;
        double Total = subTotal + Gratuity;

        System.out.println("The gratuity is $" + Gratuity + " and the total is $" + Total);
    }

}
