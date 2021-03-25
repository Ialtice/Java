/*
 * @author Isaac Altice
 * @version 11/5/18
 * @description:
 * a program that will generate 100 random lower case letters and display them to the user. It will then count the occurrences of each letter 
 * and display back to the user the number of occurrences of each letter to the user.
 * answered question: none
 */
public class preLab8CountingOccurencesOfEachLetter {
//main method
	public static void main(String[] args) {
		System.out.println("ID003");
		//declare array
		char[] chars = createArray();
		//display array
		System.out.println("The lowercase letters are: ");
		displayArray(chars);
		//count the occurrences of each letter
		int[] counts = countLetters(chars);
		 //display counts
		System.out.println();
		System.out.println("The occurrences of each letter are:");
		displayCounts(counts);
	}
	
	//create array of characters
	public static char[] createArray() {
		//declare an array of characters and create it
		char[] chars = new char[100];
		//create lower case letters randomly and assign them to array
		for (int i = 0; i < chars.length; i++)
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		//return array
		return chars;
			
	}
	//display the array of characters
	public static void displayArray(char[] chars) {
		//display the characters in array 20 on each line
		for( int i = 0; i < chars.length; i++) {
			if ((i +1) % 20 == 0)
				System.out.println(chars[i]);
			else 
				System.out.print(chars[i] + " ");
		}
	}
	//count occurrence of each letter
	public static int[] countLetters(char[] chars) {
		//declare and create an array of 26
		int[] counts = new int [26];
		
		//for each lower case letter in the array, count it
		for (int i = 0; i < chars.length; i++)
			counts[chars[i] - 'a']++;
		return  counts;
	}
	//display counts
	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if (( i +1) % 10 == 0)
				System.out.println(counts[i] + " " + ((char)(i + 'a')));
			else 
				System.out.print(counts[i] + " " +  ((char)(i + 'a') + " "));
			
		}
	}
}
