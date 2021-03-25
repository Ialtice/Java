
/**
 * Driver to display and change information about customers
 *
 * @author (Isaac Altice)
 * @version (04/17/19)
 */
public class Driver
{
    public static void main(String args[])
    {
        Person person[] = new Person[4];
        person[0] = new Customer("Isaac Altice","13 unlucky lane, Charlotte","456-9831-7515",
            13,true);
        person[1] = new PreferredCustomer("Sabrina Altice","7 lucky lane, Raleigh",
            "512-365-4156", 7, false,501,0.05);
        person[2] = new Customer("Nathan Altice","21 crazy lane, Wilmingtion","978-465-1870",
            92,false);
        person[3] = new PreferredCustomer("Deborah Altice","18 country lane, Zebulon",
            "541-384-3146", 50, false,1522,0.07);
        System.out.println("Print all persons in array");
        for(int i = 0;i<person.length;i++)
        {
            System.out.println(person[i].toString()+ "\n");
            
        }
        System.out.println("Using set methods to change all fields and get methods to display");
        System.out.println(((Customer)person[0]).toString());
        person[0].setName("Stranger");
        person[0].setAddress("unknown Lane");
        person[0].setPhoneNumber("123-456-7890");
        ((Customer)person[0]).setId(0);
        ((Customer)person[0]).setMailingList(false);
        System.out.println("\nID: " + ((Customer)person[0]).getId() 
            + "\nName: " + person[0].getName() + "\nAddress: " + person[0].getAddress()
            + "\nPhone Number : " + person[0].getPhoneNumber() + ((Customer)person[0]).getId() 
            + "\nWants Mail : " + ((Customer)person[0]).getMailingList()); 
        System.out.println("\n" + ((PreferredCustomer)person[3]).toString());
        person[3].setName("Stranger");
        person[3].setAddress("unknown Lane");
        person[3].setPhoneNumber("123-456-7890");
        ((Customer)person[3]).setId(1);
        ((Customer)person[3]).setMailingList(false);
        ((PreferredCustomer)person[3]).setPurchases(2000);
        System.out.print("\nName: " + person[3].getName() + "\nAddress: " + person[3].getAddress()
            + "\nPhone Number : " + person[3].getPhoneNumber() + ((PreferredCustomer)person[3]).getId() 
            + "\nWants Mail : " + ((PreferredCustomer)person[3]).getMailingList()
            + "\nPurchases: " + ((PreferredCustomer)person[3]).getPurchases() 
            + "\nDiscount Level: " + ((PreferredCustomer)person[3]).getDiscountLevel()); 
    }
}
