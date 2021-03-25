
/**
 * Code for person objects
 *
 * @author (Isaac Altice)
 * @version (04/17/19)
 */
public class Person
{
    private String name;
    private String address;
    private String phoneNumber;
    
    public Person()
    {
        name = " ";
        address = " ";
        phoneNumber = " ";
    }
    public Person(String inName, String inAddress, String inPhoneNumber)
    {
        name = inName;
        address = inAddress;
        phoneNumber = inPhoneNumber;
    }
    public void setName(String inName)
    {
        name = inName;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String inAddress)
    {
        address = inAddress;
    }
    public String getAddress()
    {
        return address;
    }
    public void setPhoneNumber(String inPhoneNumber)
    {
        phoneNumber = inPhoneNumber;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String toString()
    {
        return "Name: " + name +"\nAddress: " + address + "\nPhone Number: " + phoneNumber;
    }
    
}
