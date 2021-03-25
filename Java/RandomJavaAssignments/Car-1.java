
/**
 * A program to show the rental cars available and check the number of cars of a certain make and model and to compare car rental prices
 *
 * @author (Isaac Altice)
 * @version (04/10/2019)
 */
public class Car
{
    // instance variables
    private String carModel;// model variable
    private String carCategory;//category variable
    private int carYear;// year variable
    private double carRentalCost;// daily rental cost variable
    private int timesRented;// number of times rented variable
    

    /**
     * Default constructor for objects of class Car that sets all Integer or double variables to zero or refference variables to null
     */
    public Car()
    {
        carModel = null;
        carCategory = null;
        carYear = 0;
        carRentalCost = 0.0;
        timesRented = 0;
    }
    /**
     * Overloaded constructor for objects of class car with parameters for every instance variable
     */
    public Car(String inModel, String inCategory, int inYear, double inCost, int inRented)
    {
        carModel = inModel;
        carCategory = inCategory;
        carYear = inYear;
        carRentalCost = inCost;
        timesRented = inRented;
    }
    /**
     * toString method - creates a string of all the information about a car object
     *
     * @param  none
     * @return    a string that is a short description of every instance variable  followed by its value
     */
    public String toString()
    {
        return "Car Model : " + carModel + "\nCar Category: " + carCategory + "\nCar Year : " + carYear + "\nDaily Rental Cost : " + carRentalCost + "\nNumber Of Times Rented : " + timesRented;
    }
     /**
     * equals method - compares two car objects by their year and model
     *
     * @param  Car inCar - a Car object
     * @return    true or false depending on if the Car objects are equal in their year and model
     */
    public boolean equals(Car inCar)
    {
        boolean value = false;// variable to hold if the cars are equal
        if(this.carYear == inCar.carYear && this.carModel.equals(inCar.carModel))// compares the two cars on year and model
            value = true;
        return value;
    }
     /**
     * compareTo method - compares two car objects based on their rental cost
     *
     * @param  Car inCar - a Car inCar
     * @return    an integer variable answer that is either 0,1,-1 depending on the comparison of the car rental cost
     */
    public int compareTo(Car inCar)
    {
        int answer = 0;// variable to hold if they are less than , equal to, or greater than
        if(this.carRentalCost > inCar.carRentalCost)
            answer = 1;
        else if(this.carRentalCost < inCar.carRentalCost)
            answer = -1;
        return answer;
    }
     /**
     * setTimesRented method - sets a new value for the Car objects timesRented variable
     *
     * @param  int inTimesRented - the new value for the timesRented variable
     * @return   none
     */
    public void setTimesRented(int inTimesRented)
    {
        timesRented = inTimesRented;// sets times rented
    }
     /**
     * getCarModel method -gets the car model for the car object
     *
     * @param  none
     * @return    a string that is the Car objects model
     */
    public String getCarModel()
    {
        return this.carModel;// gets car model
    }
     /**
     * getCarCategory method - gets the car category for the car object
     *
     * @param  none
     * @return    a string that is the car objects category
     */
    public String getCarCategory()
    {
        return this.carCategory;// gets car category
    }
}
