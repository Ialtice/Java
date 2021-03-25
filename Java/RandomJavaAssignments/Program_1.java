/**
 * @author Isaac Altice
 *@version 9/11/2018
 *
 *Description: A program that will ask the user for the number of pounds they wish to convert to kilograms. Then calculate
 *and display the answer to the user.
 *
 *Psuedocode:
 *ask user for number of pounds
 *get input for pounds
 *calculate kilograms
 *display answer to user
 */
import java.util.Scanner;
public class Program_1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double pounds = 0;
		double kilograms = 0;
		
		System.out.println("ID001");
		System.out.println("Please enter a number in pounds : ");
		pounds = input.nextDouble();
		kilograms = pounds * 0.454;
		System.out.println(pounds + " Pounds is equal to " + kilograms + " Kilograms." );
		
	}

}
