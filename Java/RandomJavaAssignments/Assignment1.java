/*
 * @author Isaac Altice
 * @version 9/24/18
 * Description: A program that allows users to select from 5 different options in a menu and then calculate a test average if option one is selected,
 * a dice roll if selection two is made, calculate area of circle if 3 , compute a distance if 4, and quit if 5 is selected.
 * 
 * Pseudocode:
 * display a menu with 5 options (Lab test average calculator, dice roll, circle area calculator, compute distance, and quit)  to user
 * get a integer input from user and assign to choice variable
 * if choice one  ask user for 3 test grades
 * take 3 inputs from user and assign them to double variables
 * calculate average and assign to average variable
 * display to user the results
 * if choice 2 then generate a random number 1-6 assign to variable 
 * ask the user to guess even or odd
 * take input from user as string and assign to variable
 * calculate if user guessed correctly
 * display a message to user of a win or loss
 * if choice 3 ask the user for a radius
 * take a input from user and assign to double variable
 * calculate circle area 
 * display results to user
 * if choice 4 ask user to input the 2 sets of coordinates
 * take 4 numbers from user and assign to double variables
 * calculate the distance between the 2 coordinates
 * display the result to the user
 * if choice 5 then display good bye to user
 * 
 */
import java.util.Scanner; //import scanner
public class Assignment1 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);// initialize scanner
		System.out.println("|-------------------------------------|");//display menu
		System.out.println("1. Lab Test Average Calculator");
		System.out.println("2. Dice Roll");
		System.out.println("3. Circle Area Calculator");
		System.out.println("4. Compute Distance");
		System.out.println("5. Quit");
		System.out.println("|-------------------------------------|");
		System.out.println("Please enter a number as a choice from the menu above.(1,2,3,4, or 5)");// ask user for choice input
		int choice = input.nextInt(); //take input from user assign to choice
		switch (choice){// use switch method to determine what commands to excute for choice
			case 1://commands if choice = 1
				System.out.println("Lab Test Calculator Selected");// display option choosen and ask for 3 test grades
				System.out.println("Please enter the three test grades");
				double test1 = input.nextDouble();// take 3 inputs and assign to variables
				double test2 = input.nextDouble();
				double test3 = input.nextDouble();
				double average = ((test1 + test2 +test3) / 3);// calculate average and assign to variable
				average = Math.round(average * 100.0) / 100.0;//round average
				System.out.println("Your lab test average is " + average);//display results
				break;
			case 2:// if choice =2
				System.out.println("Dice Roll Selected");//display option
				int diceRoll = (int)(Math.random() * 6 +1);//get random value for diceRoll variable
				System.out.println("Please enter your guess of even or odd: ");//ask user for guess
				String guess = input.next();// take input from user as string guess
				if ((guess.equals("even") && diceRoll % 2 == 0) || (guess.equals("odd") && diceRoll % 2 != 0)) {// determine if user was guess was correct
					System.out.println("Congradulations! You won.");//display winning message
				}
				else if ((guess.equals("odd") && diceRoll % 2 == 0) || (guess.equals("even") && diceRoll % 2 != 0)){// determine if user was incorrect
					System.out.println("Sorry, you lost");// display loss message
				}
				break;
			case 3: // if choice =3
				System.out.println("Circle Area Calculator Selected");//display option
				System.out.println("Please enter the radius of the circle: ");//ask user for radius
				double radius = input.nextDouble();//take input from user and assign to variable radius
				double circleArea = 3.14 * Math.pow(radius, 2);//calculate area and assign to variable
				System.out.println("The circle's area is " + circleArea);//display results
				break;
			case 4: //if choice =4
				System.out.println("Compute Distance Selected");//display option
				System.out.println("Please enter the x and y coordinates for two points");// ask user for 4 inputs for 2 sets of coordinates
				System.out.println("Point 1 x value: " );//ask user for first input
				double x1 = input.nextDouble();//take input and assign to variable
				System.out.println("Point 1 y value: ");//ask user for 2nd input
				double y1 = input.nextDouble(); //take input and assign to variable
				System.out.println("Point 2 x value: ");//ask user for 3rd input
				double x2 = input.nextDouble();//take input and assign to variable
				System.out.println("Point 2 y value: ");//ask user for 4th input
				double y2 = input.nextDouble();//take input and assign to variable
				double distance = Math.pow((Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2)), .5);//calculate distance
				distance = Math.round(distance *100.0) / 100.0;
				System.out.println("The distance between the two points is " + distance  + " units");//display results
				break;
			case 5://if choice =5
				System.out.println("Quit Selected");//display option and message to user
				System.out.println("Goodbye");
			default:System.out.println("Invalid choice, goodbye.");//display invalid option to user
		}
		
	}

}
