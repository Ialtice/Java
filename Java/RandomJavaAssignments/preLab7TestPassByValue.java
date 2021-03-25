/*
 * @author Isaac Altice
 * @version 10/29/18
 * @description:
 * A program that will swap the value of two variables using a method. it will display the values
 * before and after the swap.
 * @answer questions:Scope in important in methods because you can only access variables where they are declared
 * unless they are declared in the top of a class.This relates to pass-by-value because when you 
 * are passing a argument that is a variable to a method the changes done to the value passed to
 * the method are not done to the variable outside the method.
 */
public class preLab7TestPassByValue {
	//main method
	public static void main(String[] args) {
		System.out.println("ID002");
		//declare and initialize variables
		int num1= 1;
		int num2 = 2;
		System.out.println("Before invoking the swap method, num1 is " +
		num1 + " and num 2 is " + num2);
		//invoke method to swap variables
		swap(num1, num2);
	}
	//method to swap variables
	public static void swap (int n1, int n2) {
		System.out.println("\tInside the swap method");
		System.out.println("\t\tBefore swapping, n1 is " + n1 
				+ " and n2 is " + n2);
		//swap n1 with n2
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("\t\tAfter swapping, n1 is " + n1
				+ " and n2 is " + n2);
	}
}
