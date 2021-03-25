import java.util.*;
import java.io.*;
/**
 * A program that uses the StringTokenizer class to show how it can be used to break strings into smaller tokens
 * and some uses of the methods within this class such as hasMoreTokens,countTokens, and nextToken.
 *
 * @author Isaac Altice
 * @version 03/13/2019
 */
public class Activity8
{
    public static void main (String[] args) throws IOException
    {
        Scanner input;
        input = new Scanner(System.in);
        String inputSentence;
        StringTokenizer stok;
        stok = null;
        
        System.out.println("Enter a sentence: ");
        inputSentence = new String(input.nextLine());
        stok = new StringTokenizer(inputSentence);
        System.out.println("Number of tokens in the sentence: " + stok.countTokens());
        while(stok.hasMoreTokens())
        {
            System.out.println(stok.nextToken());
        }
        
        System.out.println("\nEnter a sentence: ");
        inputSentence = new String(input.nextLine());
        stok = new StringTokenizer(inputSentence,",");
        System.out.println("Number of tokens in the sentence: " + stok.countTokens());
        while(stok.hasMoreTokens())
        {
            System.out.println(stok.nextToken());
        }
        
        boolean returnDelims = true;
        System.out.println("\nEnter a sentence: ");
        inputSentence = new String(input.nextLine());
        stok = new StringTokenizer(inputSentence,",",returnDelims);
        System.out.println("Number of tokens in the sentence: " + stok.countTokens());
        while(stok.hasMoreTokens())
        {
            System.out.println(stok.nextToken());
        }
        
        System.out.println("\nEnter a sentence: ");
        inputSentence = new String(input.nextLine());
        stok = new StringTokenizer(inputSentence,", /");
        System.out.println("Number of tokens in the sentence: " + stok.countTokens());
        while(stok.hasMoreTokens())
        {
            System.out.println(stok.nextToken());
        }
        

        input = new Scanner(new File("C:\\Users\\isaac\\blueJayFiles\\activity8.txt"));
        while(input.hasNext())
        {
            inputSentence = input.nextLine();
            stok = new StringTokenizer(inputSentence,",");
            while(stok.hasMoreTokens())
            {
                System.out.println(stok.nextToken());
            }
            System.out.println(" ");
        }
        input.close();
    }
}
