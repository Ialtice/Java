/*
 * @author : Isaac Altice
 * @version: 10/23/18
 * Description:A program that will ask the user to enter a sentence then it will ask for a word to replace and a word to replace it with.
 * it will then go through the sentence and find all occurrences of the word and replace it with the other word
 * 
 * Pseaudocode:
 * Ask user to enter a sentence
 * ask user to enter word to be replaced
 * ask user to enter word to replace other word
 * go through sentence and replace the entered word with the new word
 * display new sentence to user
 */
import java.util.Scanner;
public class postLab6ReplaceIncidentsOfString {
	public static void main(String[] args) {
		System.out.println("ID:003");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");// ask user for sentence
		String sentence = input.nextLine();
		System.out.println("Enter word 1 (to be replaced): ");// ask user for word to be replaced
		String word1 = input.nextLine();
		System.out.println("Enter word 2 (that replaces word 1): ");//ask user for word to replace other word
		String word2 = input.nextLine();
		String part1Sentence = sentence;
		part1Sentence = part1Sentence.replaceAll(word1, word2);// correcting sentence with replaceall method
		System.out.println("Part 1 :");
		System.out.println("New String: " + part1Sentence);//display new sentence
		System.out.println("Part 2:");
		int foundAt =sentence.indexOf(word1);
		int newFoundAt = 0;
		if (foundAt != -1) {//search sentence for words to be replaced and replace them
			while (foundAt != -1) {
			
			if (foundAt == 0) {
				sentence = word2 + sentence.substring(word1.length());
				newFoundAt = word2.length();
				foundAt = sentence.indexOf(word1, newFoundAt);
				System.out.println(foundAt);
			}
			for (int i = foundAt; i < sentence.length();i++) {
				if (foundAt == -1) {
					i = sentence.length();
				}
				else {
				sentence = sentence.substring(0, foundAt) + word2 + sentence.substring(foundAt + word1.length());
				newFoundAt = foundAt + word2.length();
				foundAt = sentence.indexOf(word1, newFoundAt);
				
				i = foundAt -1;
				}
			}

			System.out.println("New String: " + sentence);// display new sentence
			}
		}
	}
}