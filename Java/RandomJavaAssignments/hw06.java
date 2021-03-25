/*
 * @author Isaac altice
 * @version 10/15/18
 *  
 *  Description: A program that will ask the user to enter a number and it will calculate if it is a prime number or not and display the results to the user. Then user will then be
 *  prompted to enter another number or -1 to exit. once the user enters -1 they will be prompted to enter a max number. The program will then calculate if all the numbers up to the 
 *  max the user entered are prime and display the results.
 *  
 *  psueodocode:
 *  prompt user to enter a number
 *  set input to variable
 *  calculate if number entered is prime
 *  display result to user
 *  prompt user to enter another number or quit
 *  set input to variable and decide whether to repeat or move to next part of program.
 *  prompt user for max value of number
 *  set input to variable
 *  calculate all prime numbers up to the max number variable
 *  display results to user
 */
import java.util.Scanner;// import scanner

public class hw06 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);// initialize scanner
		int number; //initialize variable

		do {
			System.out.println("Please enter a number(-1 to quit): ");//prompt user for number
			number = input.nextInt();//get input and set to variable
			boolean isPrime = true; // initialize variable
			for (int divisor = 2; divisor <= number / 2 && isPrime;//calculate if number is prime
					divisor++) {
				if (number % divisor ==0) {//if true, number is not prime
					isPrime = false; //set isPRime to false, if the number is not prime
				}
			}
			if (isPrime == false) {
				System.out.println(number + " is not prime.");//display results to user
			}
			else if (isPrime == true) {
				System.out.println(number + " is prime.");
			}

		}while(number != -1);
		
		System.out.println("Moving to part 2: ");
		System.out.println("Enter a max number : ");//prompt user for max number
		int maxNumber = input.nextInt();//get input and set to variable
		number = 1;
		while (maxNumber >= number) {// calculate all prime numbers up  to max
			boolean isPrime = true;
			for (int divisor = 2; divisor <= number / 2 && isPrime;
					divisor++) {
				if (number % divisor ==0) {//if true, number is not prime
					isPrime = false; //set isPRime to false, if the number is not prime
				}
			}
			if (isPrime == false) {//display results to user
				System.out.println(number + " is not prime.");
			}
			else if (isPrime == true) {
				System.out.println(number + " is prime.");
				
			}
			number += 1;
		}
	}

}
