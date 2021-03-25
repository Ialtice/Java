
/**
 * Write a description of class question1 here.
 *
 * @author Isaac Altice
 * @version 01/16/2019
 */
import java.util.Scanner;
public class question1
{
    public static void main(String[] args){
        double charge = 0;
        double mileage;
        double cost;
        int carType;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the car type: \n1.Sub-Compact \n2.Sedan \n3.Suv \n4.Van");
        carType = input.nextInt();
        switch(carType)
        {
            case 1 : charge = 0.25;
            break;
            case 2: charge = 0.50;
            break;
            case 3: charge = 0.75;
            break;
            case 4: charge = 1.00;
            break;
        }
        System.out.println("Enter the number of miles driven : ");
        mileage = input.nextInt();
        if(mileage <= 100)
        {
            cost = mileage * charge;
        }
        else
        {
            cost = 100 * charge + (mileage - 100) * (charge + 0.10);
        }
        
        System.out.println("Total Price Owed : $" + cost);

    }
}
