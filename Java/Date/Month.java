
/**
 * A program to hold and display and return the values of a month
 *
 * @author Isaac Altice
 * @version 03/27/2019
 */
public class Month
{
    private int monthNum;//declaring and initializing all fields
    private String monthName;
    private int daysInMonth;
    private String [] monthNameArray = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
    private int [] daysInMonthArray = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    /*
     * default constructor for month
     */
    public Month()
    {
        daysInMonth = daysInMonthArray[0];
        monthNum = 0;
        monthName = monthNameArray[0];
    }
    /**
     * overloaded constructor for month
     * @param inMonth int- the month 
     */
    public Month(int inMonth)
    {
        daysInMonth = daysInMonthArray[inMonth];
        monthNum = inMonth;
        monthName = monthNameArray[inMonth];
    }
    /**
     * A method to get the month name
     *
     * @param  none
     * @return    monthName- the name of the month
     */
    public String getMonthName()
    {
        return monthName;
    }
    /**
     * A method to get the month in number form
     *
     * @param  none
     * @return    monthNum- month in number form
     */
    public int getMonthNum()
    {
        return monthNum;
    }
    /**
     * A method to return the days in a month
     *
     * @param  non
     * @return    daysInMonth
     */
    public int getDaysInMonth()
    {
        return daysInMonth;
    }
    /**
     * A method to get the days in month
     *
     * @param  int inMonthNum - the month in number form
     * @return    daysInMonthArray[inMonthNum] - number of days in the month
     */
    public int getDaysInMonthArray(int inMonthNum)
    {
        return daysInMonthArray[inMonthNum];
    }
    /**
     * A method to set a new month 
     *
     * @param  inMonthNum -int parameter that is the month in number form
     * @return    none
     */
    public void setMonth(int inMonthNum)
    {
        daysInMonth = daysInMonthArray[inMonthNum];
        monthNum = inMonthNum;
        monthName = monthNameArray[inMonthNum];
    }
}
