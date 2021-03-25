
/**
 * Write a description of class TipCalculator here.
 *
 * @author (Isaac Altice)
 * @version (01/23/19)
 */
public class TipCalculator
{
  private double cost;
  private double tipPercent;
  private double tip;
  
  public TipCalculator(double inDollars,double inPercent){
      cost = inDollars;
      tipPercent = inPercent;
      tip = cost * (tipPercent / 100);
      
    }
    public TipCalculator(){
     cost = 0;
     tipPercent = 0;
     tip = 0;
     
    }
    public void setCost(double inDollars){
     cost = inDollars;  
     tip = cost * (tipPercent / 100); 
    }
    public void setTipPercent(double inPercent){
     tipPercent = inPercent;
     tip = cost * (tipPercent / 100);
    }
    public double getCost(){
     return cost;   
    }
    public double getTipPercent(){
     return tipPercent;
    }
    public double getTip(){
     return tip;   
    }
    public String toString(){
     return "Meal Cost: " + cost + 
     "\nTip Percent: " + tipPercent +
     "\nTip: " + tip;
    }
}
