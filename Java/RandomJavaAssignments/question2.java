
/**
 * 
 *
 * @author Isaac Altice
 * @version 01/16/2019
 */
import java.util.Scanner;
public class question2
{
   public static void main (String [] args)
   {
       Scanner input = new Scanner(System.in);
       double basePrice = 17950;
       double cost= 0;
       double downPayment= 0;
       double interestRate = 0;
       double loanLength; 
       double annualIncome;
       double monthlyPayment;
       double principle;
       double monthlyInterest;
       double lengthMonths;
       String choice;
       
       System.out.println("Car : Civic $17950");
       System.out.println("Please enter the letter for the package you want or B for no package");
       System.out.println("Option 'P' includes : auto transmission, power windows and locks, stereo sound system.");
       System.out.println("Cost: base + 1200");
       System.out.println("Option 'L' ’ includes: all of the above plus MP3 player, security alarm, cruise control.");
       System.out.println("Cost: base + 1800");
       System.out.println("Option ‘D’ includes: all of the above plus deluxe detailing, pin stripes, leather seats, wind bar. ");
       System.out.println("Cost: base + 2500");
       System.out.println("Option ‘S’ includes: all of the above plus seat heaters, Bose speakers, OnStar, steering wheel control of ");
       System.out.println("music system, chrome rims.");
       System.out.println("Cost: base + 3100");
       choice = input.next();
       switch(choice){
           case "P" : cost = basePrice + 1200;
           break;
           case "L" : cost = basePrice + 1800;
           break;
           case "D" : cost = basePrice + 2500;
           break;
           case "S" : cost = basePrice + 3100;
           break;
           case "B" : cost = basePrice;
           break;
           default : System.out.println("Incorrect Choice");
          
        }
        System.out.println("Please enter a down Payment amount : ");
        downPayment = input.nextDouble();
        principle = cost - downPayment;
        System.out.println("Please enter the annual interest rate: ");
        interestRate = input.nextDouble() / 100;
        monthlyInterest = interestRate / (12);
        System.out.println("Please enter the length of the loan in years: ");
        loanLength = input.nextDouble() * 12;
        System.out.println("Please enter your annual income: ");
        annualIncome = input.nextDouble();
        monthlyPayment = principle * (monthlyInterest / (1 - (Math.pow(1 + monthlyInterest, -loanLength))));
        monthlyPayment = ((int)(monthlyPayment * 100)) / 100;
        
        if (annualIncome /12 >= 4 * monthlyPayment){
            System.out.println("Car Price: $" + cost);
            System.out.println("Down payment: $" + downPayment);
            System.out.println("Loan Amount: $" + principle);
            System.out.println("Monthly Payment: $" + monthlyPayment);
            System.out.println("You are eligible to take the loan.");
            
        }
        else{
            System.out.println("Car Price: $" + cost);
            System.out.println("Down payment: $" + downPayment);
            System.out.println("Loan Amount: $" + principle);
            System.out.println("Monthly Payment: $" + monthlyPayment);
            System.out.println("You are not eligible to take the loan.");
        }
        
        
       
   }
}
