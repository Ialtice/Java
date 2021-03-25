/*
 * @author Isaac Altice
 * @version 11/5/18
 * @description: A program that will ask you for a number of numbers you wish to enter. then allow you to enter the numbers.It will then calculate the 
 * average of the data entered and the number of numbers above the average. It will then display back the average and number of numbers above average 
 * to the user
 * Answered questions : none
 */
import java.util.Scanner;
public class PreLab8AnalyzingNumbers {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("ID001");
		System.out.println(" Enter the number of items: ");
		int n = input.nextInt();
		double [] numbers = new double [n];//initialize the array
		double sum = 0;
		
		System.out.print("Enter the numbers: ");// get numbers from user and add them into the array
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum+= numbers[i];
		}
		double average = sum / n; //calculate average
		
		int count = 0; //number of elements above average
		for (int i = 0; i < n; i++)
			if (numbers[i] > average)
				count++;
		System.out.println("Average is " + average );//display results to user
		System.out.println("Number of elements above the average is " + count);

	}

}
