/*
 * @author: Isaac Altice
 * @version: 10/7/18
 * 
 * Description: A program that will ask user for 2points and then calculate the distance between them and display the result to 
 * the user.
 * 
 * Pseudocode: 
 * Ask user to enter two points
 * assign first x value to variable
 * assign first y value to variable
 * assign second x value to variable
 * assign second y value to variable
 * calculate the distance between points
 * display to user result
 */

import java.util.Scanner;

public class Distance {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ID001");
		System.out.println("Please enter 2 points : ");//prompt user to enter 2 points
		
		double x1 = input.nextDouble();//assign inputs to variables
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));//calculate distance
		distance = Math.round(distance * 10) / 10.0;//round distance
		System.out.println("The distance is: " + distance);//display answer to user
		}

}
