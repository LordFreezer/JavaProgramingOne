package Chapter3;

import java.util.Scanner;

/**
 * program that compares the weights and prices of bags and tells the user which
 * is a better deal
 *
 * @author Chad Marshall
 */
public class C3_33 {

    /**
     *
     * Main Method
     *
     * @param args argument from command line prompt
     *
     */
    public static void Main(String[] args) {
        // input a scanner that records user input
        // weight1 and weight2 - they are varibles that are recorded by input 
        // cost1 and cost 2 - they are the cost of each bag respectivley 
        Scanner input = new Scanner(System.in);
        System.out.println("How much did bag 1 weigh?.");
        double weight1 = input.nextDouble();
        System.out.println("How much did bag 1 cost?..");
        double cost1 = input.nextDouble();
        System.out.println("How much did bag 2 weigh?...");
        double weight2 = input.nextDouble();
        System.out.println("How much did bag 2 cost?....");
        double cost2 = input.nextDouble();
        if (cost1 / weight1 < cost2 / weight2) {
            System.out.println("Bag 1 has the better value.");
        } else if (cost1 / weight1 > cost2 / weight2) {
            System.out.println("Bag 2 has the better value.");
        } else {
            System.out.println("Both bags have the same price.");
        }
    }
}
