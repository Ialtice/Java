import java.io.*;
import java.util.*;

/**
 * This is a driver class used to
 * test the methods of the Student class
 * in learning about equals( ) amd compareTo( )
 * 
 * @author Isaac Altice
 * @version 02/25/019
 */
public class Driver
{
    
    public static void main(String[ ] args)throws IOException
    {
        Student s1; //reference variable will hold the address of a Student object
        Student s2; //reference variable will hold the address of a Student object
        Student s3; //reference variable will hold the address of a Student object
        //write the code to create the three Student objects using the constructor that accepts all the values
        s1 = new Student("isaac","altice",1, 3, 4);
        s2 = new Student("john", "fisher", 5,6,7);
        s3 = new Student("isaac", "altice", 1, 3, 4);
        
        
        
        //write the code to determine if s1 and s3 should be considered equal. Be sure to test
        //scenarios where they are equal and where they are not equal. Also, print results
        if (s1.equals(s3))
        {
            System.out.println("Student 1 has the same ID as Student 3");
        }
        else
        {
            System.out.println("Student 1 ID is not equal to Student 2 ID");
        }
    
        
       //Write the code to determine the "greatest" Student object using the compareTo( ) method
       if (s1.compareTo(s2) > 0 && s1.compareTo(s3) > 0)
            System.out.println("Student one is the greatest object");
       else if (s2.compareTo(s1) > 0 && s2.compareTo(s3) > 0)
            System.out.println("Student two is the greatest object");
       else
            System.out.println("Student three is the greatest object");
       //Write the code to determine the "least" Student object using the compareTo( ) method
       if (s1.compareTo(s2) < 0 && s1.compareTo(s3) < 0)
            System.out.println("Student one is the least object");
       else if (s2.compareTo(s1) < 0 && s2.compareTo(s3) < 0)
            System.out.println("Student two is the least object");
       else
            System.out.println("Student three is the least object");
        
        

  }//end of main( )
}