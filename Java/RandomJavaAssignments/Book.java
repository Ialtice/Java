
/**
 * This class holds data and methods
 * for a Book.
 * 
 * @author Isaac Altice
 * @version v1
 */
public class Book
{
   private String title;
   private String authorName;
   private double price;
   
   public Book( )
   {
       title = null;
       authorName = null;
       price = 0;
    }
    
    
    
    public Book(String inTitle, String inAuthorName, double inPrice)
    {
        title = inTitle;
        authorName = inAuthorName;
        price = inPrice;
    }
    
    public Book(Book other)
    {
        this.title = other.title;
        this.authorName = other.authorName;
        this.price = other.price;
    }
    
    //write the equals method based on the title and authorName fields
    public boolean equals(Book other)
    {
        boolean value;
        if(this.title == other.title && this.authorName == other.authorName)
            value = true;
        else 
            value = false;
        return value;
    }
    // public int compareTo(Book other)
    // {
        // return this.title.compareTo(other.title);
    // }
      //write the compareTo method basedon the activity instructions
    public int compareTo(Book other)
    {
        int value;
        if(this.price > other.price)
            value = 1;
        else if (this.price < other.price)
            value = -1;
        else
            value = 0;
        return value;
    }
    
    public String toString( )
    {
        return "Title:  " + title +
               "\nAuthor: " + authorName +
               "\nPrice:  " + price;
    }
    
}//end of class definition
