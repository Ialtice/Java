/*
 * @author Isaac Altice
 * @version 9/4/18
 * Desciption:A program that uses the lets the user enter a amount of money in double form and then takes that amount in double form
 * and changes it to an integer at 100. The program then goes through the process of assigning each form of change to a variable by dividing by 
 * it by its common value, like 25 for quarts. After this it has the total amount of that form of change assigned to a variable and then uses the 
 * remainder operation to remove its value from the remainingAmount variable. This process is repeated until remainingAmount is equal to the number
 * of pennies.It then displays the results to the user.  
 * 
 * What is the output with the input value of 1.99?
 * Your amount 1.99 consists of
     1 dollars
     3 quarters
     2 dimes
     0 nickels
     4 pennies

 * 
 * 
 * 
*/
import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//receive the amount
		System.out.print(
				"Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		//find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		//find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		//Find the number of dimes in the remaining amount
		int numberOfPennies = remainingAmount;
		
		//display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("     " + numberOfOneDollars + " dollars");
		System.out.println("     " + numberOfQuarters + " quarters");
		System.out.println("     " + numberOfDimes + " dimes");
		System.out.println("     " + numberOfNickels +" nickels");
		System.out.println("     " + numberOfPennies + " pennies");
	}

}
