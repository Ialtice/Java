/*
 * @author Isaac Altice
 * @version 11/5/18
 * @description:
 * a program that will generate a deck of cards and then give each card a random index. it will then display the first 4 cards in the deck
 * @answered question: none.
 */
public class preLab8DeckOfCards {
public static void main(String[] args) {
	System.out.println("ID002");
	int[] deck = new int[52];//declare and initialize the array
	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	String[] ranks = { "Ace" , "2", "3", "4", "5", "6","7","8","9", "10", "Jack", "Queen", "King"};
	
	//initialize the cards
	for (int i = 0; i < deck.length; i++)
		deck[i] = i;
	
	//shuffle cards
	for (int i = 0; i < deck.length; i++) {
		//generate index randomly
		int index = (int)(Math.random() * deck.length);
		int temp = deck [i];
		deck[i] = deck[index];
		deck[index] = temp;
		
	}
	
	//display the first four cards
	for (int i = 0; i < 4; i++) {
		String suit = suits[deck[i] / 13];
		String rank = ranks[deck[i] % 13];
		System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		
		
	}
}
}
