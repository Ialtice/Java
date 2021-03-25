/*Program name : testOne
 * @author: Isaaac Altice
 * @date : 9/26/18
 * Lab section: 1212-008
 * Purpose: A program that will ask a students and then calculate the students tuition based on whether they are in state or out of state and if 
 * they are living in campus. It will also make sure to apply any discounts and add tax before displaying the total to the user with his name. if 
 * it is less than 16000 then it will also display "the tuition is the cheapest it cane possibly be."
 */
import java.util.Scanner;//import Scanner


public class testOne {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);//initialize scanner
		int tuition = 0;//Initialize variables
		int housing = 0;
		int total = 0;
		System.out.println("What is your name? : ");//ask user name
		String name = input.next();//assign name to variable
		System.out.println("Are you (1) in-state or (2) out-of-state student? ");// ask user resident status
		int resident= input.nextInt();//assign input to variable
		System.out.println("Are you (1) on-campus or (2) off-campus student? ");// ask user living location
		int livingLocation = input.nextInt();//assign input to variable
		System.out.println("Did you get any disocunt (Y/N?) ");// ask user for discount
		String discount = input.next();// assign input to variable
		
		
		if (resident == 1) {// determine which tuition cost the user has and assign to variable
			tuition = 12500;
		}
		else if (resident == 2) {
			tuition = 16000;
		}
		else {
			System.out.println("invalid input");
		}
		if (livingLocation == 1) {// determine users living cost and assign to variable
			housing = 7500;
		}
		else if (livingLocation == 2) {
			total = tuition;// calculate total tuition
		}
		tuition = tuition + housing;//calculate total tuition
		if (discount.equals("Y")) {
			System.out.println("How much discount did you get? ");// ask user for discount
			int discountAmount = input.nextInt();//assign discount to variable
			total = tuition - discountAmount;// calculate total
		}
		double tax = total * 0.02;//calculate tax
		int taxAmount = (int) tax;
		int totalWithTax = total + taxAmount; //calculate total with tax
		System.out.println(name + ", your tuition for the year is: $" + total);//display results to user
		System.out.println("Your total tuition after tax is $" + totalWithTax);
		if (total < 16000) {
			System.out.println("The tuition is the cheapest it can be.");
		}
		
	}

}
