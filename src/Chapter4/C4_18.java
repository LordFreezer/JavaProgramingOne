
package Chapter4;
import java.util.Scanner;
/**  program that computes what grade you are in and what major you are majoring in
 *
 * @author Chad Marshall
 */
public class C4_18 {
    /**
 *
 * Main Method 
 * 
 * @param args argument from command line prompt  
 * 
 */
     public static void main(String[] args) 
    {
        //input is a scanner that records user input 
        //major and Major - are arrays that are a failsafe if so that the user can enter input without  worrying about cases
        // outputMajor is a string that records the users choice for major
        // status is an array that holds numbers that the user will pick from
        
        Scanner input = new Scanner(System.in);
        System.out.println(" 'm' = 'mathmatics' ");
        System.out.println(" 'i' = 'information technology' ");
        System.out.println(" 'c' = 'computer science' ");
        String[] major = {"m","c","i"};
        String[] Major = {"M","C","I"};
        String[] status = {"1","2","3","4"};
        System.out.println("What is your major?...");
        String outputMajor = input.next();
        /*
        if(!outputMajor.equalsIgnoreCase("M") && ....
        
        */
        for (int k = 2; k < major.length && k < Major.length; k++) 
        {

            if(outputMajor == null ? major[0] == null || Major[0] == null: outputMajor.equals(major[0]) || outputMajor.equals(Major[0]))
            {
                System.out.println(" '1' = 'freshman' ");
                System.out.println(" '2' = 'sopfomore' ");
                System.out.println(" '3' = 'juinor' ");
                System.out.println(" '4' = 'seinor' ");
                System.out.println("What is your status?...");
                String outputStatus = input.next();
                for(int j = 3; j < status.length; j++)
                    {
                        if(outputStatus == null ? status[0] == null : outputStatus.equals(status[0]))
                        {
                           System.out.println("Your major is mathmatics and you are a freshman");
                        }
                        else if(outputStatus.equals(status[1]))
                        {
                            System.out.println("Your major is mathmatics and you are a sophomore");
                        }
                        else if(outputStatus.equals(status[2]))
                        {
                            System.out.println("Your major is mathmatics and you are a junior");
                        }
                        else if(outputStatus.equals(status[3]))
                        {
                            System.out.println("Your major is mathmatics  and you are a seinor");
                        }
                        
                    }
            }
            else if(outputMajor.equals(major[1]) || outputMajor.equals(Major[1]))
            {
                System.out.println(" '1' = 'freshman' ");
                System.out.println(" '2' = 'sopfomore' ");
                System.out.println(" '3' = 'juinor' ");
                System.out.println(" '4' = 'seinor' ");
                System.out.println("What is your status?...");
                String outputStatus = input.next();
                for(int j = 3; j < status.length; j++)
                    {
                        if(outputStatus == null ? status[0] == null : outputStatus.equals(status[0]))
                        {
                           System.out.println("Your major is computer science and you are a freshman");
                        }
                        else if(outputStatus.equals(status[1]))
                        {
                            System.out.println("Your major is computer science and you are a sophomore");
                        }
                        else if(outputStatus.equals(status[2]))
                        {
                            System.out.println("Your major is computer science and you are a junior");
                        }
                        else if(outputStatus.equals(status[3]))
                        {
                            System.out.println("Your major is computer science and you are a seinor");
                        }
                        
                    }
            }
            else if(outputMajor.equals(major[2]) || outputMajor.equals(Major[2]))
            {
                System.out.println(" '1' = 'freshman' ");
                System.out.println(" '2' = 'sopfomore' ");
                System.out.println(" '3' = 'juinor' ");
                System.out.println(" '4' = 'seinor' ");
                System.out.println("What is your status?...");
                String outputStatus = input.next();
                for(int j = 3; j < status.length; j++)
                    {
                        if(outputStatus == null ? status[0] == null : outputStatus.equals(status[0]))
                        {
                           System.out.println("Your major is information technology and you are a freshman");
                        }
                        else if(outputStatus.equals(status[1]))
                        {
                            System.out.println("Your major is information technology and you are a sophomore");
                        }
                        else if(outputStatus.equals(status[2]))
                        {
                            System.out.println("Your major is information technology and you are a junior");
                        }
                        else if(outputStatus.equals(status[3]))
                        {
                            System.out.println("Your major is information technology and you are a seinor");
                        }
                        
                    }
            }
            else if (major.length > 0 || Major.length > 0)
            {
                System.out.println("Invalid major");
           }

        
        }  
if(status.length < 0 || status.length >= 4)
{
    System.out.println("Invalid status");
    
}
    }
}

