import java.util.*;
/**
 * a program to show ways of manipulating and interacting with strings
 *
 * @author isaac altice
 * @version (2/6/2019
 */
public class Test
{
   public static void main (String[] args){
     Scanner in = new Scanner(System.in);
     String sentence;
     System.out.println("Enter a sentence: ");
     sentence = in.nextLine();
     System.out.println("Print the number of characters your sentence contains.");
     System.out.println(sentence.length());
     System.out.println("Print the first letter of your sentence");
     System.out.println(sentence.charAt(0));
     System.out.println("Print the last letter of your sentence");
     System.out.println(sentence.charAt(sentence.length() -1));
     System.out.println("Print whether your sentence contains the letter ‘e’ ");
     System.out.println(sentence.contains("e"));
     System.out.println("Print whether your sentence contains “ay” or not.");
     System.out.println(sentence.contains("ay"));
     System.out.println("Print the number of times the letter ‘e’ appears in your sentence");
     int count = 0;
     for(int i = 0;i < sentence.length();i++){
         if (sentence.charAt(i) == 'e')
            count++;
        }
     System.out.println(count);
     System.out.println("Find the position of the last occurrence of the letter ‘e’ in your sentence");
     System.out.println(sentence.lastIndexOf('e'));
     System.out.println("Find the position of the second occurrence of the letter ‘e in your sentence");
     System.out.println(sentence.indexOf('e',sentence.indexOf('e')+1));
     System.out.println("Print how many characters your sentence contains besides the space character.");
     System.out.println((sentence.replaceAll(" ","")).length());
     System.out.println("Add the words “you know” to the sentence");
     System.out.println(sentence.concat(" you know"));
     System.out.println("Print a completely upper case version of your sentence ");
     System.out.println(sentence.toUpperCase());
     System.out.println("Extract and print a substring of five characters from your sentence");
     System.out.println(sentence.substring(0,4));
     System.out.println("Print a String where all the chars ‘a’ are replaced with the char ‘x’");
     System.out.println(sentence.replace('a','x'));
     
    }
}
