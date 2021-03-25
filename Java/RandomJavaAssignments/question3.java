
/**
 *
 * @author Isaac Altice
 * @version 01/16/2019
 */
import java.util.*;

public class question3
{
   public static void main(String [] args){
       Scanner input = new Scanner(System.in);
       String choice = "";
       String choiceWord = "";
       int num;
       String compChoice = "";
       String compChoiceWord = "";
       int countComp = 0;
       int count = 0;
       System.out.println("Paper, Rock, Scissor Game");
       for(int i = 0;i <5; i++){
           System.out.println("Enter your choice (P,R, or S");
           choice = input.next();
           switch(choice){
               case "P" : choiceWord = "Paper";
               break;
               case "R" : choiceWord = "Rock";
               break;
               case "S" : choiceWord = "Scissor";
               break;
           }
           Random rng = new Random();
           num = rng.nextInt(3);
           switch(num){
               case 0 : compChoice = "P";
                        compChoiceWord = "Paper";
               break;
               case 1 : compChoice = "R";
                        compChoiceWord = "Rock";
               break;
               case 2 : compChoice = "S";
                        compChoiceWord = "Scissors";
               break;
            }
           if (choice.equals(compChoice)){
               System.out.println("The computer chose " + choiceWord + ", you chose " + choiceWord +" it is a tie.");  
           }
           else if(choice.equals("P")){
                if (compChoice.equals("S")){
                    System.out.println("The computer chose " + compChoiceWord + ", you chose " + choiceWord +" computer wins");  
                    countComp++;
                }
                else{
                    System.out.println("The computer chose " + compChoiceWord + ", you chose " + choiceWord +" human wins");
                    count++;
                }
                
           }
           else if(choice.equals("R")){
                if (compChoice.equals("P")){
                    System.out.println("The computer chose " + compChoiceWord + ", you chose " + choiceWord +" computer wins");  
                    countComp++;
                }
                else{
                    System.out.println("The computer chose " + compChoiceWord + ", you chose " + choiceWord +" human wins");
                    count++;
                }
           }
           else{
               if (compChoice.equals("R")){
                    System.out.println("The computer chose " + compChoiceWord + ", you chose " + choiceWord +" computer wins");  
                    countComp++;
                }
                else{
                    System.out.println("The computer chose " + compChoiceWord + ", you chose " + choiceWord +" human wins");
                    count++;
                }
           }
        }
        System.out.println("Human won " + count + " games.");
        System.out.println("Computer won " + countComp + " games.");
    }
}