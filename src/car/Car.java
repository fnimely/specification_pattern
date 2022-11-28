package car;

/**
 * This class represents a simple object that can be queried,
 * or searched when grouped together in a collection
 * 
 * @author Facsimile Nimely, Abdikafi Jama
 * @version 1
 */
public class Car {
    private String make;
    private int year;
    private int mileage;
    private Location location;

    /**
     * Instantiates a Car object
     * 
     * @param make     the make of the car
     * @param year     the yyear the car was made
     * @param mileage  mileage on the car
     * @param location where the car is located
     */
    public Car(String make, int year, int mileage, Location location) {
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.location = location;
    }

    /**
     * 
     * @return returns the make of the car
     */
    public String getMake() {
        return make;
    }

    /**
     * 
     * @param make set the make of the car
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * 
     * @return return the car's year
     */
    public int getYear() {
        return year;
    }

    /**
     * 
     * @param year set the year the car was made
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * 
     * @return returns the current mileage
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * 
     * @param mileage set the car's mileage
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * 
     * @return returns the car's location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location set the car's location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", year=" + year + ", mileage=" + mileage + ", location=" + location + "]";
    }

}
