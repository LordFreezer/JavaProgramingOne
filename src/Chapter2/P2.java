
package Chapter2;
import java.util.Scanner;
/**   program that calculates the cost of the average American meal
 *
 * @author Chad Marshall
 */
public class P2 {
        /**
 *
 * Main Method 
 * 
 * @param args argument from command line prompt  
 * 
 */
    public static void main(String[] args) 
    {
        //input record user data and store it as another varible
        //food is the monetary value of the food
        //drink is the monetary value of the drink
        //desert is the monetary value of the desert
        //meal is the total between the food, drink, and desert.
        //mealTip is the tip calculated from meal plus mealTax, then multiplied by 15%
        //meal Tax is calculated by multipling the meal by 10%
        //costTotal is the cost of the entire meal
        Scanner input = new Scanner(System.in);

	System.out.println("How much was the food?");
	double food = input.nextDouble();

	System.out.println("How much was the drink?");
	double drink = input.nextDouble();

	System.out.println("How much was the desert?");
	double desert = input.nextDouble();

	double meal = food + drink + desert;	
	double mealTax = meal * .10;
	double mealTip = (meal + mealTax)  * .15;
	double costTotal = meal + mealTax + mealTip;

	System.out.println("The meal is $" + meal + ". The tip is $" + mealTip
	 + ". The tax is $" + mealTax); 
	System.out.println("The total cost is $" + costTotal);
    }
}
