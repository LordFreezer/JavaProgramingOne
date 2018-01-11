
package Chapter3;
import java.util.Scanner;
/**  program that plays heads or tails
 *
 * @author Chad Marshall
 */
public class C3_14 {
        /**
 *
 * Main Method 
 * 
 * @param args argument from command line prompt  
 * 
 */
   public static void Main(String[] args)
	{
            // Result - variable that is the value for the result between userGuess
            // userGuess - user input for the guess
            // input - a scanner that stores user input into userGuess
	int Result;

	Result = (int)(Math.random() * 2); //Something different from c#
	Scanner input = new Scanner(System.in);
	System.out.println("Heads or Tails??? 1 for heads, 0 for tails");
	int userGuess = input.nextInt();
	if (userGuess == Result)
		{
		System.out.println("Bingo!");
		}
		else
		{
		System.out.println("GET BETTER AT GUESSING M8");
		}
	}
}
