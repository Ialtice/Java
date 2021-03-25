
/**
 * A program that creates a deck of cards shufffles them and then displays the deck. 
 * Each card has a value, suit, face
 *
 * @author Isaac Altice
 * @version 4/22/2019
 */
public class Driver
{
   public static void main(String args[])
   {
       Deck deck = new Deck();//declare,create, and initialize deck array 
       System.out.println("\nOriginal Deck");//display the original in order deck
       for(int i=0;i<52;i++)//loop for navigating deck array
            System.out.println(deck.getCard(i).toString());//using toString to display each cards fields
       System.out.println("\nShuffled Deck");
       deck.shuffle();//shuffle deck array
       for(int i=0;i<52;i++)//loop navigate deck
            System.out.println(deck.getCard(i).toString());//using toString to display each cards fields
       System.out.println("\nGet top  two cards: \n"+ deck.getTopCard().toString() + "\n" 
            + deck.getTopCard().toString());//display top two cards in the shuffled deck
       
       
       
   }
}
