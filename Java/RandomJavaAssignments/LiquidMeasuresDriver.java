import java.util.*;
/**
 * The driver for a program that asks the user to enter in quarts, ounces, liters, or gallons and then calculates that entered value into the others and displays the values for all of them.
 * this then repeats until the user decides to quit.
 *
 * @author Isaac Altice
 * @version 02/20/2019
 */
public class LiquidMeasuresDriver
{
    public static void main (String[] args)// main method to allow user interaction with LiquidMeasures Program
    {
        Scanner input;// declare scanner
        LiquidMeasures quartsConverter;// create instance of object 
        quartsConverter = new LiquidMeasures();// initailize values for object quartsConverter
        //local variables for loop continuation , menu choice, and new measurement
        int loop = 1;
        int measureChangeChoice;
        double newMeasure = 0;
        
        while(loop ==1)//loop to contine asking user for a new measurement to do conversions upon
        {
            input = new Scanner(System.in);//initialize scanner
            System.out.println("The four measures you can change are : Quarts(1), Ounces(2), Liters(3),Gallons(4)");//show menu to user
            System.out.println("Please enter the number that represents the measure you want to change (Example: 1 for Quarts): ");// ask menu choice from user
            measureChangeChoice = input.nextInt();// get menu choice
            switch(measureChangeChoice)//switch statement to ask for the correct variable and change the correct object field depending on user menu choice
            {
                case 1: 
                    System.out.println("Enter the number of Quarts: ");// ask for correct new object field value, get input ,change object field by calculating all new values, 
                    //repeated for each case
                    newMeasure = input.nextDouble();
                    quartsConverter.setQuarts(newMeasure);
                break;
                case 2:
                    System.out.println("Enter the number of Ounces: ");
                    newMeasure = input.nextDouble();
                    quartsConverter.setOunces(newMeasure);
                break;
                case 3:
                    System.out.println("Enter the number of Liters: ");
                    newMeasure = input.nextDouble();
                    quartsConverter.setLiters(newMeasure);
                break;
                case 4:
                    System.out.println("Enter the number of Gallons: ");
                    newMeasure = input.nextDouble();
                    quartsConverter.setGallons(newMeasure);
                break;
                default: 
                    System.out.println("Invalid measure choice");
                
            }
            
            System.out.println(quartsConverter.toString());//display all of object quartsConverter field values to user
            System.out.println("Would you like to reset another measurement?\nEnter 1 for yes, 0 for no: ");// ask user if they wish to loop throught the program again
            loop = input.nextInt();// update loop decision from user input
        }
        System.out.println("Goodbye");//display goodbye message
    }
}
