import java.util.Scanner;
/**
 * This is an exercise in using the String and
 * StringBuilder classes
 * 
 * @author Isaac Altice 
 * @version (2/6/19)
 */
public class StringTesting
{
    public static void main(String[ ] args)
    {
        //declare a reference to a String object:
        String words;
        //declare a reference to a StringBuilder object
        StringBuilder newWords;
        
        //declare a reference to a Scanner object
        
        //declare an int to hold the unicode value of a character
        int charValue;
        int loop = 1;
        while(loop == 1){
           //create a Scanner object that will use the keyboard for input
        Scanner in = new Scanner(System.in);
        //create a String object with input from the user
        System.out.println("Enter a sentence: ");
        words = in.nextLine();
        //create a StringBuilder object from the String
        newWords = new StringBuilder(words);
        //loop through the StringBuilder object character by character.
        
        for(int i = 0; i < newWords.length();i++){
            char letter = newWords.charAt(i);
        //change each character to the next character in the unicode encoding scheme
            newWords.setCharAt(i, (char)((int) letter +1));
        }
        //print the original String and the StringBuilder contents
        System.out.println("Original: " + words);
        System.out.println("New : " + newWords.toString());
        //ask the user if they want to repeat
        //compile and run
        System.out.println("Would you like to repeat? (1 for yes, 0 for no)");
        loop = in.nextInt();
        //f(loop == 1)
        //    in.next();
        //set a breakpoint near the top of the code, not on a declaration statement
        //step though the statement and exampline the variables
    }
    }//end of main
    
}//end of class

