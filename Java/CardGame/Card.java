
/**
 * Class for a Card object that will have a value,suit,and face.
 *
 * @author Isaac Altice
 * @version 5/2/2019
 */
public class Card
{
    //instance variables of a card
    private String face;
    private String suit;
    private int value;

    /**
     * Default Constructor for objects of class Card
     */
    public Card()
    {
        value = 0;
        face = null;
        suit = null;
    }
    /**
     * overriden Constructor for objects of class Card that accepts input for a integer value,
     * string suit, and string face
     */
    public Card(int inValue,String inSuit, String inFace)
    {
        value = inValue;
        suit = inSuit;
        face = inFace;
    }
    /**
     * Copy Constructor for objects of class Card
     */
    public Card(Card other)
    {
        value = other.value;
        suit = other.suit;
        face = other.face;
    }
    /**
     * getValue method - returns the value field of a card
     *
     * @param  none
     * @return    integer value field of card
     */
    public int getValue()
    {
        return value;
    }
    /**
     * getSuit method - returns the suit field of a card
     *
     * @param  none
     * @return    String suit field of a card
     */
    public String getSuit()
    {
        return suit;
    }
    /**
     * getFace method - returns the face field of a card
     *
     * @param  none
     * @return    the String face field of a card
     */
    public String getFace()
    {
        return face;
    }
    /**
     * toString method - returns a string of all of the cards feild values and desciption
     *
     * @param  none
     * @return   String of a cards fields with desciption
     */
    public String toString()
    {
        return "\nValue: " + value + ", " + face + " of " + suit; 
    }
    /**
     * compareTo method - returns 0 if values of two cards are equal,
     * 1 if the first card value is greater than the second,
     * -1 if the first card value is less than the second 
     *
     * @param  Card other 
     * @return    an integer number
     */
    public int compareTo(Card other)
    {
        int number = 0;
        if(this.value > other.value)//if else statements to compare card values
            number = 1;
        else if(this.value < other.value)
            number = -1;
        return number;
    }
    /**
     * equals method - compares two cards and returns true or false if their suit and face are equal
     *
     * @param  Card other
     * @return    an boolean isEqual
     */
    public boolean equals(Card other)
    {
        boolean isEqual = false;
        if(this.suit.equals(other.suit) && this.face.equals(other.face))
            isEqual = true;
        return isEqual;
    }
   
}
