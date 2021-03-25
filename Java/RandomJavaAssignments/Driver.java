import java.util.*;
import java.io.*;
/**
 * code to read and display text from a text file.
 *
 * @author Isaac Altice
 * @version 02/13/2019
 */
public class Driver
{
    public static void main(String[]args) throws IOException{
       Scanner input;
       input = new Scanner(new File("C:\\Users\\isaac\\blueJayFiles\\textFile.txt"));
       while(input.hasNext( ))
       {
           System.out.println(input.nextLine( ));
       }   
       input.close( );
      }
}

