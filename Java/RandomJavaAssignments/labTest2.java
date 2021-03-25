/*
 * Lab Test 2
 * 
 * @author isaac atltice
 * @version date 10/24/18
 * 
 * lab section: 008
 * purpose:
 * 
 * pseudocode:
 * 
 */
import java.util.Scanner;
public class labTest2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Part A");
		String words = "";
		String newWords;
		while (!words.contains("end")){
			System.out.println("Please enter a word: ");
			words += input.nextLine() + " ";
		}
		words = words.substring(0, words.indexOf("end"));
		System.out.println(words);
		String choice;
		int count;
		int length;
		do {
		System.out.println("Part B");
		
		menu();
		System.out.println("Please enter a menu choice: ");
		choice = input.nextLine();
		choice = choice.toUpperCase();
		switch (choice) {
		case "A":
			count = 0;
			for (int i = 0; i< words.length(); i++) {
				count++;
				i = words.indexOf(" ");
				if (i == -1)
					i = words.length();
				
			}
			System.out.println("Total number of words entered: " + count );
			break;
		case "B":
			length = words.length();
			System.out.println("The total number of letters is : ");
			break;
		case "C":
			if (!words.contains(" "))
				System.out.println(words);
			else {
				for (int i = 0; i < words.length();i++) {
					int endWord = words.indexOf(" ");
					do {
						newWords = words.substring(i,endWord);
					}while(endWord != -1);
					System.out.println(newWords);
					i = words.indexOf(" ");
					if (i == -1)
						i = words.length();
				}
			}
			break;
		case "D":
			count = 0;
			for (int i = 0; i < words.length(); i++) {
				if (words.contains("e") || words.contains("E")){
					String eSearch = words.toLowerCase();
					count++;
					i = eSearch.indexOf("e");
					if (i == -1) {
						i = words.length();
					}
					
				}
				else {
					System.out.println(" Does not contain any e's");
					i = words.length();
				}
			}
				
			break;
		case "E":
			count = 0;
			for (int i = 0; i < words.length(); i++) {
				if (words.contains("e") || words.contains("E")){
					String eSearch = words.toLowerCase();
					i = eSearch.indexOf("e");
					String eWords = eSearch.substring(i, eSearch.indexOf(" "));
					if (eWords.contains("e")) {
						count++;
						i = eSearch.indexOf(" ");
				
					}
					else
						i = eSearch.indexOf(" ");
					if (i == -1) {
						i = words.length();
					}
					
				}
				else {
					System.out.println(" Does not contain any words with two e's");
					i = words.length();
				}
			}
			break;
		case "F":
			System.out.println(words.toUpperCase());
			break;
		case "G":
			System.out.println(words.toLowerCase());
			break;
		case "J":
			break;
		default:
			System.out.println("Incorrect menu choice select again");
		}		
		}while (!choice.equalsIgnoreCase("j"));
		
	}
	public static void menu() {
		System.out.println("A. Display the total number of words entered by user");
		System.out.println("B. Display the total number of letters entered by the user");
		System.out.println("C. Display all the words entered by the user");
		System.out.println("D. Display the total number of times the letter e occurrs");
		System.out.println("E. Display the total number of words with more then one  e occurrence");
		System.out.println("F. Display all the words in uppercase");
		System.out.println("G. Display all the words in lowercase");
	}
}
