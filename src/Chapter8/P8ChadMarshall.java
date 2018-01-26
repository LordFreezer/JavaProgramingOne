package Chapter8;
import java.util.Scanner;
/** Program that displays salesman info
 *
 * @author Chad Marshall
 */

public class P8ChadMarshall {
/** Main method - manipulates variables and displays things to the console
 * 
 * @param args 
 */
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] money;
        //money[r][c] = new double[4][5];
        String salesman, week, answer;
        do {
            do {
                System.out.println("Enter the salesman ID as A, B, C, or D: ");
                salesman = input.next().toUpperCase();
            } while (!salesman.equals("A") && !salesman.equals("B") && !salesman.equals("C") && !salesman.equals("D"));
            double r;
            switch (salesman) {
                case "A":
                    r = 0;
                    break;
                case "B":
                    r = 1;
                    break;
                case "C":
                    r = 2;
                    break;
                case "D":
                    r = 3;
                    break;
            }
            do {
                System.out.println("Enter the day as M, T, W, H, or F: ");
                week = input.next().toUpperCase();
            } while (!week.equals("M") && !week.equals("T") && !week.equals("W") && !week.equals("H") && !week.equals("F"));
            double c;
            switch (week) {
                case "M":
                    c = 0;
                    break;
                case "T":
                    c = 1;
                    break;
                case "W":
                    c = 2;
                    break;
                case "H":
                    c = 3;
                    break;
                case "F":
                    c = 4;
                    break;
            }
            System.out.println("Enter the amount of the sale: ");
            double dollars = input.nextDouble();
            do {
                System.out.println("More data? Enter Y for yes or N no: ");
                answer = input.next().toUpperCase();
            } while (!answer.equals("Y") && !answer.equals("N"));
        } while (!answer.equals("N"));
    }
}
  