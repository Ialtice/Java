/*
 * @author: Isaac Altice
 * @version: 9/18/18
 * 
 * Description: A program that will ask a user if they wish to pick a card.If they do it will generate a random card value
 * and display it.
 * 
 * Pseudocode:
 * ask user if they wish to pick a card
 * get user input for choice
 * if choice "y" generate random values for card value and suit
 * display the card value and suit to the user
 * 
 */
import java.util.Scanner;//import scanner to get user inputs

public class program1 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);//initialize scanner
		System.out.println("ID001");
		System.out.println("Would you like to pick a card? Y/N");// ask user if they want to pick a card
		String choice = input.nextLine();// get users input and assign to variable choice

		if (choice.equals("Y")) {//determine if user wants to draw a card
			int faceValue = (int)(Math.random() * (12)) + 1;// generate random values for suit and values and assign to correct variables
			int suit = (int)(Math.random() * (4));
			System.out.print("You got a... ");// display to the user his results
			if (faceValue == 1) {
				System.out.print("Ace ");
			}
			else if (faceValue >= 1 || faceValue >=11) {
				System.out.print(faceValue + " ");
			}
			else if (faceValue == 11) {
				System.out.print("Jack ");
			}
			else if (faceValue ==12) {
				System.out.print("Queen ");
			}
			else if (faceValue == 13) {
				System.out.print("King ");
			}
		if (suit == 0) {
			System.out.print("of Hearts");
		}
		else if (suit == 1) {
			System.out.print("of Diamonds");
		}
		else if (suit == 2) {
			System.out.print("of Clubs");
		}
		else if (suit == 3) {
			System.out.print("of Spades");
		}
		}
			
		}
		
		

}
