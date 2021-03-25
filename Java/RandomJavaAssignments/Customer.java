
/**
 * code for customer objects
 *
 * @author (Isaac Altice)
 * @version (04/17/19)
 */
public class Customer extends Person
{
    private int id;
    private boolean mailingList;

    public Customer(String inName,String inAddress, String inPhoneNumber,int inId,boolean inMailingList)
    {
        super(inName,inAddress,inPhoneNumber);
        id = inId;
        mailingList = inMailingList;
    }
    public void setId(int inId)
    {
        id = inId;
    }
    public int getId()
    {
        return id;
    }
    public void setMailingList(boolean inMailingList)
    {
        mailingList = inMailingList;
    }
    public boolean getMailingList()
    {
        return mailingList;
    }
    public String toString()
    {
        return "Customer: " + id + "\n" + super.toString() + "\nWants Mail: " + mailingList;
    }
}
