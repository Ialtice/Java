import java.util.Scanner; //import scanner to take user inputs
public class activity39 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in); // initialize scanner
		int numerator;//initialize variables
		int denominator;
		double remainder;
		int wholeNumber;
		
		System.out.println("Enter a numerator: ");//ask user for numerator input
		numerator = input.nextInt();// get input from user and assign to variable
		System.out.println("Enter a denominator: ");
		denominator = input.nextInt(); //get input from user and assign to variable
		wholeNumber = numerator / denominator; //calculate whole number part of improper fraction
		remainder = numerator % denominator; //calculate remainder
		if (denominator == 0) {
			System.out.println("Cannot divide by zero. Invalid denominator.");
		}
		else {
			if (remainder == 0 && wholeNumber > 0) {// display correct output depending and remainder ad whole number values
				System.out.println(numerator + " / " + denominator + " is an "
					+ "improper fraction and it can be reduced to " + wholeNumber + ".");			
			}
			else if (remainder > 0 && wholeNumber != 0) {
				System.out.println(numerator + " / " + denominator + " is an "
					+ "improper fraction and its mixed fraction is " + wholeNumber + " + " + (numerator - (wholeNumber * denominator)) 
					+ " / " + denominator + ".");
			}
			else if (numerator == 0) {
				System.out.println(numerator + " / " + denominator + " is an "
						+ "improper fraction and it can be reduced to 0.");
			}
			else {
				System.out.println(numerator + " / " + denominator + " is a proper fraction.");
			}
		}
	}
}