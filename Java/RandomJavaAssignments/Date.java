/**
 * A program that can manipulate a dates
 *
 * @author Isaac Altice
 * @version 03/18/2019
 */
public class Date
{
    private int day;//declare fields
    private Month month;//bonus points for creating month in a different class?
    private int year;
    /**
     * Constructor for objects of class Date
     */
    public Date()//defualt constructor
    {
        day = year = 0;
        month = new Month(0);
    }
    /*
     * overloaded Constructor for objects of class Date with
     * @param 3 int parameters, a month, a day, and a year
     */
    public Date(int inMonth, int inDay, int inYear)
    {
        month = new Month(inMonth);
        day = inDay;
        year = inYear;
    }
    /**
     * copy constructor for Date
     *@param Date parameter that is the Date you wish to copy
     */
    public Date(Date inDate)
    {
        day = inDate.day;
        month = inDate.month;
        year = inDate.year;
        
    }
    /**
     * A method that adds a certain number of days to the current date 
     *
     * @param  inNumDays - an int parameter that holds how many days we are adding to the current date
     * @return    the current date + inNumDays
     */
    public Date add(int inNumDays)
    {
        int numDays = inNumDays;//declare and initialize all local variables
        int addDays =0;
        int addMonths=0;
        int addYears=0;
        int tempDays = this.day;// temp variables to be able to do calculations without changing the object field values
        int tempMonth = this.month.getMonthNum();
        while(numDays >= 365)// calculates years and turns to days
        {
            addYears++;
            numDays -=365;
        }
        while(numDays +tempDays >= (month.getDaysInMonthArray(tempMonth)))//calculates months and turns to days
        {
            addMonths++;
            numDays -= (month.getDaysInMonthArray(tempMonth));
            tempMonth++;
            if(tempMonth == 13)
            {
                tempMonth = 1;
                addYears++;
            }
        }

        addDays = numDays;
        
        return new Date(this.month.getMonthNum() + addMonths,this.getDay() + addDays,this.getYear()+ addYears);//creates new date using calculations form above
    }
    /**
     * A method to subtract a certain number of days to the current date
     *
     * @param  inNumDay - int parameter that holds how many days we are subtracting from the current Date
     * @return    the current Date minus inNumDays
     */
    public Date subtract(int inNumDays)
    {
        int numDays = inNumDays;//declare and initialize local variables  
        int days =0;
        int months=0;
        int years=0;
        int tempDays = this.day;//temp variables for calculations
        int tempMonth = this.month.getMonthNum();
        while(numDays >= 365)//calculate years being subtracted
        {
            years++;
            numDays -= 365;
        }
        while(numDays > tempDays)//calculate months being subtracted
        {
            
            numDays -= (tempDays);
            months++;
            tempMonth--;
            if(tempMonth == 0)
            {
                tempMonth = 12;
                years++;
            }
            tempDays = month.getDaysInMonthArray(tempDays);
        }
                
        
        days = (tempDays - numDays);//calculates days being subtracted
        
        return new Date(tempMonth,days,this.getYear()- years);
    }
    /**
     * A method to find the number of days between two Dates
     *
     * @param  anotherDate - Date parameter that holds the second Date
     * @return    The number of days between the current Date and anotherDate
     */
    public int daysBetween(Date anotherDate)
    {
        int totalDays = 0;//declare and initialize local variables for calculations
        int monthDifference = 0;
        int yearDifference = 0;
        int oldTempMonth =0;
        int newTempMonth =0;
        Date newer;//pointers so dates dont get mixed up
        Date older;
        if(this.compareTo(anotherDate) >0)//determine which date is the most recent and set to newer and the other date to older
        {
            newer = this;
            older = anotherDate;
        }
        else
        {
            newer = anotherDate;
            older = this;
        }
        newTempMonth = newer.month.getMonthNum();//set temp month variable to inital values
        oldTempMonth = older.month.getMonthNum();
        if(newer.getYear() != older.getYear())//get year difference
        {
            yearDifference = (newer.getYear() - older.getYear());
            
        }
        if(newer.month.getMonthNum() != older.month.getMonthNum())//get months diference
        {
            monthDifference = newer.month.getMonthNum() - older.month.getMonthNum();
            
            if(monthDifference < 0)
            {
                yearDifference--;
                while(oldTempMonth != newTempMonth)
                {
                    totalDays += month.getDaysInMonthArray(oldTempMonth);
                    oldTempMonth++;
                    if(oldTempMonth == 13)
                        oldTempMonth = 1;
                }
            }
            else
            {
                while(oldTempMonth != newTempMonth)
                {
                    totalDays += month.getDaysInMonthArray(oldTempMonth);
                    oldTempMonth++;
                }
            }
        }
        if(newer.day > older.day)   //get days difference
            totalDays += newer.day - older.day;
        else
            {
                totalDays -= older.day - newer.day;
                totalDays = (int)(Math.abs(totalDays));
            }
           
        totalDays = totalDays + yearDifference * 365;//calculate total
        return totalDays;
    }
    /**
     * A method that returns the date in one of two formats
     *
     * @param  format - char parameter that holds a value to decide which format to display back the date
     * @return    the current date convertered to a string of specific format
     */
    public String getDate(char format)
    {
        String thisDate;
        if(format == 'a')
            thisDate = month.getMonthNum() + "/" + day + "/" + year;
        else if(format == 'b')
            thisDate = month.getMonthName() + " " + day + ", " + year;
        else
            thisDate = "Invalid format choice";
        return thisDate;
    }
    
