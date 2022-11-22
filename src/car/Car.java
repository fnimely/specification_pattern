package car;

public class Car {
    private String make;
    private int year;
    private int mileage;
    private Location location;

    public Car(String make, int year, int mileage, Location location) {
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.location = location;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
