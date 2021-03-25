import java.util.Scanner;
public class activity6part3{
  public static void main(String[] args){
	 Scanner scan = new Scanner (System.in);
	 int choice = 1;
	 do {
		choice = displayMenu(); 
	 }while (choice != 0);
	 System.out.println("Goodbye");
  }
  
  public static int displayMenu(){
	Scanner scan = new Scanner (System.in);
	int choice;
	int num1;
    int num2;
    double num1Decimal;
    double num2Decimal;
    
	System.out.println("0. Quit"); 
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Subtract with decimals");
    System.out.println("4. Multiple");
    System.out.println("5. Divide");
	System.out.println("Enter your choice: ");
	choice = scan.nextInt();
	
	
    
	switch (choice) {
	case 0 : 
		System.out.println("Quiting");
		break;
	case 1 :
		 System.out.print("Enter two numbers to add: ");
	     num1 = scan.nextInt();
	     num2 = scan.nextInt();
	     System.out.println("Sum = " + add(num1, num2));
	     break;
	case 2 :
		System.out.print("Enter two numbers to subtract: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println("Subtract = " + subtract(num1, num2));
        break;
	case 3 :
		System.out.print("Enter two numbers to subtract with decimals: ");
        num1Decimal = scan.nextDouble();
        num2Decimal = scan.nextDouble();
        System.out.println("Subtract = " + subtract(num1Decimal, num2Decimal));
        break;
	case 4 :
		System.out.print("Enter two numbers to multiply: ");
        num1Decimal = scan.nextDouble();
        num2Decimal = scan.nextDouble();
        System.out.println("multiplication = " + multiplication(num1Decimal, num2Decimal));
        break;
	case 5 :
		System.out.print("Enter two numbers to divide: ");
        num1Decimal = scan.nextDouble();
        num2Decimal = scan.nextDouble();
        System.out.println("division = " + division(num1Decimal, num2Decimal));
        break;
    default :
    	System.out.println("Invalid menu choice, choose again");
	}
	return choice;	 
 }

 public static int add(int a, int b){
    int sum = a + b;
    return sum;
 }

 public static int subtract(int a, int b){
	 int  subtract = a - b;
    return subtract;
 }

 public static double subtract(double a, double b){
	 double subtract = a - b;
    return subtract;

 }
public static double multiplication(double a, double b) {
	double multiplication = a * b;
	return multiplication;
}
public static double division(double a, double b) {
	double divide;
	if (b != 0.0) 
		divide = a / b;
	else {
		divide = -99999999999999999999999.99;
		System.out.println("Cannont divide by 0");
	}
	return divide;
}


}