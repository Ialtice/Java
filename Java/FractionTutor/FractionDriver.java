import java.util.*;
/**
 * A program driver to display the methods we created to manipulate fractions
 *
 * @author Isaac Altice
 * @version 03/20/2019
 */
public class FractionDriver
{
    public static void main(String[] args)
    {
        Fraction fraction1;
        Fraction fraction2;
        Fraction temp;
        Fraction fraction4 = new Fraction();
        
        Scanner input = new Scanner(System.in);
        int numerator1;
        int numerator2;
        int denominator1;
        int denominator2;
        
        System.out.println("Enter the numerator followed by the denominator for the first fraction : ");
        numerator1 = input.nextInt();
        denominator1 = input.nextInt();
        fraction1 = new Fraction(numerator1,denominator1);
        System.out.println("Fraction 1 = " + fraction1.toString());
        
        System.out.println("Enter the numerator followed by the denominator for the second fraction : ");
        numerator2 = input.nextInt();
        denominator2 = input.nextInt();
        fraction2 = new Fraction(numerator2,denominator2);
        System.out.println("Fraction 2 = " + fraction2.toString());
        
        temp = fraction1.add(fraction2);
        temp.simplify();
        System.out.println("Add " + fraction1.toString() + " and " + fraction2.toString() + " : " + temp);
        
        temp = fraction1.subtract(fraction2);
        temp.simplify();
        System.out.println("Subtract " + fraction1.toString() + " and " + fraction2.toString() + " : " + temp);
        
        temp = fraction1.multiply(fraction2);
        temp.simplify();
        System.out.println("Mulitply " + fraction1.toString() + " and " + fraction2.toString() + " = " + temp);
        
        temp = fraction1.divide(fraction2);
        temp.simplify();
        System.out.println("Divide " + fraction1.toString() + " and " + fraction2.toString() + " = " + temp);
        
        System.out.println("Compare " + fraction1.toString() + " and " + fraction2.toString());
        if(fraction1.compareTo(fraction2) == 1)
            System.out.println(fraction1.toString() + " > " + fraction2.toString());
        else if(fraction1.compareTo(fraction2) == -1)
            System.out.println(fraction1.toString() + " < " + fraction2.toString());
        else
            System.out.println(fraction1.toString() + " = " + fraction2.toString());
            
        System.out.println("Does " + fraction1.toString() + " equal " + fraction2.toString()+ " ? :" + fraction1.equals(fraction2));
        
        System.out.println(fraction1.toString() + " in decimal form is : " + fraction1.toDecimal());
        
        System.out.println("Here is a random fraction : " + fraction4.randomFraction().toString());
        
        
    }
}