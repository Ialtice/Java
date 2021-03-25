/**
 * @author Isaac Altice
 *@version 9/11/2018
 *
 *Description: A program to take two inputs from the user being balance and annual interest rate and use them to calculate and display
 *the interest.
 *
 *Pseudocode:
 *Display to the user "enter balance and annual interest rate"
 *Get user to input balance
 *Get user to input annual interest rate
 *calculate interest
 *display the calculated interest
 */

import java.util.Scanner;
public class Program_2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double balance = 1;
		double annualInterestRate = 1;
		
		
		System.out.println("ID002");
		System.out.println("Enter balance and annual interest rate: ");
		balance = input.nextDouble();
		annualInterestRate = input.nextDouble();
		double interest = balance * (annualInterestRate / 1200);
		System.out.println("The interest is " + (int)(interest * 100) / 100.0);
		
	}
}