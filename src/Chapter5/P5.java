package Chapter5;

import java.util.Scanner;

/**
 * program that takes a poll for those who have voted
 *
 * @author Chad Marshall
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args - outputs stuff to console
     */
    public static void main(String[] args) {
        /**
         * x - conditions for loop voteYes, voteNo - accumulators that add votes
         * isValid - returns true or false, also a condition for loop vote - is
         * choice for userinput
         */
        Scanner input = new Scanner(System.in);
        int x = 0;
        int voteYes = 0;
        int voteNo = 0;
        boolean isValad = true;
        do {
            do {
                isValad = true;
                {
                    System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting and display the results");
                    String vote = input.next();
                    switch (vote) {
                        case "Y":
                        case "y":
                            voteYes = voteYes + 1;
                            break;
                        case "N":
                        case "n":
                            voteNo = voteNo + 1;
                            break;
                        case "Q":
                        case "q":
                            x = 10;
                            System.out.println("The number of 'yes' votes are " + voteYes + " and the number of 'no' votes are " + voteNo);

                            break;
                        default:
                            System.out.print("INVALID CODE:");

                            break;
                    }
                }
            } while (!isValad);
        } while (x < 1);
    }
}
