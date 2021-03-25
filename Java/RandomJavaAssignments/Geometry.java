
/**
 * A program that contains methods to calculate various shapes areas and display the result
 *
 * @author Isaac Altice
 * @version 03/13/2019
 */
public class Geometry
{
    // instance variables - replace the example below with your own
    static private double PI = 3.14159;
    

    static public double circleArea(double inRadius)
    {
        
        double area;
        if(inRadius >= 0)
        {
            area = PI * Math.pow(inRadius,2);
        }
        else
        {
            System.out.println("Error values cannot be negative");
            area = 0;
        }
        return area;
    }
    static public double rectangleArea(double inLength, double inWidth)
    {
        double area;
        if (inLength >= 0 && inWidth >= 0)
        {
            area = inLength * inWidth;
        }
        else
        {
            System.out.println("Error values cannot be negative");
            area = 0;
        }
        return area;
    }
    static public double triangleArea(double inBase, double inHeight)
    {
        double area;
        if (inBase >= 0 && inHeight >= 0)
        {
            area = 0.5 * inHeight * inBase;
        }
        else
        {
            System.out.println("Error values cannot be negative");
            area = 0;
        }
        return area;
    }
    

}
