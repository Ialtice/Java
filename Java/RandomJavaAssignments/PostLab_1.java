/*
 * @author Isaac Altice
 * @version 9/4/18
 * Desciption:A program to help Jean not get a speeding ticket while using a rental car in Britain. It allows 
 * her to enter a number of kilometer and it will convert it to miles.
 * 
 * Pseudocode:
 * Ask user to enter a number of kilometers
 * get input from user
 * calculate kilometers to miles
 * display the result to the user
 */
import java.util.Scanner; //import ability to use scanner to get inputs from user
public class PostLab_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // initialize scanner
		System.out.println("ID001");
		double kilometers = 0; //initialize variables as double
		double miles = 0;
		
		System.out.println("Enter a number of kilometers : "); // ask the user for a number of kilometers
		kilometers = input.nextDouble(); //get input from user and assign it to variable kilometers
		miles = kilometers * 0.621; //calculate miles from kilometers 
		System.out.println(kilometers + " kilometers = " + miles + " miles."); //display answer to user		
		
	}

}
