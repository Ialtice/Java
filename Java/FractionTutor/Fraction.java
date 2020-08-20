/**
 *A program to manipulate fractions
 *
 * @author Isaac Altice
 * @version 03/13/2019
 */
public class Fraction
{
    
    private int numerator;
    private int denominator;

    /**
     * Constructor for objects of class Fraction
     */
    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }
    public Fraction(int inNumerator, int inDenominator)
    {
        numerator = inNumerator;
        denominator = (inDenominator != 0) ? inDenominator : 1;
        simplify();
    }
    public  void simplify()
    {
        int minimum = (numerator >= denominator) ? denominator : numerator;
        while(minimum > 1)
        {
        if(numerator % minimum == 0 && denominator % minimum  == 0)
        {
             numerator = numerator / minimum;
             denominator = denominator / minimum;
        }
        minimum--;
    }
    }
    public Fraction add(Fraction inFraction)
    {
        return new Fraction(this.numerator*inFraction.denominator+inFraction.numerator*
        this.denominator,this.denominator*inFraction.denominator);
    }
    public Fraction subtract(Fraction inFraction)
    {
        return new Fraction(this.numerator*inFraction.denominator-inFraction.numerator*
        this.denominator,this.denominator*inFraction.denominator);
    }
    public Fraction multiply(Fraction inFraction)
    {
        return new Fraction(this.numerator*inFraction.numerator,this.denominator*inFraction.denominator);
    }
    public Fraction divide(Fraction inFraction)
    {
        return new Fraction(this.numerator*inFraction.denominator, this .denominator*inFraction.numerator);
    }
    public int compareTo(Fraction inFraction)
    {
        int result;
        
        if(this.numerator*inFraction.denominator == inFraction.numerator * this.denominator)
            result = 0;
        else if(this.numerator*inFraction.denominator > inFraction.numerator*this.denominator)
            result = 1;
        else
            result = -1;
        
        return result;
    }
    public boolean equals(Fraction inFraction)
    {
        boolean value;
        if(this.numerator*inFraction.denominator == inFraction.numerator * this.denominator)
            value = true;
        else
            value = false;
        return value;
    }
    public double toDecimal()
    {
        double decimalFraction = (double)(this.numerator) / (double)(this.denominator);
        return decimalFraction;
    }
    public static Fraction randomFraction()
    {
        int numerator = (int)((Math.random() * 10) + 1);
        return new Fraction(numerator,numerator + (int)((Math.random() * 10) + 1));
    }
    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }

}