    /**
     * A method to return the date as a string
     *
     * @param  none
     * @return    the date as a string
     */
    public String toString()
    {
        return month.getMonthNum() + "/" + day + "/" + year;
    }
    
    /**
     * A method to check if two dates are equal to each other
     *
     * @param  inDate - Date parameter that hold the date we are comparing the current date too
     * @return    value , true if equal, false if not equal
     */
    public boolean equals(Date inDate)
    {
        boolean value;
        if(this.day == inDate.day && this.month.getMonthNum() == inDate.month.getMonthNum() && this.year == inDate.year)
            value = true;
        else 
            value = false;
        return value;
    }
    /**
     * A method to compare to dates to find is they are <,> or = to each other
     *
     * @param  anotherDate - Date parameter that hold the date we are comparing the current date too
     * @return    int value, when value =1 >,when value = -1 <, when value = 0 =
     */
    public int compareTo(Date anotherDate)
    {
        int value;
        if(this.year > anotherDate.year)
            value = 1;
        else if(this.year < anotherDate.year)
            value = -1;
        else
        {
            if(this.month.getMonthNum() > anotherDate.month.getMonthNum())
            value = 1;
            else if(this.month.getMonthNum() < anotherDate.month.getMonthNum())
            value = -1;
            else
            {
                if(this.day < anotherDate.day)
                    value = 1;
                else if(this.day < anotherDate.day)
                    value = -1;
                else
                    value = 0;
            }
        }
        return value;
    }
    /**
     * A method to set the day
     *
     * @param  inDay- int parameter to hold the new day
     * @return    none
     */
    public void setDay(int inDay)
    {
        day = inDay;
    }
    public void setMonth(int inMonth)
    {
        month.setMonth(inMonth);
    }
    /**
     * A method to set a new year
     *
     * @param  inYear - int parameter hold the new year
     * @return    none
     */
    public void setYear(int inYear)
    {
        year = inYear;
    }
    /**
     * A method to set all new values to the current Date
     *
     * @param  inMonth, inDay, inYear, - int parameters to hold the new values for the Date
     * @return    none
     */
    public void setDate(int inMonth, int inDay, int inYear)
    {
        setDay(inDay);
        month.setMonth(inMonth);
        setYear(inYear);
    }
    /**
     * A method to get the current month from the Date
     *
     * @param  none
     * @return    the current Month name
     */
    public String getMonthName()
    {
        return month.getMonthName();
    }
    /**
     * A method to get the current day from the Date
     *
     * @param  none
     * @return    the current day
     */
    public int getDay()
    {
        return day;
    }
    /**
     * A method to get the curret year from the Date
     *
     * @param  none
     * @return    the current year
     */
    public int getYear()
    {
        return year;
    }
}
