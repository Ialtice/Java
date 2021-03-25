
/**
 * A program for the game striaght shooter
 *
 * @author Isaac Altice
 * @version 04/03/2019
 */
public class Game
{
    private Die[] humanDie = new Die[6];
    private Die[] computerDie = new Die[6];
    private int humanScore;
    private int computerScore;
    private String winner;
    public Game()
    {
        humanScore = computerScore = 0;
        winner = null;
        for(int i = 0;i<6;i++)
        {
            humanDie[i] = new Die();
            computerDie[i] = new Die();
            
        }
    }

    public int calculate(Die[] d)
    {
        int[] array = new int[7];
        int threeOne = 0;
        int score=0;
        for(int i =0; i<humanDie.length;i++)
        {
            array[i] = humanDie[i].getFace();
            if (d[i].getFace() ==1)
                threeOne++;
        }
        if(threeOne > 2)
            return -1;
        else
        {
        int current = 0;
        
        while(array[current] ==1 && current <6)
        {
            score +=5;
            if (current == 5)
                score += 5;
            current ++;
        }
    }
        return score;
    }
   
    public void humanRoll()
    {
        System.out.print("Human roll: ");
        for(int i = 0;i<humanDie.length;i++)
        {
            humanDie[i] = new Die();
            System.out.print(humanDie[i].getFace() + " ");
        }
        System.out.print("\n");
        
    }
    
    public void computerRoll()
    {
        for(int i = 0;i<humanDie.length;i++)
        {
            computerDie[i] = new Die();
            System.out.print(computerDie[i].getFace() + " ");
        }
        System.out.print("\n");
    }
    public void findWinner()
    {
        while(humanScore <100 && computerScore < 100)
        {
            humanRoll();
            humanScore += calculate(humanDie);
            System.out.println("Human Score: " + humanScore);
            computerRoll();
            computerScore += calculate(computerDie);
            System.out.println("Computer Score: " + computerScore);
        }
        if(computerScore < humanScore)
            winner = "Human";
        else
            winner = "computer";
    }
    public String getWinner()
    {
        return winner;
    }
    
}
