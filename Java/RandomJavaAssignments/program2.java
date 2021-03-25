/*
 * @author: Isaac Altice
 * @version: 9/18/18
 * 
 * Description: A program that will as the user for a 3 digit number and then determine if it is a palindrome.
 * 
 * Pseudocode:
 * ask user to enter a three digit number
 * calculate first digit
 * calculate last digit
 * determine if first digit is equal to last digit
 * display results to the user
 * 
 */
import java.util.Scanner;// import scanner to get inputs
public class program2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//initialize scanner
		System.out.println("ID002");
		System.out.println("Enter a palindrome: "); // ask user for 3 digit number
		int num = input.nextInt();// get input from user and assign to variable num
		int firstDigit = num / 100;// calculate first digit
		int lastDigit = num % 10; //calculate last digit
		if (firstDigit == lastDigit) {//determine if entered number was a palindrome.
			System.out.println("This was a palindrome"); // display to the user if it was/was not a palindrome.
		}
		else {
			System.out.println("This was not a palindrome");
		}
	}

}
