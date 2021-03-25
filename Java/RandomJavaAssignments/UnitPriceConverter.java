/**
 * Program to allow user to enter in a price of an item and its weight in pounds. It will then calculate price per pound and price per ounce and allows for display of all of these values.
 *
 * @author Isaac Altice
 * @version 2/17/19
 */
public class UnitPriceConverter
{
    final double ouncesPerPound = 16;//constant value for ounce to pound conversion
    private double priceOfItem;// declare private fields for object 
    private double weightInPounds;
    private double pricePerPound;
    private double pricePerOunce;
    
    public UnitPriceConverter()//default constructor to set all object field values to zero
    {
        priceOfItem = 0;
        weightInPounds = 0;
        pricePerPound = 0;
        pricePerOunce = 0;
       
    }
    public UnitPriceConverter(double inPriceOfItem, double inWeightInPounds){//overloaded constructor to set all object values to user inputed values
        priceOfItem = inPriceOfItem;
        weightInPounds = inWeightInPounds;
        pricePerPound = priceOfItem / weightInPounds;//calculations for price per pound
        pricePerOunce = priceOfItem / (weightInPounds * ouncesPerPound);//calculations for price per ounce
    }
    public void setPriceOfItem(double inPriceOfItem){//set price of item
        priceOfItem = inPriceOfItem;
        pricePerPound = priceOfItem / weightInPounds;
        pricePerOunce = priceOfItem / (weightInPounds * ouncesPerPound);
    }
    public void setWeightInPounds(double inWeightInPounds){//set weight
        weightInPounds = inWeightInPounds;
        pricePerPound = priceOfItem / weightInPounds;
        pricePerOunce = priceOfItem / (weightInPounds * ouncesPerPound);
        
    }
    public double getPriceOfItem(){//get object field value of price of item
        return priceOfItem;   
    }
    public double getWeightInPounds(){//get object field value for weight 
        return weightInPounds;
    }
    public double getPricePerPound(){//get object field value for price per pound
        return pricePerPound;
    }
    public double getPricePerOunce(){//get object field value for price per ounce
        return pricePerOunce;
    }
    public String toString(){// display all field values of of the object 
        return "Price of Item: " + getPriceOfItem() + 
        "\nWeight of Item in Pounds: " + getWeightInPounds() +
        "\nPrice per Pound: " + getPricePerPound() +
        "\nPrice per Ounce: " + getPricePerOunce();
    }
}
