/*
 * @author:Isaac Altice
 * @date:11/28/18
 * 
 * Description: A program that is a simple game. The user will set up a size area and then add or remove animals to certain locations.then the user will choose to explore the area created 
 * and a world area will be shown showing where the user currently is and where he has been. he will be given a menu for movement options and then will get to move freely searching the area for the
 * animals.As he moves through the area he will be told if each location is empty or it contains an animal. The menu will also give the user an option to display all animals found so far.this continues
 * until the user decides to quit.
 * 
 * Pseudocode:
 * display short instructions for game to user
 * ask user for inputs of the dimensions of the world he wants to create
 * take inputs and set to variables
 *declare and initialize arrays for world,animal locations,observed animals, and explored area
 *make world array using x for current location, * for unexplored, o for already explored
 *display a menu allowing user to choose from adding animals, removing animals, or to start exploring area created
 *keep taking inputs for this menu and executing the correct statements for each menu choice until the user decides to explore area
 *display invalid if a choice not on menu is inputed
 *display the current world
 *display movement menu
 *ask user for move 
 *take user input for move option
 *update world on current user location and if the user has or has not found a animal at new location
 *if found display the animal and all animals found so far
 *display new world to user showing where he has been and his current location and unexplored areas
 *continue asking user for moves until the user decides to quit
 *
 *
 * ,
 * 
 */
import java.util.Scanner;
import java.util.Arrays;
public class assignment4 {
	static boolean[][] exploredWorld; //global array
	static Scanner sc = new Scanner(System.in);//global scanner
	
	public static void main(String[] args) {
		String animal;// variable initialize and declare
		int choice = 0;

		System.out.println("Welcome to the jungle creator!\nIn this game, you will be inserting animals in certain places in the world\nthat you create! You will also be allowed to remove animals from certain locations before you start exploring!\nOnce you start exploring you will navigate around the world to observe the animals you have inserted.\nThe game will keep track of all the animals you have observed!");
		System.out.println("Enter the dimensions of your jungle !");//display intro message to user
		System.out.print("Enter length: ");//ask for length
		int length = sc.nextInt();//length = y
		System.out.print("Enter width: ");//ask for width
		int width = sc.nextInt();//width = x
		
		String [][] world = new String[length][width];//declare array
		exploredWorld = new boolean [length][width];// initialize array
		String [][] animalLocations = new String[length][width];//declare and initialize array
		for(int i = 0; i < animalLocations.length;i++)
			for(int j = 0; j < animalLocations[i].length; j++)
				animalLocations[i][j] = " ";
				
		String [] observedAnimals = new String[length * width];//declare and initialize array
		for(int i = 0; i < observedAnimals.length;i++)
				observedAnimals[i] = " ";
		
		makeWorld(world,0,0);//call make world method
		do{//do while loop to navigate menu
			printMainMenu();//call method to display menu
		
		choice = sc.nextInt();//get menu choice
		switch (choice) {//switch statements for menu options
		case 1:
			insertAnimalToWorld(animalLocations);// call method to insert animals

			break;
		case 2:
			removeAnimalFromWorld(animalLocations);//call method to remove animals

			break;
		case 3:
			explore(world,animalLocations,observedAnimals);//call method to explore world
			break;
		default:
			System.out.println("Invalid menu choice");	//display invalid menu choice
		}
		}while(choice != 3);
	}
	
	public static String[][] makeWorld(String[][] world, int posX, int posY) {//method to make world
		for(int i = 0; i < world.length;i++) {// 2 for loops to navigate though array
			for(int j =0; j < world[i].length;j++) {
				if (isExplored(i,j) == true)// call is explored method and initialize world depending on result
					world[i][j] = "o";
				else if (isExplored(i,j) == false)
					world[i][j] = "*";
			}
		}
		world[posX][posY] = "x";//starting point
		return world;//return world array
	}

	public static void printMainMenu() {//method to display menu
		System.out.println("1. Insert an animal into the world");
		System.out.println("2. Remove an animal from the world");
		System.out.println("3. Explore the world");
		System.out.println("Enter your choice: ");
		
	}

	public static void printMoveMenu() {//method to display move menu
		System.out.println("Move Menu: \nW. Move Forward \nA. Move Left \nS.Move Backward \nD. Move Right \nI. Display observed animals \nE. Exit \nEnter your choice: ");
	}


	public static void insertAnimalToWorld(String[][] animalLocations) {//method to insert animals in world
		int x;//variables for location
		int y;
	
		System.out.println("Enter the name of the animal you would like to insert: ");//ask for animal name
		String animal = sc.next();//take input for animal name
		do {//do while loop to get valid coordinates
		System.out.println("Enter the x coordinate of your animal :");//ask for coordinates and set input to correct variable
		y = sc.nextInt();
		System.out.println("Enter the y coordinate of your animal :");
		x = sc.nextInt();
		if (!((x >= 0 &&  x < animalLocations.length) && (y >= 0 && y < animalLocations.length))) {//if statements for out of bounds
			System.out.println("Out of bounds");
			break;
		}
		animalLocations[x][y] = animal;//set array element value
		System.out.println("Animal added");//display animal added
		}while(!((x >= 0 &&  x < animalLocations.length) && (y >= 0 && y < animalLocations.length)));
		

	}

