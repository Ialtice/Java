/*
 * @author Isaac Altice
 * version @ 11/5/2018
 * description: a program that will ask a user for the number of sides and a side length of a polygon. then calculate and display the area of that polygon
 *  Psuedocode: 
 *  prompt user for number of sides
 *  get input from user and set to variable
 *  prompt user for side length
 *  get input from user and set to variable
 *  calculate area of polygon
 *  display area to user formated to precision of 2 decimal places
 */
import java.util.Scanner;//import scanner
public class postLab7 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);//declare and initialize scanner;
		System.out.println("ID001");
		System.out.println("Enter the number of sides: ");//ask user for number of sides
		int sides = input.nextInt();//declare and set value to variable for sides
		System.out.println("Enter the side length: ");//ask user for side length
		double sideLength = input.nextDouble();//declare and set value to variable for sides length
		double area = area(sides, sideLength);//call method
		System.out.printf("The area of the polygon is : %.2f",area);// display area formated to 2 decimal places
		
	}
	public static double area(int n, double side) {//method to calculate area
		double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)); //calculate area
		return area;// return value of area
	}

}
