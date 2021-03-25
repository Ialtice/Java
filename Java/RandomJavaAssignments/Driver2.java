import java.util.*;
import java.io.*;
/**
 *code to write  7 lines of text into a text file
 *
 * @author Isaac Altice
 * @version 02/13/2019
 */
public class Driver2
{
   public static void main(String[] args) throws IOException
   {
      String filename;
      String sentence;
      Scanner keyboard;
      PrintWriter output;
      
      keyboard = new Scanner(System.in);
      
      System.out.print("Enter 7 sentences: ");

      System.out.print("Enter the location and name of the file to write to: ");
      filename = keyboard.nextLine();
    
      output = new PrintWriter(filename);
      
      for (int i = 1; i <= 7; i++)
      {
         // Get the name of a friend.
         System.out.print("Enter sentence number " + i + ": ");
         sentence = keyboard.nextLine();

         // Write the friend's name to the file.
         //Notice this is very similar to System.out.println
         output.println(sentence);
      }

      output.close();
      
      System.out.println("Data written to the file.");
   }
}
