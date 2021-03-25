/*
 * @author Isaac Altice
 * @version 10/15/2018
 * Description: A program that will display a menu to the user that contains different operations
 * that can be performed on a entered string. The user will be able to keep performing operations until
 * they wish to quit.
 * Pseudocode: 
 * display menu to user
 * prompt user for menu choice
 * if choice a, prompt user for sentence and assign to variable
 * display sentence and return to menu
 * if choice b, prompt user for search string and assign to variable
 * calculate string location
 * display results of string location and return to menu
 * if choice c, prompt user for string to search for and assign variable
 * calculate string locations
 * display string locations and return to menu
 * if choice d, prompt user for search string and assign to variable
 * prompt user for replacement string and assign to variable
 * calculate string location and replace with other string
 * display results and return to menu
 * if choice e,prompt user for search string and assign to variable
 * prompt user for replacement string and assign to variable
 * calculate all string locations and replace with other strings
 * display results and return to menu
 * if choice f,calculate number of words
 * display results to user and return to menu
 * if choice g, prompt user for letter to count
 * calculate number of letters
 * display to user and return to menu
 * if choice h, calculate number of letters
 * display results to user and return to menu
 * if choice i,prompt user for word to delete
 * calculate new string
 * display new string and return to menu
 * if choice j, display goodbye and end program
 */
import java.util.Scanner;// import Scanner
public class assignment02 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);//initialize scanner
		String choice;//declare variable
		String sentence = "";
		do { // do while loop to display menu and ask for choice 
		menu();//display menu
		System.out.printf("Enter your choice: ");//prompt user for choice
		choice = input.nextLine();//get user input
		choice = choice.toUpperCase();//change choice to upper case
		String searchString; //declare variables
		int foundAt;
		String replaceString;
		String letter;
		String deleteWord;
		int count;
		int newFoundAt;
		char letterSingle;
		
		switch (choice) {// switch for menu choices 
		case "A" : // ask user for main sentence and display it back 
			System.out.println("Input a new Main Sentence: ");//ask user for sentence
			sentence = input.nextLine();//assign to variable
			System.out.println("The new Main sentence is: ");
			System.out.println(sentence);
			break;
		case "B" :
			System.out.println("Enter the search string: ");// choice b, search for string and display where it was found or it was not
			searchString = input.nextLine();
			foundAt = sentence.indexOf(searchString);
			if (foundAt != -1) {
				System.out.println(searchString + " found at " + foundAt);
			}
			else if(foundAt == -1){
				System.out.println(searchString + " is not found");
			}
			break;
		case "C" :// choice c, ask user for a string and find all incidents of a sting and display back to user
			System.out.println("Enter the string you want to find all incidents for: ");
			searchString = input.nextLine();
			foundAt = 0;
			for (int i = 0; i < sentence.length();i++) {
				foundAt =sentence.indexOf(searchString,foundAt);
				if (foundAt != -1) {
					System.out.println(searchString + " found at " + foundAt);
					foundAt++;
					i = foundAt;
				}
				else {
					System.out.println(searchString + " is not found");
					i = sentence.length();
				}
			}
			break;
		case "D" :// choice d, ask user for string and its replacement for its first occurrence. Then display back the corrected sentence
			System.out.println("Enter the search string: ");
			searchString = input.nextLine();
			System.out.println("Enter the string you want to replace the found String with: ");
			replaceString = input.nextLine();
			foundAt =sentence.indexOf(searchString);
			if (foundAt != -1) {
				sentence = sentence.substring(0, foundAt) + replaceString + sentence.substring(foundAt + searchString.length());
				System.out.println(sentence);
			}
			else {
				System.out.println(searchString + " is not found");
			}
			break;
		case "E" ://choice e, ask user for string and replacement and then replace for all occurrences. Then display back corrected sentence.
			System.out.println("Enter the search string: ");
			searchString = input.nextLine();
			System.out.println("Enter the string you want to replace the found String with: ");
			replaceString = input.nextLine();
			foundAt =sentence.indexOf(searchString);
			newFoundAt = 0;
			if (foundAt != -1) {
				while (foundAt != -1) {
				
				if (foundAt == 0) {
					sentence = replaceString + sentence.substring(searchString.length());
					newFoundAt = replaceString.length();
					foundAt = sentence.indexOf(searchString, newFoundAt);
					System.out.println(foundAt);
				}
				for (int i = foundAt; i < sentence.length();i++) {
					if (foundAt == -1) {
						i = sentence.length();
					}
					else {
					sentence = sentence.substring(0, foundAt) + replaceString + sentence.substring(foundAt + replaceString.length());
					newFoundAt = foundAt + replaceString.length();
					foundAt = sentence.indexOf(searchString, newFoundAt);
					
					i = foundAt -1;
					}
				}

				System.out.println(sentence);
				}
			}
			else {
				System.out.println(searchString + " is not found");
			}
			
			break;
		case "F" : // calculate number of words in string and then display back to user.
			int numberOfWords = 0;
			int index = 0;
			while (index < sentence.length()) {
				numberOfWords++;
				index = sentence.indexOf(" ", index + 1);
				if (index == -1) {
					index = sentence.length();
				}
			}
			System.out.println("The number of words are: " + numberOfWords);
			break;

		case "G" :// ask user for letter then calculate number of times letter in string, then display back to user.
			System.out.println("Enter a letter to count the number of occurences: ");
			letter = input.nextLine();
			letterSingle = letter.charAt(0);
			count = 0;
			for(int i = 0; i < sentence.length(); i++) {
				if (letterSingle ==sentence.charAt(i)) {
					count++;
				}
			}
			System.out.println("The number of letters are : " + count);
			break;
			
		case "H" :// calculate the number of letters in string and then display back to user.
			count = 0;
			for(int i = 0; i < sentence.length(); i++) {
				boolean test = false;
				test = Character.isLetter(sentence.charAt(i));
				if (test == true) {
					count++;
				}
				
			}
			System.out.println("The number of letters are: " + count);
			break;
		case "I" ://ask user for word to delete then display back corrected string
			System.out.println("Enter a word to delete: ");
			deleteWord = input.nextLine();
			foundAt = sentence.indexOf(deleteWord);
			while (foundAt != -1) {
				sentence = sentence.substring(0,foundAt) + sentence.substring(foundAt + deleteWord.length());
				foundAt = sentence.indexOf(deleteWord);
			}
			System.out.println(sentence);
			break;
		case "J" ://if choice j exit do while loop
			break;
		default ://display invalid menu choice
			System.out.println("Invalid menu choice, Please choose a menu option");
		}
		
		}while (!choice.equals("J"));// do while continuation condition
		System.out.println("Goodbye!");// exit message to user
	}


public static void menu() {//method to display menu
	System.out.println("A. Enter a new Main Sentence");
	System.out.println("B. Find a String");
	System.out.println("C. Find all incidents of a String");
	System.out.println("D. Find and Replace the String");
	System.out.println("E. Replace all the incidents of a String to another one");
	System.out.println("F. Count the number of words");
	System.out.println("G. Count the number of ocurrences of a letter");
	System.out.println("H. Count the total number of letters");
	System.out.println("I. Delete all the occurences of a word");
	System.out.println("J. Exit");

	}
}