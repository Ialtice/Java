
/**
 * A class that creates a 52 card deck in an array each card with a value,suit,and face.
 *
 * @author Isaac Altice
 * @version 5/2/2019
 */
public class Deck
{
    // instance variables 
    private Card deck[]; //the array that will hold the cards
    private int topCard; // variable to hold current top card location in the deck
    
    /**
     * Constructor for 52 Card objects of class Deck
     */
    public Deck()
    {
        deck = new Card[52];//initialize array deck to 52
        String[] suit = {"Clubs","Diamonds","Hearts","Spades"};// array of card suits
        String[] face = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};//array of card faces
        topCard = 0;// top card of deck is in array location 0
        int cardValue;// local variable to temporarily hold the cards value for Card creation
        for(int i=0;i<deck.length;i++)//loop to go throught deck array
        {
            for(int j=0;j<4;j++)//loop to go through suit array
            {
                for(int k=0;k<13;k++)//loop to go through face array
                {
                    cardValue = (i % 13) + 2;//calculate card value
                    deck[i] = new Card(cardValue,suit[j],face[k]);// create a card for every slot of array
                    i++;
                }
            }
        }
    }
    /**
     * Constructor for 26 Card objects of class Deck
     * 
     * @param  Card array containing 26 cards
     */
    public Deck(Card[] inPlayer)
    {
        deck = inPlayer;
        topCard = 0;
    }
    /**
     * getCard method - returns the card at a specified index
     *
     * @param  int index - specified index for card location 
     * @return    the card at specified index
     */
    public Card getCard(int index)
    {
        return deck[index];//return card from deck at specified index
    }
    /**
     * shuffle method - shuffles the card locations in the deck array
     *
     * @param  none
     * @return    none
     */
    public void shuffle()
    {
        for(int i = 0;i<1000;i++)//loop to shuffle two random cards 1000 times
        {
            int random1 = (int)(Math.random() * 51);//generate first random number(0-51)
            int random2 = (int)(Math.random() * 51);//generate second random number(0-51)
            Card temp = deck[random1];// temporary card to allow swaping
            deck[random1] = deck[random2];//swap cards
            deck[random2] = temp;
        }
    }
    /**
     * getTopCard method - returns a copy of the current top card in the deck and updates top
     * card location
     *
     * @param  none
     * @return    a copy of the current top card
     */
    public Card getTopCard()
    {
        int temp = topCard;//temp variable to hold current card top card
        topCard++;//increment top card 
        return new Card(deck[temp]);// return a copy of the top card 
    }
    
}
