package car;

/**
 * @author Facsimile Nimely, Abdikafi Jama
 * @version 1
 */
public class Location {
    private String city;
    private int zip;

    public Location(String city, int zip) {
        this.city = city;
        this.zip = zip;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
