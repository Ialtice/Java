import java.util.*;//allows for use of scanner
/**
 * Driver for Unit price converter that allows a user to end a new price and weight for a item and then calculate and display the item cost per ounce and per pound until they choose to quit.
 *
 * @author Isaac Altice
 * @version 2/17/19
 */
public class UnitPriceConverterDriver
{
    public static void main(String[] args){//main method for driver
        UnitPriceConverter item;//create new object item
        item = new UnitPriceConverter();//initialize all values to 0
        Scanner input;// declare new scanner input
        int choice = 1;// declare and initilize variables for user to continue entering new data, price of an item, weight in pounds
        double price = 0;
        double weight = 0;
        
        while(choice == 1){//loop that continues if user wants to enter in new values for price or weight
            input = new Scanner(System.in); //initialize input scanner
            System.out.println("Enter a new price: ");//ask user for price
            price = input.nextDouble();//take input from user and assign to variable price
            item.setPriceOfItem(price);//change item object value for price
            System.out.println(item.toString());// display changes to object
            System.out.println("Enter a new weight in pounds: ");//ask user to enter in weight
            weight = input.nextDouble();//take input from user and assign to variable weight
            item.setWeightInPounds(weight);//change item object value for weight
            System.out.println(item.toString());//display changes to object
            System.out.println("Would you like to reset the price and/or the weight in pounds?(Enter 1 for yes, 0 for no): ");//ask user would he like to make more changes
            choice = input.nextInt();//get user choice
        }
        System.out.println(item.toString());//display final values for object
        System.out.println("Goodbye");//goodbye message
    }
}
