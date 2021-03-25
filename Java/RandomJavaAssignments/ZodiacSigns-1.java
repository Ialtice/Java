/*
 * @author: Isaac Altice
 * @version: 9/18/18
 * 
 * Description: A program that will ask a user for the day and month of his birth. it will then tell the user his zodiac sign 
 * and a fact about it. Then the program will generate a random month and day and display its zodiac sign and fact.
 * 
 * Pseudocode:
 * ask user for month he was born
 * assign input to  integer variable month
 * ask user for day he was born
 * assign input to integer variable day
 * generate random month and assign value to variable
 * generate random day and assign value to variable
 * determine zodiac sign and display it and a fact to user
 * display random month and day
 * determine zodiac sign and display it and a fact to the user for the random date
 * 
 */
import java.util.Scanner; //import scanner to take input
public class ZodiacSigns {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); //initialize scanner
		System.out.println("ID003");
		System.out.println("Enter the month you were born: ");// ask user for month born
		int month = input.nextInt(); // get input from user and assign to month variable
		System.out.println("Enter the day you were born: "); // ask user for day born
		int day = input.nextInt(); // get input from user and assign to day variable
		String sign = "";// initialize strings
		String fact = "";
		int randomMonth = (int)(Math.random() * (12) + 1);//generate and assign random values to their variables
		int randomDay = (int)(Math.random() * (28) + 1);
		if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {// determine what zodiac sign for entered day and month
			sign = "Aries";// assign correct value to sign
			fact = "Aries are known for confidence and courage."; // assign correct value to fact
			
		}
		else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
			sign = "Taurus";
			fact = "Taurus are very practical and responsible people.";
		}
		else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
			sign = "Gemini";
			fact = "Gemini are quick leaners and adapters.";
		}
		else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
			sign = "Cancer";
			fact = "Cancer are highly emotion people.";
		}
		else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
			sign = "Leo";
			fact = " Leo are super creative and passionate.";
		}
		else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
			sign = "Virgo";
			fact = "Virgo are harworking and analytical.";
		}
		else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
			sign = "Libra";
			fact = "Libra are very cooperative";
		}
		else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
			sign = "Scorpio";
			fact = "Scorpio are the most passionate of signs.";
		}
		else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
			sign = "Sagittarius";
			fact = "Sagittarius are generous.";
		}
		else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
			sign = "Capricorn";
			fact = "Capricorn are most likely to look young.";
		}
		else if ((month == 1 && day >= 20) || (month == 2 && day <= 28)) {
			sign = "Aquarius";
			fact = "Aquarius is known for fierce independence.";
		}
		else {
			sign = "Pisces";
			fact = "Pisces are creative.";
		}
		System.out.println("Your Zodiac Sign is " + sign + "! "+ fact);//display zodiac sign and fact to user
		System.out.println("Generating random month and day: " + randomMonth + " " + randomDay); //display random date generated
		if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {// determine zodiac sign for random date 
			sign = "Aries";// assign correct values for random date
			fact = "Aries are known for confidence and courage.";
			
		}
		else if ((randomMonth == 4 && randomDay >= 20) || (randomMonth == 5 && randomDay <= 20)) {
			sign = "Taurus";
			fact = "Taurus are very practical and responsible people.";
		}
		else if ((randomMonth == 5 && randomDay >= 21) || (randomMonth == 6 && randomDay <= 20)) {
			sign = "Gemini";
			fact = "Gemini are quick leaners and adapters.";
		}
		else if ((randomMonth == 6 && randomDay >= 21) || (randomMonth == 7 && randomDay <= 22)) {
			sign = "Cancer";
			fact = "Cancer are highly emotion people.";
		}
		else if ((randomMonth == 7 && randomDay >= 23) || (randomMonth == 8 && randomDay <= 22)) {
			sign = "Leo";
			fact = " Leo are super creative and passionate.";
		}
		else if ((randomMonth == 8 && randomDay >= 23) || (randomMonth == 9 && randomDay <= 22)) {
			sign = "Virgo";
			fact = "Virgo are harworking and analytical.";
		}
		else if ((randomMonth == 9 && randomDay >= 23) || (randomMonth == 10 && randomDay <= 22)) {
			sign = "Libra";
			fact = "Libra are very cooperative";
		}
		else if ((randomMonth == 10 && randomDay >= 23) || (randomMonth == 11 && randomDay <= 21)) {
			sign = "Scorpio";
			fact = "Scorpio are the most passionate of signs.";
		}
		else if ((randomMonth == 11 && randomDay >= 22) || (randomMonth == 12 && randomDay <= 21)) {
			sign = "Sagittarius";
			fact = "Sagittarius are generous.";
		}
		else if ((randomMonth == 12 && randomDay >= 22) || (randomMonth == 1 && randomDay <= 19)) {
			sign = "Capricorn";
			fact = "Capricorn are most likely to look young.";
		}
		else if ((randomMonth == 1 && randomDay >= 20) || (randomMonth == 2 && randomDay <= 28)) {
			sign = "Aquarius";
			fact = "Aquarius is known for fierce independence.";
		}
		else {
			sign = "Pisces";
			fact = "Pisces are creative.";
		}
		System.out.println("Your Zodiac Sign is " + sign + "! "+ fact);//display random date's zodiac sign and fact.
	}

}
