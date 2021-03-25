/*
 * @author Isaac Altice
 * @version 10/29/18
 * @description:A program that will ask the user for two integers then calculate the greatest
 * common divisor using a method. then it will display the greatest common divisor back to the user.
 * 
 * @answer questions: none
 */
import java.util.Scanner;
public class preLab7ModularizingCode {
	//main method
	public static void main(String[] args) {
		System.out.println("ID003");
		//create scanner
		Scanner input = new Scanner (System.in);
		
		//prompt use to enter 2 integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter Second integer: ");
		int n2 = input.nextInt();
		System.out.println("The greatest common divisor for " + n1 + 
				" and " + n2 + " is " + gcd(n1, n2));
	}
	//return gcd of 2 integers
	public static int gcd(int n1, int n2) {
		int gcd = 1;//initialize gcd
		int k = 2; //possible gcd
		
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k ==0)
				gcd = k; //update gcd
			k++;
		}
		return gcd; //return gcd
	}
}
