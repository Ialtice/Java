/*
 * @author Isaac Altice
 * @version 10/29/18
 * @Description: 
 * A program that uses a method to increment a variables value. it will display the variables
 * value before and after the increment.
 * 
 * @Answer Questions:
 * Scope in important in methods because you can only access variables where they are declared
 * unless they are declared in the top of a class.This relates to pass-by-value because when you 
 * are passing a argument that is a variable to a method the changes done to the value passed to
 * the method are not done to the variable outside the method.
 */
public class preLab7Increment {
	public static void main (String[] args) {
		System.out.println("ID001");
		int x = 1;
		System.out.println("Before the call, x is " + x);//display value of x before increment
		increment(x);// calls method to increment value of x
		System.out.println("After the call, x is " + x);//displays value of x after increment
	}
	
	public static void increment(int n) {// sets up method
		n++;//increment
		System.out.println("n inside the method is " + n);
		
	}

}
