/**
 * @author Isaac Altice
 *@version 9/11/2018
 *
 *Description: A program that will get the model and initial cost of a car from the user and then will calculate and display the model, initial cost,
 *sales tax, discount, final price, and salesman's commission.
 *
 * Pseudocode: 
 * Display message to user to enter the car's model and initial cost
 * get user input for model
 * get user input for initial cost
 * calculate sales tax, discount, final price, commission for car sale.
 * Display the sales tax, discount, final price, commission for car sale.
 * 
 * 
 */
import java.util.Scanner;
public class Program_3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String carModel;
		double carInitialCost;
		
		System.out.println("ID003");
		System.out.println("Enter Car Model: "); 
		carModel = input.nextLine();
		System.out.println("Enter Car Initial Cost: ");
		carInitialCost = input.nextDouble();
		
		double salesTax = carInitialCost * 0.036;					
		double discount = (carInitialCost + salesTax) * 0.15;
		double finalPrice = ((carInitialCost + salesTax) - discount);
		double commission = finalPrice * 0.1;
		
		System.out.println("The car model is a " + carModel);
		System.out.println("The inital cost is: $" + (int)(carInitialCost * 100) / 100.0);
		System.out.println("The sales tax is: $" + (int)(salesTax * 100) / 100.0);
		System.out.println("The disocunt is: $" + (int)(discount * 100) / 100.0);
		System.out.println("The Final price is: $" + (int)(finalPrice * 100) / 100.0);
		System.out.println("The salesman's commission is: $" + (int)(commission * 100) / 100.0);
			
	}
}