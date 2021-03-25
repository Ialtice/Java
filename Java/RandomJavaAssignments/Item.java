
/**
 * program to display and add information about items
 *
 * @author Isaac Altice
 * @version 1/30/2019
 */
public class Item{
    private int quantity;
    private double price;
    private double weight;
    private String name;
    private final double POUNDS_TO_OZ = 16;
    private final double OZ_TO_POUNDS = 1/16;
    
    public Item(){
        quantity = 0;
        price = weight = 0;
        name = "Unkown";
    }
    public Item(int inQuantity,double inPrice,double inWeight, String inName){
        if(inPrice > 0 && inWeight > 0 && inQuantity > 0){
            quantity = inQuantity;
            price = inPrice;
            weight = inWeight;
            name = inName;
    
        }
        else{
            quantity = 0;
            price = weight = 0;
            name = "Unkown";   
        }
    }
    public void setQuantity(int inQuantity){
        if(inQuantity < 0)
            quantity = 0;
        else
            quantity = inQuantity;
    }
    public void setPrice(double inPrice){
        if(inPrice < 0)
            price = 0;
        else
            price = inPrice;
    }
    public void setWeight(double inWeight, int inChoice){
        if(inWeight < 0)
            weight = 0;
        else{
            if(inChoice == 1) {
                weight = inWeight;
            }
            else
                weight = inWeight * OZ_TO_POUNDS;
        }
    }
    public void calculateWeights(double inWeight){
        
    }
    public void setName(String inName){
        name = inName;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPice(){
        return price;
    }
    public double getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Item Name: " + name + "\nQuantity: " + quantity + "\nPrice: " + price + 
        "\nWeight: " + weight + " pounds" +"\nPrice per pound: " + (price / weight) + 
        "\nPrice per ounce: " + (price / (weight * POUNDS_TO_OZ));
    }
    
}
