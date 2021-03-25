import java.util.Scanner;
/**
 * driver for payCheck
 *
 * @author Isaac Altice
 * @version 01/30/2019
 */
public class PayDriver
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name;
        double hoursWorked;
        double payRate;
        
        
        System.out.println("Enter employee name: ");
        name = in.nextLine();
        System.out.println("Enter hours worked: ");
        hoursWorked = in.nextDouble();
        System.out.println("Enter pay rate: ");
        payRate = in.nextDouble();
        Paycheck E1;
        E1 = new Paycheck(name,payRate,hoursWorked);
        System.out.println(E1.toString());
        System.out.println("Enter in new values");
        in.nextLine();
        System.out.println("Enter employee name: ");
        name = in.nextLine();
        E1.setName(name);
        System.out.println(E1.toString());
        System.out.println("Enter hours worked: ");
        hoursWorked = in.nextDouble();
        E1.setHours(hoursWorked);
        System.out.println(E1.toString());
        System.out.println("Enter pay rate: ");
        payRate = in.nextDouble();
        E1.setHourlyRate(payRate);
        System.out.println(E1.toString());
    }
    
}
