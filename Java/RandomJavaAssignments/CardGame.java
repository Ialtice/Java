import java.util.Scanner;
/**
 * @author Isaac Altice
 * @version 11/11/18
 *
 * Description:
 * a program that will allow a user to choose either to play against a computer, option one, or have two computers play against each other 100 times
 * in a game of pick a higher card(option two). if the user selects option one the user will be asked to pick a card number and then the program will
 * display the value of the card and the computers card pick and its value. It will then show who the winner is. if option two is selected the program 
 * show 100 game winners between the two computers and a final score and winner.
 *
 *
 * Pseudocode for:
 * main:
 * ask user for choice of play against a computer or have two computers play against each other
 * if choice one ask user to pick a card value
 * display the users card
 * display computers pick
 * display computers card
 * show winner
 * will ask user for game choice  until user puts -1 to quit 
 * if choice is two
 * shows one hundred winners of a computer vs computer game
 * shows final score out of a 100 games
 * declared winner
 * shuffleDeck Method: 
 * copy sorted deck to shuffle deck array
 * swap two random indexes of the deck 100 times
 * 
 * declareWinner Method:
 * pass the 2 values of the cards to the method
 * display the winner based one which of two values is larger
 * 
 * makeDeck method:
 * create string array of 52 length
 * create suit array and initialize
 * create rank array and initialize
 * initialize all values of deck using suit and rank array
 * 
 * findCardValue method:
 * pass the card string value to the method
 * search sorted deck for value and return its index
 *
 */

public class CardGame {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ID001");
		String[] sortedDeck = makeDeck();//make new sorted deck
		String [] sDeck= shuffleDeck(sortedDeck);//make shuffled deck
		
		int choice = 0;
		
		while (choice != -1) {
			System.out.println("What part do you want to do? (1 or 2 or -1 to quit): ");//ask user for choice 
			choice = input.nextInt();

			if (choice == 1) {
				int cardLoc = -1;
				while (!(cardLoc >= 0 && cardLoc <= 51)) {//get users card choice
				System.out.println("Enter a card location from 0 to 51: ");
				cardLoc = input.nextInt();
				if ((cardLoc < 0 || cardLoc > 51))//display error message if user selects card our of range
					System.out.println("Wrong input, try again");
				}
				int computerCardLoc = (int)(Math.random() * 51);// calculate computer card choice
			
				System.out.println("Computer choose: " + computerCardLoc);//show card selections
				System.out.println("You had a " + sDeck[cardLoc]);
				System.out.println("Computer had a " + sDeck[computerCardLoc]);
				
				int cardValue= findCardValue(sortedDeck, sDeck, cardLoc);//calculate card values
				int compCardValue = findCardValue(sortedDeck, sDeck, computerCardLoc);
		        declareWinner(cardValue, compCardValue);// declare winner
			}
			else if(choice == 2) {
				int comp1 = 0;
				int comp2 = 0;
			       for(int i = 0; i <100; i++) {//loop for one hundred games
			    	   int computerCardLoc1 = (int)(Math.random() * 51);//computer random card selections
			    	   int computerCardLoc2 = (int)(Math.random() * 51);
			    	   if (computerCardLoc2 == computerCardLoc1)
			    		   computerCardLoc2 = (int)(Math.random() * 51);
			    	   int computerCardValue1 = findCardValue(sortedDeck, sDeck, computerCardLoc1);//calculate card value
			    	   int computerCardValue2 = findCardValue(sortedDeck,sDeck, computerCardLoc2);
			    	   if (computerCardValue1 < computerCardValue2) {//determine winner of game and keep a tally and display to user
			    		   comp2++;
			    		   System.out.println("Computer 2 had a higher card" + sDeck[computerCardLoc2]);
			    	   }
			    	   else {
			    		   comp1++;
			    		   System.out.println("Computer 1 had a higher card" + sDeck[computerCardLoc1] );   
			    	   }
			    		   
			       }
			       System.out.println("Computer one has " + comp1 + " wins");//show total amount of wins
			       System.out.println("Computer two has " + comp2 + " wins");
			       if (comp1 > comp2)//show overall winner of the one hundred games
			    	   System.out.println("Computer 1 won the game");
			       else
			    	   System.out.println("Computer 2 won the game");
			       

			}
			else if (choice == -1) {
				System.out.println("Goodbye");
			}
		    
			else {
				System.out.println("Invalid input, try again");
			}

		}
		
	}


public static String[] makeDeck(){//method to make deck
String[] sortedDeck = new String[52];
String[] suit={"hearts","spades","clubs","diamonds"};
String[]rank={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
//initialize the cards
for (int i = 0; i < sortedDeck.length; i++) {
	sortedDeck[i] =  rank[i % 13] + " of " + suit[i / 13];
}
return sortedDeck;
}

public static String[] shuffleDeck(String [] deck){//method to shuffle deck
String[] shuffled = new String[52];
for (int i =0; i < deck.length;i++){
	shuffled[i] = deck[i];
}
String temp;
for(int i = 0; i<100;i++) {
	int random1 = (int)(Math.random() * 52);
	int random2 = (int)(Math.random() * 52);
	temp = shuffled[random1];
	shuffled[random1] = shuffled[random2];
}
return shuffled;
}
public static void declareWinner(int humanCardValue, int computerCardValue) {//method to declare winner
	if (humanCardValue < computerCardValue) {
		System.out.println("Computer had a higher card");
	}
	else {
		System.out.println("You had a higher card");
	}

}

public static int findCardValue(String[] sortedDeck, String[] sDeck,int cardLoc) {//method to determine cards value
	int cardValue = 0;
	for (int i = 0; i < sDeck.length; i++) {
		if (sortedDeck[i].equals(sDeck[cardLoc]))
			cardValue = i;
	}
	return cardValue;
}
}
