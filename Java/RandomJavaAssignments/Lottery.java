/*
 * @author: Isaac Altice
 * @version: 9/18/18
 *  
 *  Description: This program generates a random 2 digit lottery number and
 *  then asks the user to enter a 2 digit number guess of the lottery number.
 *  It then compares the digits of the lottery number and the guess. If there are
 *  any matches it then displays to the user his winnings or if he has no matches.
 *  
 *   Pseudocode:
 *   generate a random two digit number and assign to int variable lottery
 *   ask the user to guess a two digit number
 *   assign input from user to int variable guess
 *   determine first digit of lottery variable and assign to variable lotteryDigit1
 *   determine second digit of lottery variable and assign to variable lotteryDigit2
 *    determine first digit of guess variable and assign to variable guessDigit1
 *    determine second digit of guess variable and assign to variable guessDigit2
 *    display the lottery number
 *    determine if the guess has any matches and display the correct winning amount if any .
 */
import java.util.Scanner; // import scanner to take inputs from user

public class Lottery {
	public static void main(String[] args) {
		System.out.println("ID:001"); 
		//generate a lottery number
		int lottery = (int)(Math.random() * 100);
		
		//prompt user to enter a guess
		Scanner input = new Scanner(System.in); //initialize scanner
		System.out.print("Enter your lottery pick (two digits) : ");//display to user to enter two numbers
		int guess = input .nextInt();// assign input from user to guess variable
		
		//get digits from lottery
		int lotteryDigit1 = lottery / 10;// calculate and assign first digit of lottery to lotteryDigit1
		int lotteryDigit2 = lottery % 10;//calculate and assign second digit of lottery to lotteryDigit2
		
		//get digits form guess
		int guessDigit1 = guess/ 10;//calculate and assign first digit of lottery to lotteryDigit1
		int guessDigit2 = guess % 10;// calculate and assign second digit of lottery to lotteryDigit2
		
		System.out.println("The lottery number is " + lottery);// display to user winning lottery number
		
		//check the guess
		if (guess == lottery)// determine if the users guess had any matches
			System.out.println("Exact match: you win $10,000");// display to user his winnings
		else if (guessDigit2 ==lotteryDigit1 && 
				guessDigit1 == lotteryDigit2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,00");
		else
			System.out.println("Sorry, no match");
	}
}
