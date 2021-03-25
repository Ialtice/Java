import java.util.*;
/**
 * A program to display a menu to a user to ask what shape they want to calculate area for and then
 * as them for needed measurements and display the calculated area.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GeometryDriver
{
    
    public static void main(String[] args)
    {
        Scanner input;
        int choice = 0;
        Geometry shape;
        double area = 0;
        while (choice !=4)
        {
            input = new Scanner(System.in);
            shape = new Geometry();
            menu();
            System.out.println("Enter a menu choice : ");
            choice = input.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter the radius of the circle: ");
                area = shape.circleArea(input.nextDouble()); 
                System.out.println("The area of the shape is : " + area);
                break;
                case 2:
                System.out.println("Enter the length of the rectangle followed by the width : ");
                area = shape.rectangleArea(input.nextDouble(), input.nextDouble());
                System.out.println("The area of the shape is : " + area);
                break;
                case 3:
                System.out.println("Enter the base of the triangle followed by the height : ");
                area = shape.triangleArea(input.nextDouble(), input.nextDouble());
                System.out.println("The area of the shape is : " + area);
                break;
                case 4:
                System.out.println("Goodbye");
                break; 
                default:
                System.out.println("Invalid menu choice");
                
            }
            
        }
    }
    public static void menu()
    {
        System.out.println("1. Calculate the area of a circle:");
        System.out.println("2. Calculate the area of a rectangle:");
        System.out.println("3. Calcualte the area of a traingle:");
        System.out.println("4. Quit");
    }
}
