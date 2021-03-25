import java.util.Scanner;

public class activity38 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		double x1;
		double x2;
		double y1;
		double y2;
		System.out.println("Enter the range for x (Enter two numbers): ");
		x1 = input.nextDouble();
		x2 = input.nextDouble();
		System.out.println("Enter the range for y (enter two numbers): ");
		y1 = input.nextDouble();
		y2 = input.nextDouble();
		int randomx = (int) (Math.random() * ((x2 - x1) + 5 ) + x1);
		int randomy = (int) (Math.random() * ((y2 - y1) + 5)  + y1);
		if (x1 <= randomx && randomx <= x2 && y1 <= randomy && randomy <= y2) {
			System.out.println("Point (" + randomx + ", " + randomy + ") is inside the rectangle." );
		}
		else {
			System.out.println("Point (" + randomx + ", " + randomy + ") is outside the rectangle.");
		}
			
	}
} 
/*
 * Analysis:
 * Design:
 * 
 */
