/*
 * @author: Isaac Altice
 * @version: 10/7/18
 * 
 * Description: A program that will ask user to input a string, then letter, then slot number.It will then analyze the string and find its total length, number of the inputted letter
 * within the string, and the character in the slot entered. It will then display these results to the user.
 * 
 * Pseudocode: 
 * Ask user to enter a string
 * assign string to a variable
 * ask user to enter a letter
 * assign letter to a variable
 * ask user to enter a slot number
 * assign slot number to variable
 * change string letter to a char variable
 * calculate string length
 * display string length to user
 * calculate and display slot number of letter to user
 * calculate and display letter at slot number to user.
 * 
 */
import java.util.Scanner;

public class StringAnalysis {
	public static void main (String[] args) {
		System.out.println("ID002");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string: ");//prompt user to enter a string
		String someString = input.nextLine();//assign input to variable
		System.out.print("Enter a letter: ");// prompt user for letter
		String letter = input.next();// assign input to variable
		char charLetter = letter.charAt(0);//change letter string to char
		System.out.println("Enter a slot number: ");//prompt user for slot number
		int slotNumber = input.nextInt();//assign input to variable
		int stringLength = someString.length();// get string length and assign to variable
		System.out.println("The String length is : " + stringLength);//display results to users
		System.out.println("The slot number of letter " + letter + " is: " + someString.indexOf(charLetter));
		System.out.println("The letter at slot " + slotNumber + " is: " + someString.charAt(slotNumber));
		
	}

}
