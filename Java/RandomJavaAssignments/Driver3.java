import java.io.*;
import java.util.*;
/**
 * Description: a program to take a file and count how many letter e's it contians, vowels,
 * characters,characters preceded by spaces, and the contents of the file in uppercase.
 *
 * @author Isaac Altice
 * @version 02/13/2019
 */
public class Driver3
{
    public static void main (String[] args)throws IOException{
       String sentences = "";
       String upperSentences = "";
       String temp;
       Scanner input;
       int count =0;
       int countSpace = 0;
       int countVowels = 0;
       input = new Scanner(new File("C:\\Users\\isaac\\blueJayFiles\\Lab5\\newTextFile.txt"));
       while(input.hasNext( ))
       {
           temp = input.nextLine();
           sentences = sentences + temp + "\n";
           temp = temp.toUpperCase();
           for(int i =0; i< temp.length();i++){
                if(temp.charAt(i) == ' ')
                    countSpace++;
            }
           upperSentences = upperSentences.concat(temp);
           
       }   
       input.close( );
       for (int i = 0; i < upperSentences.length();i++){
            if(upperSentences.charAt(i) == 'A' || upperSentences.charAt(i) == 'E' 
            || upperSentences.charAt(i) == 'I' || upperSentences.charAt(i) == 'O' ||
            upperSentences.charAt(i) == 'U' || upperSentences.charAt(i) == 'Y')
                countVowels++;
        }
       for (int i = 0; i < sentences.length();i++){
           if(sentences.charAt(i) == 'e' || sentences.charAt(i) == 'E')
                count++;
       }
       
       System.out.println("The letter e or E appears " + count + " times");
       System.out.println("Number of vowels: " + countVowels);
       System.out.println("Number of characters: " + (upperSentences.length()));
       System.out.println("Number of times a non-space character is preceded by a space character: " + countSpace);
       System.out.println("Contents of file in uppercase: ");
       System.out.println(sentences.toUpperCase());
       
       
      }
}

