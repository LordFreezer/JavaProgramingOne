
package Chapter4;
import java.util.Scanner;
/** program that calculates payroll
 *
 * @author Chad Marshall
 */
public class C4_23 {
           /**
 *
 * Main Method 
 * 
 * @param args argument from command line prompt  
 * 
 */
    public static void main(String[] args) 
    {
        // input is a scanner that records user input
        // empName is a string that records the employee name
        //hrsWorked is a double that is the hours worked
        // payRate is the double that is the rate of pay
        // grossPay is hrsWorked multiplyed by payRate
        // fedtaxrate and statetaxrate - tax rate inputed by the user
        // federalTaxWithheld and socialSecurityWithheld = federaltaxrate times grossPay and socialtaxrate times grossPay respectivly
        // netPay is federalTaxWithheld plus socialSecurityWithheld minus grossPay
        
      Scanner input = new Scanner(System.in);
System.out.println(" WEEKLY PAYROLL INFORMATION");
System.out.println(" --------------------------");
System.out.println("\n Please enter the employer's name: ");
String empName = input.next();
///System.out.println("\n Please enter Social Security:");
//String empSocial = input.next();
System.out.println("\n Please enter the number of hours worked this week: ");
double hrsWorked = (double)input.nextDouble();
System.out.println("\n Please enter employee's HOURLY PAY RATE: ");
double payRate = (double)input.nextDouble();

double grossPay = (hrsWorked * payRate);
System.out.println("What is federal tax rate???");
double fedtaxrate = input.nextDouble();
System.out.println("What is the state tax rate???");
double statetaxrate = input.nextDouble();
double federalTaxWithheld = ((fedtaxrate) * grossPay);
double socialSecurityWithheld = ((statetaxrate) * grossPay);
double netPay = (federalTaxWithheld + socialSecurityWithheld - grossPay);
System.out.println("\n\n The weekly payroll information summary for: " +
empName);
//System.out.println("\n Social security number: " + empSocial);
System.out.printf("employee name: %s" , empName);
System.out.printf("Hours worked: %.2f" , hrsWorked);
System.out.printf("Pay rate: $%.2f" , payRate);
System.out.printf(" Gross pay: $%.2f" , grossPay);
System.out.printf(" Federal income taxes witheld: %.2f" , federalTaxWithheld);
System.out.printf(" state withholding: %.2f" , socialSecurityWithheld);
System.out.printf("Total Deductions: $%.2f" , (federalTaxWithheld + socialSecurityWithheld));
System.out.printf(" Net Pay: $%.2f" , (netPay * -1));

        
    }
}
