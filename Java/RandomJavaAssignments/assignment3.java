/*
 * @author Isaac altice
 * @version 11/14/2018
 * @description
 * A program that will display a menu for the user to choose from and ask the user for a menu choice.
 * if option one the program will display a table of book id numbers, titles, and cost. it will then use a linear search to search through arrays to complete a transaction for the user.
 * The user will be ask for the book id number and the quantity of the book.
 * the program will then calculate the cost and display it back to the user and return them to the menu.
 * if option one the program will display a table of book id numbers, titles, and cost. it will then use a binary search to search through arrays to complete a transaction for the user.
 * The user will be ask for the book id number and the quantity of the book.
 * the program will then calculate the cost and display it back to the user and return them to the menu.
 * if option three the program will generate and display a 10 number array with random values between 1-500.
 * it will then sort the array using bubble sorting and display the sorted array back to the user.
 *  if option four the program will generate and display a 10 number array with random values between 1-500.
 * it will then sort the array using selection sorting and display the sorted array back to the user.
 * the user will need to enter menu choice 5 to exit the menu.
 * @pseudo code:
 * declare and initialize arrays for book titles, book id numbers, book prices, and random numbers
 * display menu to user
 * get menu choice from user
 * if choice 1 display linear search and  a table with all book titles, IDs , and prices.
 * ask user for what id book they want
 * ask user for quantity of book wanted
 * use linear search to find and calculate the needed information within the arrays to calculate the total cost
 * display back user's book ID,title, quantity and total 
 * return them to menu
 * declare and initialize arrays for book titles, book id numbers, book prices, and random numbers
 * display menu to user
 * get menu choice from user
 * if choice 2 display binary search and  a table with all book titles, IDs , and prices.
 * ask user for what id book they want
 * ask user for quantity of book wanted
 * use linear search to find and calculate the needed information within the arrays to calculate the total cost
 * display back user's book ID,title, quantity and total 
 * return them to menu
 * if choice 3 display bubble sort
 * display unsorted numbers text
 * generate 10 random numbers between 1-500 and send to an array
 * display all the numbers unsorted
 * sort the numbers using bubble method
 * display sorted numbers 
 * return to menu
 * if choice 4 display selection sort
 * display unsorted numbers text
 * generate 10 random numbers between 1-500 and send to an array
 * display all the numbers unsorted
 * sort the numbers using selection method
 * display sorted numbers 
 * return to menu
 * 
 * display 
 * @which is fast?
 * binary and selection

 */
import java.util.Scanner;

public class assignment3 {

public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	String[] bookTitle = {"Starting out with Java", "Java Programing", "Software Structures",//declare and initialize arrays
			"Design and Analysis of Algorithms", "Computer Graphics", "Artificial Intelligence: A Modern Approach",
			"Probability and Statistics", "Cognitive Sceince", "Modern Information Retrieval", "Speech and Language Processing"};
	int[] bookID = {1101, 1211, 1333, 1456, 1567, 1642, 1699, 1755, 1800, 1999};
	double[] bookPrice = {112.32, 73.25, 54.00, 67.32, 135.00, 173.22, 120.00, 42.25, 32.11, 123.75};
	int[] random = new int[10]; 
	int choice =0;//delcare variables
	int id;
	int copies;
	double total;
	long start;
	long finish;
	long timeElapsed;
	do {// do while loop for menu operation
		display();// display menu options

		
		choice = input.nextInt(); //get menu choice
		
		switch (choice) {//switch statement for menu operations
		case 1:// case for linear search
			System.out.println("**** LINEAR SEARCH ****");
			System.out.println();
			displayBooks(bookTitle, bookID, bookPrice);//method to display book info

			System.out.println("Please enter the book ID you wish to purchase from the list above: ");//get book id wanted from user
			id =  input.nextInt();
			System.out.println("How many copies do you wish to purchase: ");//get how many copies wanted by user
			copies = input.nextInt();
			start = System.currentTimeMillis();
			total = copies * bookPrice[linearSearch(bookID,id)];// calculate total using linear search to get info from arrays

			System.out.println("Book ID: " + id);// display results back to user
			System.out.println("Book Title: " + bookTitle[linearSearch(bookID, id)]);
			System.out.println("Number of books bought: " + copies);
			System.out.print("Total Cost: $");
			System.out.printf("%.2f",total);
			System.out.println("\n");
			finish = System.currentTimeMillis();
			timeElapsed = finish -start;
			System.out.printf("%20s\n","Execution of this function took : " + timeElapsed + " milliseconds ");
			break;
		case 2:
			System.out.println("**** BINARY SEARCH ****");// case for binary search
			System.out.println();
			displayBooks(bookTitle, bookID, bookPrice);//display book info

			System.out.println("Please enter the book ID you wish to purchase from the list above: ");// get book id and number of compies from user
			id =  input.nextInt();
			System.out.println("How many copies do you wish to purchase: ");
			copies = input.nextInt();
			start = System.currentTimeMillis();
			total = copies * bookPrice[binarySearch(bookID,id)];//calculate total using info gotten from arrays using binary search

			System.out.println("Book ID: " + id);// display results
			System.out.println("Book Title: " + bookTitle[binarySearch(bookID, id)]);
			System.out.println("Number of books bought: " + copies);
			System.out.print("Total Cost: $");
			System.out.printf("%.2f",total);
			System.out.println("\n");
			finish = System.currentTimeMillis();
			timeElapsed = finish -start;
			System.out.printf("%20s\n","Execution of this function took : " + timeElapsed + " milliseconds");
			break;
		case 3:
			System.out.println("**** BUBBLE SORT ****");//case for bubble sort
			start = System.currentTimeMillis();
			bubbleSort(random);//method to use bubble sort
			finish = System.currentTimeMillis();
			timeElapsed = finish -start;
			System.out.printf("%20s\n","Execution of this function took : " + timeElapsed + " milliseconds");
			break;
		case 4:
			System.out.println("**** SELECTION SORT ****");//case for selection sort
			start = System.currentTimeMillis();
			selectionSort(random);//method to use selection sort
			finish = System.currentTimeMillis();
			timeElapsed = finish -start;
			System.out.printf("%20s\n","Execution of this function took : " + timeElapsed + " milliseconds");
			break;
		case 5:
			System.out.println("**** Quit ****");//menu choice to exit
			System.out.println("Goodbye");
			break;
		default:
			System.out.println("Incorrect choice , select again");// error message if incorrect value for menu choice
		}
	}while (choice != 5);
	
	}
	
