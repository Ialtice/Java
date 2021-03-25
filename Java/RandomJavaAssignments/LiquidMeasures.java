
/**
 * A program that can convert an  input of quarts, ounces, liters, or gallons into the others.
 *
 * @author Isaac Altice
 * @version 02/20/2019
 */
public class LiquidMeasures
{
    final double QUARTS_TO_OUNCES = 32;//constants for ounces, liters,gallons, conversions
    final double QUARTS_TO_LITERS = 0.950;
    final double QUARTS_TO_GALLONS = 0.25;
    private double quarts;// private object field variables 
    private double ounces;
    private double liters;
    private double gallons;
    

    /**
     * default Constructor for objects of class LiquidMeasures
     */
    public LiquidMeasures()
    {
        quarts = 0;
        ounces = 0;
        liters = 0;
        gallons = 0;
    }
/*
 * overloaded constructor for object of class LiquidMeasures that allows for input of quarts to then calculate the other fields
 */
    public LiquidMeasures(double inQuarts)
    {
        quarts = inQuarts;
        ounces = inQuarts * QUARTS_TO_OUNCES;
        liters = inQuarts * QUARTS_TO_LITERS;
        gallons = inQuarts * QUARTS_TO_GALLONS;
    }
    public void setQuarts(double inMeasure)// method to set quarts field and calculate the others
    {
        quarts = inMeasure;
        ounces = quarts * QUARTS_TO_OUNCES;
        liters =  quarts * QUARTS_TO_LITERS;
        gallons = quarts * QUARTS_TO_GALLONS;
    }
    public void setOunces(double inMeasure)// method to set ounces field and calculate the others
    {
        ounces = inMeasure;
        quarts = ounces / QUARTS_TO_OUNCES;
        liters =  quarts * QUARTS_TO_LITERS;
        gallons = quarts * QUARTS_TO_GALLONS;
    }
    public void setLiters(double inMeasure)// method to set liters field and calculate the others
    {
        liters = inMeasure;
        quarts = liters / QUARTS_TO_LITERS;
        ounces = quarts * QUARTS_TO_OUNCES;
        gallons = quarts * QUARTS_TO_GALLONS;
    }
    public void setGallons(double inMeasure)// method to set gallons field and calculate the others
    {
        gallons = inMeasure;
        quarts = gallons / QUARTS_TO_GALLONS;
        ounces =quarts * QUARTS_TO_OUNCES;
        liters =  quarts * QUARTS_TO_LITERS;
    }
    public double getQuarts()//method to return the quarts feild value
    {
        return quarts;
    }
    public double getOunces()//method to return the ounces feild value
    {
        return ounces;
    }
    public double getLiters()//method to return the liters feild value
    {
        return liters;
    }
    public double getGallons()//method to return the gallons feild value
    {
        return gallons;
    }
    public String toString()//method to display all of the objects field values
    {
        return "Quarts: " + getQuarts() + "\nOunces: " + getOunces() + "\nLiters: " + getLiters() + "\nGallons: " + getGallons();
    }
}
