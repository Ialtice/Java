import java.util.*;
/**
 * Driver for the game of straight shooter
 *
 * @author Isaac Alticce
 * @version 04/03/2019
 */
public class Driver
{
    public static void main(String[] args)
    {
        Scanner input;
        Game game = new Game();
        int playAgain =1;
        
        int humanWins=0;
        int computerWins=0;
        int winner;
        
        while(playAgain == 1)
        {
            input = new Scanner(System.in);
            game.findWinner();
            if(game.getWinner().equals("Human"))
                humanWins++;
            else
                computerWins++;
            System.out.println("Human wins: " + humanWins);
            System.out.println("Computer wins: " + computerWins);
            System.out.println("Would you like to play again? (1 for yes , 0 for no) : ");
            playAgain = input.nextInt();
        }
        
        
        
        
    }
}