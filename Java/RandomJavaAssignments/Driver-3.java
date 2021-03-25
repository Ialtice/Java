import java.util.*;
import java.io.*;
/**
 * Write a description of class Driver here.
 *
 * @author (Isaac Altice)
 * @version (04/10/2019)
 */
public class Driver
{
    public static void main(String[] args)throws IOException
    {
        Car[] rentalCar;// declare car object array
        rentalCar = new Car[6];// creates car object array length 6
        File carFile = new File("C:\\Users\\ialtice\\Downloads\\cars.txt");// declares and creates new file for cars text file
        Scanner in;// declare scanner in
        String inCar;// string to hold line of text for a car object
        StringTokenizer stok;// declaring variable  for StringTokenizer
        stok = null;
        int count = 0;//count variable for number of cars equal to another car
        boolean value;// variable to hold whether a car is equal to another
        int cheaperCar = 0;// variable to hold a integer to detwermine if two cars are equal to, greater than, or less than in rental price
        
        in = new Scanner(carFile);// creates new scanner to read car file
        for(int i = 0;i < rentalCar.length; i++)//loop to navigate Car array
        {
            inCar = in.nextLine();// gets the string for first car object
            stok = new StringTokenizer(inCar,"?");//splits into tokens
            while(stok.hasMoreTokens())// loop to create each car objects
            {
                rentalCar[i] = new Car(stok.nextToken(),stok.nextToken(),Integer.parseInt(stok.nextToken()),Double.parseDouble(stok.nextToken()),Integer.parseInt(stok.nextToken()));
            }
        }
        for(int i = 0; i < rentalCar.length; i++)// loop to display all objects
        {
            System.out.println(rentalCar[i].toString() + "\n");
        }
        for(int i = 0; i < rentalCar.length; i++)//loop to count number of cars equal to first car
        {
            value = rentalCar[0].equals(rentalCar[i]);
            if(value == true)
                count++;
        }
        System.out.println("equals method");
        System.out.println("There are " + count + " cars in the array equal to " + rentalCar[0].getCarModel() + " " + rentalCar[0]. getCarCategory() + "\n");// display equal car ount to user
        System.out.println("compareTo method");
        cheaperCar = rentalCar[0].compareTo(rentalCar[rentalCar.length -1]);//determine which care is cheaper using compare to
        if(cheaperCar < 0)//display car comparison to user
        {
            System.out.println("The first car object is cheaper than the " + rentalCar.length + " car object.");
        }
        else if(cheaperCar > 0)
        {
            System.out.println("The first car object is more expensive than the " + rentalCar.length + " car object.");
        }
        else
        {
            System.out.println("The first car object is the same price as the " + rentalCar.length + " car object.");
        }
        
    }
}
