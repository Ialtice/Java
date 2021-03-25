import java.util.*;
import java.io.*;
/**
 * A program to take data from a text file and create a student object from it and then display them.
 *
 * @author Isaac Altice
 * @version 03/13/2019
 */
public class StudentDriver
{
    public static void main (String[] args) throws IOException
    {
        Scanner input;
        input = new Scanner(new File("C:\\Users\\isaac\\blueJayFiles\\Lab7\\studentData.txt"));
        String inputSentence;
        StringTokenizer stok;
        stok = null;
        while(input.hasNext())
        {
            inputSentence = input.nextLine();
            stok = new StringTokenizer(inputSentence,",");
            while(stok.hasMoreTokens())
            {
                String lastName =stok.nextToken();
                String firstName= stok.nextToken();
                String ID = stok.nextToken();
                String strCredits = stok.nextToken();
                int credits = Integer.parseInt(strCredits);
                String strGPA = stok.nextToken();
                double GPA = Double.parseDouble(strGPA);
                Student student = new Student(lastName,firstName,ID,GPA,credits);
                System.out.println(student.toString());
            }
        }
    }
    
}
