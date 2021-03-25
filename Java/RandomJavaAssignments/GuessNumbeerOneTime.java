/*
 * @author: Isaac Altice
 * @version: 10/7/18
 * 
 * Description: This program generate a random number between 0 and 100. Then it will ask the user to guess the number. If it is correct it will display a message telling the user
 * that they are correct. if wrong the program will tell the user if she is to low or high and ask them for another guess. this continues until the correct answer is chosen.
 * 
 * Answers: no questions asked.
 * 
 */
import java.util.Scanner;

public class GuessNumbeerOneTime {
	public static void main(String[] args) {
		//generate a random number to be guessed
		int number = (int)(Math.random() * 101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		
		int guess = -1;
		while (guess != number){
			//prompt the user to guess the number
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();

			if (guess == number)
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}
	}

}
