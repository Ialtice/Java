import java.util.*;
/**
 * The example using a loop and calling the
 * no-args constructor created student objects
 * with meaninless values for their fields
 * 
 * @author Isaac Altice
 * @version v1
 */
public class DriverUserTypesInput
{
   public static void main(String[ ] args)
   {
       Book [] library; //declare a reference variable
       library = new Book[5]; //create an array
       //local varibae to hold data as it is read in
       String title;
       String authorName;
       int price;
       
       Scanner input;
       
       input = new Scanner(System.in);
       for(int k = 0; k < library.length; k++)
       {
           System.out.print("Enter title name for book " + (k+1) + ": ");
           title = input.nextLine( );
           System.out.print("Enter name of author " + (k+1) + ": ");
           authorName = input.nextLine( );
           System.out.print("Enter price for book " + (k+1) + ": ");
           price = input.nextInt( );
           
           //finally, create a Student object and assign its
           //address to a slot in the array
           library[k] = new Book(title, authorName, price);
        }
           
       for(int k = 0; k < library.length; k++)
       {
           System.out.println(library[k]);
        }

      int minPos;//used to hold the poistion of the next smallest value in the array
      Book minValue;
      int start;
      int seek;
      Book tempHolding;
      
      
        for(start = 0; start < library.length - 1; start++)
       {
           minPos = start;//start increase by one at each iteration
           minValue = library[start];//to start loop, assume the starting position holds least value
           //loop through remainder of array after starting position
           //to find the true smallest value
           for(seek = start; seek < library.length; seek++)
           {
               if(library[seek].compareTo(minValue ) < 0)
               {
                   minValue = library[seek];//holds the next smallest value
                   minPos = seek;//holds the index number of this smalles value
                }
            }
            //now swap the smallest value with the value in the starting position
            tempHolding = minValue;
            library[minPos] = library[start];
            library[start] = minValue;
        }
        //the array was sorted now print the sorted contents
       System.out.println("\nHere is the array after sorting: ");
       for(int k = 0; k < library.length; k++)
       {
         System.out.print(library[k] + " ");
       }
   }
       
}
