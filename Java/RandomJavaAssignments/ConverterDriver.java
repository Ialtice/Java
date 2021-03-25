
/**
 * Write a description of class ConverterDriver here.
 *
 * @author Isaac Altice
 * @version 01/28/2019
 */
public class ConverterDriver
{
    public static void main(String[] args){
     CurrencyConverter cc;
     cc = new CurrencyConverter();
     System.out.println(cc.toString());
     cc.setAmount(50,'e');
     System.out.println(cc.toString());
     
    }
}
