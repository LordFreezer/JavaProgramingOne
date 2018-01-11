
package Chapter3;
import java.util.Scanner;
/**  program asks user for two integers and computes stuff
 *
 * @author Chad marshall
 */
public class P3 {
          /**
 *
 * Main Method 
 * 
 * @param args argument from command line prompt  
 * 
 */
    public static void main(String[] args) 
    {
        // input is a scanner that records data and stores it as varibles
        // firstNumber and secondNumber - ints entered by user as input
        // i is a constant that equates to 100
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first integer");
        int firstNumber = input.nextInt();
        System.out.println("What is the second integer");
        int secondNumber = input.nextInt();
        final int i = 100;
         if(firstNumber < secondNumber)               
         {
             System.out.println("The first number is less than the second");///     1 < 2
             if(secondNumber == 0)
             {
                 System.out.println("Cannot divide by zero");
             }
             else if(firstNumber / secondNumber < 1)
             {
                 System.out.println("proper fraction");
             }
             else
             {
                System.out.println("improper fraction");
             }
             if(firstNumber <= i)
             {
                if(firstNumber >= 90)
                    System.out.println("A");
                else if(firstNumber >= 80)
                    System.out.println("B");
                else if(firstNumber >= 70)
                    System.out.println("C");
                else if(firstNumber >= 60)
                    System.out.println("D");
                else
                    System.out.println("F");       
             }
             if(secondNumber >= 1 && secondNumber <= 100)
                 System.out.println("In range");
             else
                 System.out.println("Out of range");           
         }
         else if (firstNumber > secondNumber)///       1 > 2
         {
             System.out.println("The first number is greater than the second");
             if(secondNumber == 0)
             {
                 System.out.println("Cannot divide by zero");
             }
             else if(firstNumber / secondNumber < 1)
             {
                 System.out.println("proper fraction");
             }
             else 
             {
                System.out.println("improper fraction");
             }
             if(firstNumber <= i)
             {
                if(firstNumber > 90)
                    System.out.println("A");
                else if(firstNumber > 80)
                    System.out.println("B");
                else if(firstNumber > 70)
                    System.out.println("C");
                else if(firstNumber > 60)
                    System.out.println("D");
                else
                    System.out.println("F");       
             }
             if(secondNumber >= 1 && secondNumber <= 100)
                 System.out.println("In range");
             else
                 System.out.println("Out of range");          
         }
          if (firstNumber == secondNumber)      ///     1 = 2
         {
             System.out.println("The first number is equal to the second");
             if(secondNumber == 0)
             {
                 System.out.println("Cannot divide by zero");
             }
             else if(firstNumber / secondNumber < 1)
             {
                 System.out.println("proper fraction");
             }
             else
             {
                System.out.println("improper fraction");
             }
             if(firstNumber <= i)
             {
                if(firstNumber > 90)
                    System.out.println("A");
                else if(firstNumber > 80)
                    System.out.println("B");
                else if(firstNumber > 70)
                    System.out.println("C");
                else if(firstNumber > 60)
                    System.out.println("D");
                else
                    System.out.println("F");       
             }
             if(secondNumber >= 1 && secondNumber <= 100)
                 System.out.println("In range");
             else
                 System.out.println("Out of range");          
         }
          if (firstNumber <= secondNumber)      ///   1 less than or equal too 2
         {
             System.out.println("The first number is less than or equal to the second");
             if(secondNumber == 0)
             {
                 System.out.println("Cannot divide by zero");
             }
              /*else if(firstNumber / secondNumber < 1)
             {
                 System.out.println("proper fraction");
             }
             else 
             {
                System.out.println("improper fraction");
             }
             if(firstNumber <= i)
             {
                if(firstNumber > 90)
                    System.out.println("A");
                else if(firstNumber > 80)
                    System.out.println("B");
                else if(firstNumber > 70)
                    System.out.println("C");
                else if(firstNumber > 60)
                    System.out.println("D");
                else
                    System.out.println("F");       
             }
             if(secondNumber >= 1 || secondNumber <= 100)
                 System.out.println("In range");
             else
                 System.out.println("Out of range");    */      
         }
          if (firstNumber != secondNumber)     ///     1 does not equal 2 
         {
             System.out.println("The first number is not equal to the second");
             if(secondNumber == 0)
             {
                 System.out.println("Cannot divide by zero");
             }
              /*else if(firstNumber / secondNumber < 1)
             {
                 System.out.println("proper fraction");
             }
             else 
             {
                System.out.println("improper fraction");
             }
             if(firstNumber <= i)
             {
                if(firstNumber > 90)
                    System.out.println("A");
                else if(firstNumber > 80)
                    System.out.println("B");
                else if(firstNumber > 70)
                    System.out.println("C");
                else if(firstNumber > 60)
                    System.out.println("D");
                else
                    System.out.println("F");       
             }
             if(secondNumber >= 1 || secondNumber <= 100)
                 System.out.println("In range");
             else
                 System.out.println("Out of range");   */       
         }
          
        }
    
}
