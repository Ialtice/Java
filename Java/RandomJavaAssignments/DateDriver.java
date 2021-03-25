import java.util.*;
/**
 * A program that will perform numerous operations on a date and test all methods in the Date class
 *
 * @author Isaac Altice
 * @version 03/18/2019
 */
public class DateDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);// declaring and initializing objects and varaibles
        Date currentDate= new Date(4,3,2019);
        Date date1 = new Date(2,1,2017);
        Date date2 = new Date(5,20,2021);
        Date date3 = new Date(4,3,2019);
        Date copyDate;
        int choice = 1;
        int daysBetween = 0;
        char format;
        int value;
        // showing the following methods work
        // add day methods and toString methods
        System.out.println("\nAdd 1 day to current date\nCurrent Date: " + currentDate.toString() +"\nNew Date : "  + currentDate.add(1).toString());
        System.out.println("\nAdd 31 days to current date\nCurrent Date: " + currentDate.toString() +"\nNew Date : "  + currentDate.add(31).toString());
        System.out.println("\nAdd 366 days to current date\nCurrent Date: " + currentDate.toString() +"\nNew Date : "  + currentDate.add(366).toString());
        //subtract days methods
        System.out.println("\nSubtract 1 day from the current date\nCurrent Date: " + currentDate.toString() + "\nNewDate: " + currentDate.subtract(1).toString());
        System.out.println("\nSubtract 30 day from the current date\nCurrent Date: " + currentDate.toString() + "\nNewDate: " + currentDate.subtract(30).toString());
        System.out.println("\nSubtract 365 day from the current date\nCurrent Date: " + currentDate.toString() + "\nNewDate: " + currentDate.subtract(365).toString());
        //number of days between method
        System.out.println("\nNumber of days between two dates\nDate1: " + currentDate.toString() +"\nDate2: " + date1.toString());
        System.out.println("Days between : " + currentDate.daysBetween(date1));
        System.out.println("\nNumber of days between two dates\nDate1: " + currentDate.toString() +"\nDate2: " + date2.toString());
        System.out.println("Days between : " + currentDate.daysBetween(date2));
        System.out.println("\nNumber of days between two dates\nDate1: " + currentDate.toString() +"\nDate2: " + date3.toString());
        System.out.println("Days between : " + currentDate.daysBetween(date3));
        //show date in different formats method
        System.out.println("\nShow dates in different formats(a for #/#/#, b for Month name #, #)");
        System.out.println("a: " + currentDate.getDate('a'));
        System.out.println("b: " + currentDate.getDate('b')+"\n");
        //equals method
        System.out.println("\nCheck to see if two dates are equal\nDate1: "+ date1.toString()+ "\nDate2: " + date2.toString());
        System.out.println("They are equal: " + date1.equals(date2));
        System.out.println("Check to see if two dates are equal\nDate1: "+ currentDate.toString()+ "\nDate2: " + date3.toString());
        System.out.println("They are equal: " + currentDate.equals(date3));
        //compareTo method
        System.out.println("\nCompare two dates\nIf they are equal then: 0, If the first is greater than the second: 1, If less than: -1");
        System.out.println("Date 1: " + currentDate.toString() + "\nDate 2: " + date3.toString() + "\nWhen compared: " + currentDate.compareTo(date3));
        System.out.println("Compare two dates\nIf they are equal then: 0, If the first is greater than the second: 1, If less than: -1");
        System.out.println("Date 1: " + currentDate.toString() + "\nDate 2: " + date1.toString() + "\nWhen compared: " + currentDate.compareTo(date1));
        System.out.println("Compare two dates\nIf they are equal then: 0, If the first is greater than the second: 1, If less than: -1");
        System.out.println("Date 1: " + currentDate.toString() + "\nDate 2: " + date2.toString() + "\nWhen compared: " + currentDate.compareTo(date2)+ "\n");
        //copy constructor
        System.out.println("Current date I wish to copy : " + currentDate.toString() );
        copyDate = new Date(currentDate);
        System.out.println("Copy date: " + copyDate.toString());
        //Set methods
        System.out.println("\nDate : " + copyDate.toString() + " set to new date : 1/12/1234");
        copyDate.setDate(1,12,1234);
        System.out.println("Date: " + copyDate.toString());
        copyDate.setMonth(2);
        System.out.println("Set month to two: " + copyDate.toString());
        copyDate.setDay(3);
        System.out.println("Set day to three: " + copyDate.toString());
        copyDate.setYear(3000);
        System.out.println("Set year to three thousand: " + copyDate.toString());
        
        //a menu I created because I misunderstood inscructions at first, maybe 10+ bonus points?
        System.out.println("Enter a date you wish to do operations on by entering a month followed by day followed by year : ");
        date1 = new Date(input.nextInt(),input.nextInt(),input.nextInt());
        while (choice != 10)
        {
            System.out.println("Menu\n1. Add days to date\n2.Subract days\n3.Find distance between dates\n4.Display date in a format of choice"
            + "\n5.Display current date\n6.Compare to another date\7.Enter a date to check if it is equal to your current date " +
            "\n8.Enter a new current date\n9.Change date\n10. Quit\n\nPlease enter the number of your menu choice: ");
            choice = input.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("How many days do you want to add to your current date? : ");
                date1 = (date1.add(input.nextInt()));
                System.out.println("Your new date is : " + date1.toString());
                break;
                case 2:
                System.out.println("How many days do you want to subtract to your current date? : ");
                date1 = (date1.subtract(input.nextInt()));
                System.out.println("Your new date is : " + date1.toString());
                break;
                case 3:
                System.out.println("Enter the date you want to find the date the distance between your current date (format ## ## ####)");
                date2 = new Date(input.nextInt(),input.nextInt(),input.nextInt());
                daysBetween = date1.daysBetween(date2);
                System.out.println("Days between " + date1.toString() + " and " + date2.toString() + " : " + daysBetween);
                break;
                case 4:
                System.out.println("What format do you want to show the date in ?\na- ex.January 1,2019\nb- ex. 1/1/2019");
                format = input.next().charAt(0);
                System.out.println("Formated date: " + date1.getDate(format));
                break;
                case 5:
                System.out.println("Your current date is : " + date1.toString());
                break;
                case 6:
                System.out.println("Enter a date to compare to your current date : ");
                date2 = new Date(input.nextInt(), input.nextInt(), input.nextInt());
                value = date1.compareTo(date2);
                if(value == 1)
                    System.out.println("Your current date is greater than your second date");
                else if(value == -1)
                    System.out.println("Your current date is greater than your second date");
                else
                    System.out.println("Your dates are the same");
                break;
                case 7:
                System.out.println("Enter a date you want to check is equal to your current date");
                date2 = new Date(input.nextInt(),input.nextInt(),input.nextInt());
                System.out.println("Are the two dates are equal: " + date1.equals(date2));
                break;
                case 8:
                System.out.println("Enter a new current date: ");
                date1.setDate(input.nextInt(), input.nextInt(), input.nextInt());
                case 10:
                System.out.println("Goodbye");
                break;
                default:
                System.out.println("Invalid menu choice");
            }
        }
        
    }
}
