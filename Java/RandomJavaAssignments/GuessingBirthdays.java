/*
 * @author Isaac Altice
 * @version 9/25/18
 * Description :
 * A program that will ask the user 5 questions in order to determine if their birthday is in a set of numbers. From these 5 question the 
 * program determines what day of the month their birthday is on and displays it to them. 
 * 
 * Question answer: 
 * Your birthday is 13!
*/
import java.util.Scanner;

public class GuessingBirthdays {
	public static void main (String[] args) {
		System.out.println("ID001");
		String set1 = 
				" 1  3  5  7\n" +
				" 9 11 13 15\n" +
				"17 19 21 23\n" +
				"25 27 29 31";
		
		String set2 =
				" 2  3  6  7\n" +
				"10 11 14 15\n" +
				"18 18 22 23\n" +
				"26 27 30 31\n";
		String set3 =
				" 4  5  6  7\n" +
				"12 13 15 15\n" +
				"20 21 22 23\n" +
				"28 29 30 31";
		String set4 = 
				" 8  9 10 11\n" +
				"12 13 14 15\n" +
				"24 25 26 27\n" +
				"28 29 30 31";
		String set5 = 
				"16 17 18 19\n" +
				"20 21 22 23\n" +
				"24 25 26 27\n" +
				"28 29 30 31";
		int day = 0;
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to answer questions
		System.out.print("Is your birthday in set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		int answer = input.nextInt();
		
		if (answer == 1)
			day += 1;
		
		//prompt user to answer questions
		System.out.print("Is your birthday in set2?\n");
		System.out.print(set2);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
				
		if (answer == 1)
			day += 2;
		
		System.out.print("Is your birthday in set3?\n");
		System.out.print(set3);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
				
		if (answer == 1)
			day += 4;
		
		System.out.print("Is your birthday in set4?\n");
		System.out.print(set4);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
				
		if (answer == 1)
			day += 8;
		
		System.out.print("Is your birthday in set5?\n");
		System.out.print(set5);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer = input.nextInt();
				
		if (answer == 1)
			day += 16;
		
		System.out.println("\nYour birthday is " + day + "!");
}
}
