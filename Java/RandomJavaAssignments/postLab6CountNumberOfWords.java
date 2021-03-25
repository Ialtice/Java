/*
 * @author : Isaac Altice
 * @version: 10/23/18
 * Description:A program that will ask the user to enter a sentence then it will count the number of words and display the result
 * back to the user.
 * 
 * Pseaudocode:
 * Ask user to enter a sentence
 * search the sentence for spaces and every time you encounter a space add one to  a variable holding a count of words.
 * display back the number of words to user
 */
import java.util.Scanner;
public class postLab6CountNumberOfWords {
	public static void main(String[] args) {
		System.out.println("ID:001");
		Scanner input = new Scanner(System.in);
		String sentence;//declare variables
		int numberOfWords = 0;
		int index = 0;
		
		System.out.println("Please enter a string: ");//ask user for string
		sentence = input.nextLine();
		while (index < sentence.length()) {//loop to count number of words
			numberOfWords++;
			index = sentence.indexOf(" ", index + 1);
			if (index == -1) {
				index = sentence.length();
			}
		}
		System.out.println("The number of words are: " + numberOfWords);//display result to user
	}
}