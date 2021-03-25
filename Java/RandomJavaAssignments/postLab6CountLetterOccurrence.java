/*
 * @author : Isaac Altice
 * @version: 10/23/18
 * Description:A program that will ask the user to enter a sentence and then ask the user for a letter. 
 * it will count the number of occurrences of the letter and display the result
 * back to the user.
 * 
 * Pseaudocode:
 * Ask user to enter a sentence
 * ask user to enter a letter
 * search the sentence for letter and every time you encounter the letter add one to  a variable holding a count of that letter.
 * display back the number of times the letter occurred
 */
import java.util.Scanner;
public class postLab6CountLetterOccurrence {
	public static void main(String[] args) {
		System.out.println("ID:002");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String sentence = input.nextLine();
		System.out.println("Enter a letter to count the number of occurences: ");
		String letter = input.nextLine();
		char letterSingle = letter.charAt(0);
		int count = 0;
		for(int i = 0; i < sentence.length(); i++) {
			if (letterSingle ==sentence.charAt(i)) {
				count++;
			}
		}
		System.out.println("Total Occurrence : " + count);
	}
}