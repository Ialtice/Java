
/**
 * this is a first program in java to illustrate hhow to use the ide
 * this class holds data used for calculating the cost a trip
 *
 * @author (Isaac Altice)
 * @version (1/23/19)
 */
public class CostCalculator
{
  private double miles;
  private double gallons;
  private double costPerGallon;
  private double mileage;
  private double costForTrip;
  public CostCalculator(double inMiles, double inGallons, double inCostPer){
      miles = inMiles;
      gallons = inGallons;
      costPerGallon = inCostPer;
      
      mileage = miles/gallons;
      costForTrip = gallons * costPerGallon;
    }
    
    
}
