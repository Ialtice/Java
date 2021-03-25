
/**
 * program that creates a oay sub for employee including name, payrate, and hours
 *
 * @author Isaac Altice
 * @version 01/30/2019
 */
public class Paycheck
{
    private String name;
    private double hourlyRate;
    private double hours;
    private double grossPay;
    
    public Paycheck(){
     name = "unknown";
     hourlyRate = 0;
     hours = 0;
     grossPay = 0;
     
    }
    public Paycheck(String inName, double inHourlyRate, double inHours){
        setName(inName);
        setHours(inHours);
        setHourlyRate(inHourlyRate);
        calcGrossPay(hourlyRate, hours);
    }
    public void calcGrossPay(double inHourlyRate, double inHours){
        if (inHours <= 40){
            grossPay = inHourlyRate * inHours;
        }
        else{
         grossPay = (inHours - 40) * (inHourlyRate * 2) + 40 * inHourlyRate;   
        }
    }
    public void setName(String inName){
     name = inName;   
    }
    public void setHours(double inHours){
     hours = inHours;   
     calcGrossPay(hourlyRate, hours);
    }
    public void setHourlyRate(double inHourlyRate){
     hourlyRate = inHourlyRate;
     calcGrossPay(hourlyRate, hours);
    }
    public String getName(){
     return name;   
    }
    public double getHourlyRate(){
     return hourlyRate;
    }
    public double getHours(){
        return hours;
    }
    public double getGrossPay(){
        return grossPay;
    }
    public String toString(){
     return "Employee: " + name + "\nHoursWorked: " + hours + "\nRate of Pay: " + hourlyRate
     + "\nGross Pay: $" + grossPay;
    }
}
