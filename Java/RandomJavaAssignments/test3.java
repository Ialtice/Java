/*
 * program:test3
 * 
 * @author: Isaac Altice
 * version: 11/28/18
 * labsection: 008
 * Purpose:a program that will ask the user for the size of the array they wish to create and then give them a menu of options to do to the array. The options 
 * will be search, shuffle, initialize, display and quit. the user will then choose an option from the menu and it will do its display action and then display.This will continue until
 * the user selects quit. 
 * 
 * Pseuodcode:
 * ask user to enter a size for an array
 * generate random numbers between -100 and 100 to fill in the array using a method
 * display a menu of 5 options : search, shuffle, initialize,display, quit to user
 * ask user for menu choice
 * if one ask the user for a number to search the array for
 * if found display its array location
 * if not found display not found and return to menu
 * if menu option two shuffle the contents of the array
 * return to menu
 * if menu option 3 ask the user to enter a new length for an array
 * fill the array with the method used in menu choice one
 * if option four is choosen display the array to the user 
 * return to menu
 * if option 5 is chosen display goodbye and end the program.
 * 
 * 
 */
import java.util.Scanner;//import scanner

public class test3 {
	static Scanner input = new Scanner(System.in);// create scanner
	public static void main(String[] args) {//main method
		System.out.println("Enter the length of the array you wish to create :");//ask user for array size
		int size = input.nextInt();//take in input for array size
		int [] numbers = new int [size];//declare and create array
		fill(numbers);//call fill method
		int choice;
		do {//do while loop to repeated menu choice until user quits
			menu();//display menu
			System.out.println("Please enter you menu choice: ");//ask user for menu choice
			choice = input.nextInt();//take in input for menu choice
			switch (choice) {//switch to navigate menu
			case 1://if menu choice 1
				System.out.println("Enter the number you wish to search for : ");// ask suer for number to search for
				int key = input.nextInt();// take in input for search number and set to variable key
				int found = search(numbers,key); // call search method and assign key location in array to found
				if (found != -1)// if found in array
					System.out.println("The number you entered was found at index " + found + " of the array.");//display keys location in array
				else// if not found in array
					System.out.println("The number you entered was not in the array.");//display key not found
				
				break;
			case 2://choice =2
				shuffle(numbers);//call shuffle method
				System.out.println("Your array has been shuffled");//tell user array was shuffled
				break;
			case 3://choice =3
				System.out.println("Please enter the length of the new array you wish to create: ");//ask user for new array length
				int length = input.nextInt();//set input to variable
				numbers = newNumbers(length);// call newNumbers method and replace old array
				System.out.println("Your array has been replaced");//tell user array was replaced
				break;
			case 4://choice = 4
				display(numbers);//display contents of array
				break;
			case 5://choice =5
				System.out.println("Goodbye");//display good bye
				break;
			default:// choice is invalid
					System.out.println("Invalid menu choice");
				break;
			}
		}while (choice != 5);
		
	}
	public static void fill(int[] numbers) {//method to fill array with numbers
		for(int i = 0; i < numbers.length; i++) {// for loop to move through each element of array
			numbers[i] = (int)((Math.random() * 200)- 100);//generate a random number between -100 and 100 to each spot in the array
		}
		
	}
	public static int search(int[] numbers, int key) {//method to search array
	/*	int low = 0;
		int high = numbers.length -1;
		while (high >= low) {
			int mid = (low + high) /2;
			if (key < numbers[mid])
				high = mid -1;
			else if( key == numbers[mid])
				return mid;
			else 
				low = mid + 1;
		}
		return low -1;
	}
	*/		
		
		
		 
		  for(int i = 0; i< numbers.length;i++) {// loop through array
			if (key== numbers[i])//return index where value was found at
				return i;
		}
		return -1;//return -1 if not found
	}
	public static void shuffle(int[] numbers) {//shuffle array method
		for(int i = numbers.length -1; i> 0; i--) {//loop through array
			int j = (int)(Math.random() * (i + 1));//generate random index to swap
			int temp = numbers[i];// hold current
			numbers[i] = numbers[j];//swap values
			numbers[j] = temp;
		}
	}
	public static int[] newNumbers(int length) {//method to make new array
		int[] newNumbers = new int[length];//generate new array
		fill(newNumbers);//fill new array
		return newNumbers;//return new array to main method
	}
	public static void display(int[] numbers) {//method to display array contents
		System.out.println("Your array contain the following: ");
		for(int i = 0; i < numbers.length;i++)//loop through array
			System.out.print(numbers[i] + " ");//display each value
		System.out.println("");
		
	}
	public static void menu() {//method to display menu
		System.out.print("1.Search Array\n2.Shuffle Array\n3.Initialize Array\n4.Display Array\n5.Quit\n");
	}
	
}
