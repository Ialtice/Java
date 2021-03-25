import java.util.*;
/**
 * Program to play a game of craps
 *
 * @author Isaac Altice
 * @version 02/27/2019
 */
public class Craps
{
    public static void main (String args [])
    {
        Die die1 = new Die();
        Die die2 = new Die();
        Scanner input;
        int choice = 1;
        int sum;
        int winningSum;
        while (choice == 1)
        {
            die1.roll();
            die2.roll();
            System.out.println("Die 1 roll: " + die1.getFace());
            System.out.println("Die 2 roll: " + die2.getFace());
            sum = die1.getFace() + die2.getFace();
            System.out.println("Roll Sum: " + sum);
            if (sum == 7 || sum ==11)
            {
                System.out.println("You Won!");
            }
            else if (sum == 2 || sum == 3 || sum == 12)
            {
                System.out.println("You Lost.");
            }
            else
            {
                winningSum = sum;
                System.out.println("Roll needed to win: " + winningSum);
                do
                {
                    die1.roll();
                    die2.roll();
                    System.out.println("Die 1 roll: " + die1.getFace());
                    System.out.println("Die 2 roll: " + die2.getFace());
                    sum = die1.getFace() + die2.getFace();
                    System.out.println("Roll Sum: " + sum);
                    if (sum == 7)
                    {
                        System.out.println("You lost");
                        
                    }
                    else if (sum == winningSum)
                    {
                        System.out.println("You Won!");
                        
                    }
                    else 
                    {
                        System.out.println("Roll again");
                    }
                }while (sum != 7 && sum != winningSum);
                
            }
            
            input = new Scanner (System.in);
            System.out.println("Would you like to play again?(1 for yes, 0 for no): ");
            choice = input.nextInt();
        }
    }
    
}
