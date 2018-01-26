package Chapter7;
import java.util.Scanner;
/** Program that tells whether or not strings are identical 
 * 
 * @author Chad Marshall
 */
public class C7_26
{/** Main method displays stuff to console
 * 
 * @param args 
 */
	public static void main(String[] args)
        {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list 1... ");
		int[] L1 = new int[input.nextInt()];         
		for (int i = 0; i < L1.length; i++)
                {
			L1[i] = input.nextInt(); 	
                }
		System.out.print("Enter list 2... ");	
                int[] L2 = new int[input.nextInt()];
		for (int i = 0; i < L2.length; i++)
                {
			L2[i] = input.nextInt();   
                }
                if(equals(L1, L2))
                {
                    System.out.println("The lists are identical");
                }
                else
                {
                    System.out.println("The lists are not identical");
                }              
	}
        /**
         * 
         * @param list1 - array list for first list
         * @param list2 - array list for second list
         * @return - returns bool value for true
         */
	public static boolean equals(int[] list1, int[] list2) 
        {
		if (list1.length != list2.length)
                {
			return false;
                }
		for (int i = 0; i < list1.length; i++)
                {
			if (list1[i] != list2[i])  
                        {
				return false;
                        }
		}
		return true;
	}
}