	public static void removeAnimalFromWorld(String[][] animalLocations) {//method to remove animal from world
		int x;//variables for coordinates
		int y;
		do {//do while loop to get valid coordinates
		System.out.println("Enter the x coordinate of the animal you want to remove : ");//ask user for coordinates and assign to proper variables
		y = sc.nextInt();
		System.out.println("Enter the y coordinate of the animal you want to remove : ");
		x = sc.nextInt();
		if(((x >= 0 &&  x < animalLocations.length) && (y >= 0 && y < animalLocations.length))){// if statement for empty block
			if(isEmptyBlock(animalLocations,x,y)) {//call is empty block method to check 
				System.out.println("Sorry, you can not remove the animal because the block is empty");//display to user
				break;
			}
		}
		else {//else statement for coordinates out of bounds
			System.out.println("Coordinates out of bounds");//display to user
			break;
		}
		
		System.out.println("Animal removed");//display to user
		animalLocations[x][y] = " ";//clear block
		}while(!((x >= 0 &&  x < animalLocations.length) && (y >= 0 && y < animalLocations.length)));


		
	}

	public static boolean isEmptyBlock(String[][] animalLocations, int x, int y) {//method for checking if block is empty
		boolean animal = true;// variable for animal
		if (!(animalLocations[x][y].equals(" ")))//if empty
			animal = false;
		return animal;
	}


	public static String[] updateObservedAnimals(String[] observedAnimals, String animal) {//method for updating observed animal list
		for(int i = 0; i <observedAnimals.length;i++) {//loop to navigate array
			if(observedAnimals[i].equals(" ")) {//take first empty spot and replace with animal
				observedAnimals[i] = animal;
				break;
				}
		}
		return observedAnimals;//return array
	}


	public static void printWorld(String[][] world) {// method to print world
		for (int i = 0; i < world.length; i++){//loop to navigate array
			for (String s : world[i]) {//print each element of array
				System.out.print(s + " ");
			}
			
		System.out.println();
		}
	}
	
	
	public static void explore(String[][] world, String[][] animalLocations, String[] observedAnimals) {//method to explore world
		int x=0;// location variables
		int y=0;
		String choice;
		do {//do while loop for movement menu
			printWorld(world);//call method to print world
			printMoveMenu();//call method to print move menu
			choice = sc.next();//get input from user for menu choice
			choice = choice.toUpperCase();//change input to capital
			switch (choice) {//switch statements for menu
			case "W" ://moving up
				if (0 <= (x -1) && (x-1) < world.length) {//change x coordinate by one and check 
					x = x -1;
					move(world,x ,y,observedAnimals,animalLocations);//call method to make the move
				}
				else {// if invalid coordinates
					System.out.println("You went out of bounds, reseting location");//display to user
					x = 0;//reset location variables
					y = 0;
					makeWorld(world,x,y);//call method to reset location
				}
				
				break;
			case "S" ://choice to move down
				if (0 <= (x+1) && (x+1) < world.length) {//check for valid coordinate and call method to make move
					x = x+1;
					move(world,x ,y,observedAnimals,animalLocations);
				}
				else {// reset location and make world when invalid coordinates
					System.out.println("You went out of bounds, reseting location");
					x = 0;
					y = 0;
					makeWorld(world,x,y);
				}

				
				break;
			case "A" ://move left 
				if (0 <= (y-1) && (y-1) < world.length) {//check for valid coordinates and make move 
					y = y-1;
					move(world,x ,y,observedAnimals,animalLocations);
				}
				else {
					System.out.println("You went out of bounds, reseting location");//display invalid move and reset location
					x = 0;
					y = 0;
					makeWorld(world,x,y);
				}

				break;
			case "D": //move right
				if (0 <= (y+1) && (y+1) < world.length) {//check for valid coordinates and make move
					y = y+1;
					move(world,x ,y,observedAnimals,animalLocations);
				}
				else {
					System.out.println("You went out of bounds, reseting location");//display out of bounds and reset location and display world
					x = 0;
					y = 0;
					makeWorld(world,x,y);
					
				}

				break;
			case "I"://print observed animals
				printObservedAnimals(observedAnimals);//call method to display
				break;
			case "E":
				System.out.println("Goodbye");//display good bye
				break;
				
			default:
				System.out.println("Invalid menu choice");//display invalid menu choice
				break;
			}
			
		}while(!(choice.equals("E")));
		
	}

	public static String[][] move(String[][] world, int x, int y, String[] observedAnimals, String[][] animalLocations) {//method to make move
		exploredWorld[x][y] = true;//change location to true so we know where we have been
		makeWorld(world,x,y);//make new world to display move

		if(!(animalLocations[x][y].equals(" "))) {//check for animals at new locations and display results
			System.out.println("You found a " + animalLocations[x][y]);
			updateObservedAnimals(observedAnimals, animalLocations[x][y]);
			System.out.print("So far you have found: ");
			printObservedAnimals(observedAnimals);
		}
		else
			System.out.println("You did not encounter anything :(");//display no animals found if needed
		
		return world;//return updated world array
		

	}

	public static void printObservedAnimals(String[] observedAnimals) {//method to print observed animals
		for (int i=0;i<observedAnimals.length;i++){// loop to navigate array
					
			if (observedAnimals[i] != " ") // print array element if it is not blank
				System.out.print(observedAnimals[i] + " ");
		}
		System.out.println();
	}


	public static boolean isExplored(int x, int y) {//method to see if the user has been at this location before
		
		return exploredWorld[x][y];// return true or false depending on coordinate

	}

}
