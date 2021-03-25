
/**
 * this class holds the data for momentary amounts in different currencies 
 * and allows for conversions and comparisons
 *
 *
 * @author ITSC1213 - 004,005,006
 * @version 01/28/2019
 */
public class CurrencyConverter
{
    private double dollars;
    private double yen;
    private double euro;
    private double pound;
    private double bitcoin;
    
    private final double YEN_TO_DOLLARS = 0.00913;
    private final double EURO_TO_DOLLARS = 1.14048;
    private final double POUND_TO_DOLLARS = 1.31952;
    private final double BITCOIN_TO_DOLLARS = 3567.21;
    
    public CurrencyConverter(){
     dollars = yen = euro = pound = bitcoin = 0;   
    }

    public CurrencyConverter(double inAmount, char userChoice){
     setAmount(inAmount, userChoice);
    }
    public void setAmount(double inAmount, char userChoice){
        switch (userChoice){
         case 'd': dollars = inAmount;
         break;
         case 'y': dollars = YEN_TO_DOLLARS * inAmount;
         break;
         case 'e': dollars = EURO_TO_DOLLARS * inAmount;
         break;
         case 'p': dollars = POUND_TO_DOLLARS * inAmount;
         break;
         case 'b': dollars = BITCOIN_TO_DOLLARS * inAmount;
         break;
        }
        yen = dollars / YEN_TO_DOLLARS;
        euro = dollars / EURO_TO_DOLLARS;
        pound = dollars / POUND_TO_DOLLARS;
        bitcoin = dollars / BITCOIN_TO_DOLLARS;
    }//end of set method
    public double getDollars(){
     return dollars;   
    }
    public String toString(){
     return "Dollars: " + dollars +
     "\nEuros: " + euro + 
     "\nPounds: " + pound + 
     "\nBitcoins: " + bitcoin + 
     "\nYen: " + yen;
    }
}