public static void display() {
	System.out.println("1. Linear Search");// method to display menu options and ask user for choice
	System.out.println("2. Binary Search");
	System.out.println("3. Bubble Sort");
	System.out.println("4. Selection Sort");
	System.out.println("5. Quit");
	System.out.println("Please enter a number between 1-5: ");
}
public static int linearSearch(int[] bookId,int key) {// linear search method
	
	for (int i = 0; i < bookId.length;i++) {
		if (key == bookId[i])// go through array one value at a time until value is found or array search is finished
			return i;// return index of found value
	}
	return -1;
}
public static int binarySearch(int[] bookId, int key) {// method for binary search
	int low = 0;//initial low and high set
	int high = bookId.length  -1;
	 while (high >= low) {// loop through until match is found or not
		 int mid = (low + high) / 2;// searches top half or bottom half of array until value is found
		 if (key < bookId[mid])
			 high = mid -1;
		 else if  (key == bookId[mid])
			 return mid;
		 else
			 low = mid +1;
		 
	 }
	return -low -1;
	
}
public static void bubbleSort(int[] random) {//method for bubble sorting
	for(int i = 0; i < random.length;i++) {
		random[i] = (int)((Math.random() * 499)+1);//generate random numbers to fill in arrays 10 spots
	}
	System.out.println("The unsorted array is:");//show unsorted array
	for(int i = 0; i < random.length; i++)
		System.out.print(random[i] + " ");
	System.out.println("");
	boolean needNextPass = true;
	
	for (int k =1; k < random.length && needNextPass; k++) {//sort array using bubble sorting
		for(int i = 0; i < random.length - k; i++)
		if(random[i] > random[i +1]) {//goes through array and check make sure the current lowest value is the lowest to the left of the if not swap neighbor value
			int temp = random[i];
			random[i] = random[i +1];
			random[i + 1] = temp;
			needNextPass = true;
		}
	}
	System.out.println("The sorted array is: ");//display sorted array
	for(int i = 0; i < random.length; i++)
		System.out.print(random[i] + " ");
	System.out.println("");
	
}
public static void selectionSort(int[] random) {//selection sort method
	for(int i = 0; i < random.length;i++) {//generate random numbers
		random[i] = (int)((Math.random() * 499)+1);
	}
	System.out.println("The unsorted array is:");
	for(int i = 0; i < random.length; i++)//display unsorted array
		System.out.print(random[i] + " ");
	System.out.println("");
	for (int i = 0; i < random.length -1; i++) {//goes through array and swaps current index value with lowest index value until sorted
		double currentMin = random[i];
		int currentMinIndex = i;
		
		for (int j = i +1; j < random.length;j++) {
			if (currentMin > random[j]) {
				currentMin = random[j];
				currentMinIndex = j;
			}
	}
		if (currentMinIndex != i) {
			random[currentMinIndex] = random[i];
			random[i] = (int)currentMin;
		}
	
}
	System.out.println("The sorted array is: ");//display sorted array
	for(int i = 0; i < random.length; i++)
		System.out.print(random[i] + " ");
	System.out.println("");
}
public static void displayBooks(String[] bookTitle, int[] bookId, double[] cost) {//method to display book info
	System.out.printf("%-15s%-50s%s\n", "Book ID", "Title","Cost");
	for (int i = 0; i< cost.length; i++) 
		System.out.printf("%-15s%-50s%s\n",bookId[i], bookTitle[i],cost[i]);
	System.out.println();
}
}