
/**
 * A program that creates a deck of cards shufffles them and then displays the deck. 
 * Each card has a value, suit, face
 *
 * @author Isaac Altice
 * @version 5/2/2019
 */
public class Driver
{
   public static void main(String args[])
   {
       Deck deck = new Deck();//declare,create, and initialize deck array 
       Card[] player1Cards = new Card[26];//declaring two arrays of card length 26
       Card[] player2Cards = new Card[26];
       Deck player1;//declaring 2 decks
       Deck player2;
       int player1Points;//int variables to hold player scores
       int player2Points;
       int tempPoints;//int varaible to hold points for multpile wars
       int cardCount = 0;//int varaible for how many cards have been played
       int higherCard = 0; //int variable to hold value when comparing cards
       
       System.out.println("\nOriginal Deck");//display the original in order deck
       for(int i=0;i<52;i++)//loop for navigating deck array
            System.out.println(deck.getCard(i).toString());//using toString to display each cards fields
       System.out.println("\nShuffled Deck");
       deck.shuffle();//shuffle deck array
       for(int i=0;i<52;i++)//loop navigate deck
            System.out.println(deck.getCard(i).toString());//using toString to display each cards fields
       
       for(int i = 0;i<26;i++)//for loop to set values for player card arrays from the top card of the shuffled deck
       {
            player1Cards[i] = new Card(deck.getTopCard());
            player2Cards[i] = new Card(deck.getTopCard());                 
       }
       player1 = new Deck(player1Cards);//initializing decks using card arrays
       player2 = new Deck(player2Cards);
       player1Points = 26;//initialize player points to 26, half a deck of cards
       player2Points = 26;
       System.out.println("\nLets Play War");
       while(cardCount < 26)//while loop for playing 26 cards
       {
           System.out.println("\nPlayer 1 Card : " + player1.getTopCard().toString());//print each the top card of each players deck
           System.out.println("Player 2 Card : " + player2.getTopCard().toString());
           higherCard = player1.getCard(cardCount).compareTo(player2.getCard(cardCount));//compare the two cards values and set higherCard two the right value
           if(higherCard == 0)//if block for card values that are equal
           {
               tempPoints = 0;
               while(higherCard == 0)//while loop for doing multiple wars
               {
                    System.out.println("\nWAR");
                    player1.getTopCard();//go through the top 3 cards of player 1
                    player1.getTopCard();
                    player1.getTopCard();
                    System.out.println("\nPlayer 1 Card : " + player1.getTopCard().toString());//desplay the fourth
                    player2.getTopCard();//go through the top 3 cards of player 2
                    player2.getTopCard();
                    player2.getTopCard();
                    System.out.println("Player 2 Card : " + player2.getTopCard().toString());//display the fourth
                    tempPoints = tempPoints + 4;//tempPoints holds 4 points for every game of war
                    cardCount = cardCount + 4;// moves up four cards for every game of war
                    higherCard = player1.getCard(cardCount).compareTo(player2.getCard(cardCount));//compare the fourth card of each player
               }
               if(higherCard == 1)//if the first card is higher add the card to player 1 subtract from player 2 and display player one got points
               {
                   player1Points = player1Points + tempPoints;
                   player2Points = player2Points - tempPoints;
                   System.out.println("\nPlayer 1 got " + tempPoints + " cards");
               }
               else//if the second card is higher add the card to player 2 subtract from player 1 and display player one got points
               {
                   player2Points = player2Points + tempPoints;
                   player1Points = player1Points - tempPoints;
                   System.out.println("\nPlayer 2 got " + tempPoints + " cards");
               }
               cardCount++;//move up to the next card 
           }
           else//if cards are not equal
           {
               if(higherCard == 1)//if first card is higher than second
               {
                   player1Points++;//add or subtract points from the correct player
                   player2Points--;
                   cardCount++;//move to the next card
                   System.out.println("\nPlayer 1 got a card");//display which player got the points
                }
                else if(higherCard == -1)//if second card is higher than first
                {
                    player2Points++;//add or subtract points from the correct player
                    player1Points--;
                    cardCount++;//move to the next card
                    System.out.println("\nPlayer 2 got a card");//display which player got the points
                }
           }
           
       }
       System.out.println("\nPlayer one score: " + player1Points + "\nPlayer two score: " + player2Points);//show final scores
       if(player1Points>player2Points)//determine which player won and display the result
            System.out.println("\nPlayer one wins");
       else if(player1Points == player2Points)
            System.out.println("\nIts a tie");
       else
            System.out.println("\nPlayer two wins");
   }
}