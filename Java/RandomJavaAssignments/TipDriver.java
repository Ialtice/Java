
/**
 * Write a description of class TipDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TipDriver{
    public static void main (String[] args){
     TipCalculator tc;
     tc = new TipCalculator();
     System.out.println(tc.toString());
     tc.setCost(15);
     tc.setTipPercent(10);
     System.out.println();
     System.out.println(tc.toString());
  
    }
}
