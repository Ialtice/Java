
/**
 * code for preferred customer objects
 *
 * @author (Isaac Altice)
 * @version (04/17/2019)
 */
public class PreferredCustomer extends Customer
{
    private double purchases;
    private double discountLevel;

    public PreferredCustomer(String inName,String inAddress, String inPhoneNumber,
        int inId,boolean inMailingList,double inPurchases, double inDiscountLevel)
    {
        super(inName, inAddress, inPhoneNumber,inId,inMailingList);
        purchases = inPurchases;
        discountLevel = inDiscountLevel;
    }
    public void setPurchases(double inPurchases)
    {
        purchases = inPurchases;
        double level = 0;
        if(purchases >= 500)
            level = 0.05;
        else if(purchases >= 1000)
            level = 0.06;
        else if(purchases >=1500)
            level = 0.07;
        else if(purchases >= 2000)
            level = 0.1;
        discountLevel = level;
    }
    public double getPurchases()
    {
        return purchases;
    }
    public void setDiscountLevel(double inDiscountLevel)
    {
        discountLevel = inDiscountLevel;
    }
    public double getDiscountLevel()
    {
        return discountLevel;
    }
    public String toString()
    {
        return super.toString() + "\nPurchases : " + purchases + "\nDiscount: " 
            + (int)(discountLevel * 100) +"%";
    }
}