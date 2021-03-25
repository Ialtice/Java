/*
 * Program name : Program
 * @author: Isaac Altice
 * @date: 9/19/18
 * Lab section: itsc-1212-008
 * purpose:A program to determine if she is on the best phone plan.
 * 
*/
import java.util.Scanner;
public class program {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		int choice;
		int minutes;
		double data;
		double bill = 0;
		double package1;
		double package2;
		double package3;
		double difference;
		boolean optimal= true;
		
		System.out.println("What is your choice package?"
				+ " 1 or 2 or 3?");
		choice = input.nextInt();
		System.out.println("For the current month, "
				+ "how many minutes have you spent on your phone?");
		minutes = input.nextInt();
		System.out.println("What was your data usauge in MB?");
		data = input.nextDouble();
		
		if(choice == 1){
			bill = 39.99;
			if (minutes <= 450 && data <= 1){
				System.out.println("Your bill for this month is : " + bill);
			}
			else if (minutes > 450 && data <= 1 ){
				bill = bill + ((minutes - 450) * 0.45);
				System.out.println("Your bill for this month is : " + bill);
			}
			else if (minutes <= 450 && data > 1) {
				bill = bill + (((data -1) / 0.2) * 10);
				System.out.println(" Your bill for this month is : " + bill);
			}
			else {
				bill = bill + ((minutes - 450) * 0.45) + (((data -1) / 0.2) * 10);
				System.out.println(" Your bill for this month is : " + bill);
			}
		}
		else if (choice == 2) {
			bill = 59.99;
			if (minutes <= 900 && data <= 2){
				System.out.println("Your bill for this month is : " + bill);
			}
			else if (minutes > 900 && data <= 2 ){
				bill = bill + ((minutes - 450) * 0.40);
				System.out.println("Your bill for this month is : " + bill);
			}
			else if (minutes <= 900 && data > 2) {
				bill = bill + (((data -2) / 0.25) * 10);
				System.out.println(" Your bill for this month is : " + bill);
			}
			else {
				bill = bill + ((minutes - 900) * 0.40) + (((data -2) / 0.25) * 10);
				System.out.println(" Your bill for this month is : " + bill);
			}
		}
		else if (choice == 3){
			bill = 69.99;
			
			if (data <= 20 ){
				System.out.println("Your bill for this month is : " + bill);
			}
			else if (data > 20) {
				bill = bill + ((data - 20) * 10);
				System.out.println(" Your bill for this month is : " + bill);
			}
		}
		double package1Bill = 39.99;
		if (minutes <= 450 && data <= 1){
		
		}
		else if (minutes > 450 && data <= 1 ){
			package1Bill = package1Bill + ((minutes - 450) * 0.45);
			System.out.println("Package 1 would have been " + package1Bill);
		}
		else if (minutes <= 450 && data > 1) {
			package1Bill = package1Bill + (((data -1) / 0.2) * 10);
			System.out.println(" Package 1 would have been " + package1Bill);
		}
		else {
			package1Bill = package1Bill  + ((minutes - 450) * 0.45) + (((data -1) / 0.2) * 10);
			System.out.println(" Package 1 would have been " + package1Bill);
		}
		double package2Bill = 59.99;
		if (minutes <= 900 && data <= 2){
			System.out.println("Package 2 would have been " + package2Bill);
		}
		else if (minutes > 900 && data <= 2 ){
			package2Bill = package2Bill + ((minutes - 450) * 0.40);
			System.out.println("Package 2 would have been " + package2Bill);
		}
		else if (minutes <= 900 && data > 2) {
			package2Bill = package2Bill + (((data -2) / 0.25) * 10);
			System.out.println(" Package 2 would have been " + package2Bill);
		}
		else {
			package2Bill = package2Bill + ((minutes - 900) * 0.40) + (((data -2) / 0.25) * 10);
			System.out.println(" Package 2 would have been " + package2Bill);
		}
		double package3Bill = 69.99;
		if (data <= 20 ){
			System.out.println("Package 3 would have been " + package3Bill);
		}
		else if (data > 20) {
			package3Bill = package3Bill + ((data - 20) * 10);
			System.out.println(" Package 3 would have been " + package3Bill);
		}
		if (bill <= package1Bill && bill < package2Bill && bill< package3Bill){
			System.out.println("You areon the most optimal package.");
		}
		else if (bill > package1Bill && bill > package2Bill && bill == package3Bill) {
			System.out.println("you would have saved  a total of " + (package3Bill- package1Bill) + " by switching to package 1 and "
					+ (package3Bill - package2Bill) + " by switching to package 2");
		}
		else if (bill > package1Bill && bill == package2Bill && bill > package3Bill){
			System.out.println("you would have saved  a total of " + (package2Bill- package1Bill) + " by switching to package 1 and "
					+ (package2Bill - package3Bill) + " by switching to package 3");
		}
		else if (bill == package1Bill && bill > package2Bill && bill > package3Bill){
			System.out.println("you would have saved  a total of " + (package1Bill- package2Bill) + " by switching to package 2 and "
					+ (package1Bill - package3Bill) + " by switching to package 3");
		}
	}

}
