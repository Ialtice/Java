import java.util.*;
/**
 * A program to let a user choose to practice a math operation on fractions. It will ask the user for the operation to practice and then give them 5 practice problems
 * before returning to the menu
 *
 * @author Isaac Altice
 * @version 03/22/2019
 */
public class Tutor
{
    public static void main (String[] args)
    {
        Scanner input;
        String choice = "a";
        Fraction fraction1;
        Fraction fraction2;
        Fraction answer;
        Fraction studentAnswer;
        int numerator;
        int denominator;
        
        
        while(!(choice.equals("q")))
        {
            input = new Scanner(System.in);
            System.out.print("a(dd)\ns(ubtract)\nd(ivide)\nm(ultiply)\nq(uit)\n");
            System.out.println("Enter a menu choice (first letter of opperation you want to perform)");
            choice = input.nextLine();
            
            switch (choice)
            {
                case "a":
                    System.out.println("Add the following fractions");
                    for(int i=5;i>0;i--)
                    {
                        fraction1 = Fraction.randomFraction();
                        fraction2 = Fraction.randomFraction();
                        System.out.println(fraction1.toString() + " + " + fraction2.toString());
                        answer = fraction1.add(fraction2);
                        System.out.println("Enter your answer's numerator : ");
                        numerator = input.nextInt();
                        System.out.println("Enter your answer's denominator : ");
                        denominator = input.nextInt();
                        studentAnswer = new Fraction(numerator, denominator);
                        if(answer.equals(studentAnswer))
                        {
                            System.out.println("Answer: " + answer);
                            System.out.println("You answered correctly!");
                        }
                        else    
                        {
                            System.out.println("You answered incorrectly.");
                            System.out.println("Correct answer: " + answer.toString());
                        }
                        System.out.println("Next question.\n");
                    }
                    break;
                case "b":
                    System.out.println("Subtract the following fractions");
                    for(int i=5;i>0;i--)
                    {
                        fraction1 = Fraction.randomFraction();
                        fraction2 = Fraction.randomFraction();
                        System.out.println(fraction1.toString() + " - " + fraction2.toString());
                        answer = fraction1.subtract(fraction2);
                        System.out.println("Enter your answer's numerator : ");
                        numerator = input.nextInt();
                        System.out.println("Enter your answer's denominator : ");
                        denominator = input.nextInt();
                        studentAnswer = new Fraction(numerator, denominator);
                        if(answer.equals(studentAnswer))
                        {
                            System.out.println("Answer: " + answer);
                            System.out.println("You answered correctly!");
                        }
                        else    
                        {    
                            System.out.println("You answered incorrectly.");
                            System.out.println("Correct answer: " + answer.toString());
                        }
                        System.out.println("Next question.\n");
                    }
                    break;
                case "c":
                    System.out.println("Multiply the following fractions");
                    for(int i=5;i>0;i--)
                    {
                        fraction1 = Fraction.randomFraction();
                        fraction2 = Fraction.randomFraction();
                        System.out.println(fraction1.toString() + " * " + fraction2.toString());
                        answer = fraction1.multiply(fraction2);
                        System.out.println("Enter your answer's numerator : ");
                        numerator = input.nextInt();
                        System.out.println("Enter your answer's denominator : ");
                        denominator = input.nextInt();
                        studentAnswer = new Fraction(numerator, denominator);
                        if(answer.equals(studentAnswer))
                        {
                            System.out.println("Answer: " + answer);
                            System.out.println("You answered correctly!");
                        }
                        else    
                        {
                            System.out.println("You answered incorrectly.");
                        }
                        System.out.println("Next question.\n");
                    }
                    break;
                case "d":
                    System.out.println("Divide the following fractions");
                    for(int i=5;i>0;i--)
                    {
                        fraction1 = Fraction.randomFraction();
                        fraction2 = Fraction.randomFraction();
                        System.out.println(fraction1.toString() + " / " + fraction2.toString());
                        answer = fraction1.divide(fraction2);
                        System.out.println("Enter your answer's numerator : ");
                        numerator = input.nextInt();
                        System.out.println("Enter your answer's denominator : ");
                        denominator = input.nextInt();
                        studentAnswer = new Fraction(numerator, denominator);
                        if(answer.equals(studentAnswer))
                        {
                            System.out.println("Answer: " + answer);
                            System.out.println("You answered correctly!");
                        }
                        else    
                        {
                            System.out.println("You answered incorrectly.");
                            System.out.println("Correct answer: " + answer.toString());
                        }
                        System.out.println("Next question.\n");
                    }
                    break;
                case "q":
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Incorrect menu choice , try again");
            }
            
        }
            
        
    }
    
}