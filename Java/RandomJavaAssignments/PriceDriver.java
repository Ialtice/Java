import java.util.Scanner;
/**
 * driver and main methods for unit price calculator
 *
 * @author Isaac altice
 * @version 1/30/2019
 */
public class PriceDriver
{
   public static void main(String[] args){
       Item product;
       Scanner in = new Scanner(System.in);
       double w;
       double p;
       int q; 
       int loop = 1;
       int choice;
       String n;
       product = new Item();
       
       while(loop == 1){
           in.nextLine();
           System.out.println("Enter product name: ");
           n = in.nextLine();
           System.out.print("If you want to enter weight in pounds enter 1" + 
           "\nIf ounces enter 2: ");
           choice = in.nextInt();
           System.out.println("Enter weight: ");
           w = in.nextDouble();
           System.out.println("Enter price: ");
           p = in.nextDouble();
           System.out.println("Enter quantity: ");
           q = in.nextInt();
           
           product = new Item(q,p,w,n);
           System.out.println("Item: \n" + product.toString());
           System.out.println("Enter another item? (1 for yes, 0 for no): ");
           loop = in.nextInt();
    }
       System.out.println("Goodbye");
    }
}
