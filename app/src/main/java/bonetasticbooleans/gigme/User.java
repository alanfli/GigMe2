package bonetasticbooleans.gigme;

/**
 * Created by Alexander on 10/14/2017.
 * Represents a user in the app
 */

public class User {
    private String name;
    private String contactInfo;
    private City location;

    User(String name) {
        this.name = name;
    }

    User(String name, String contact, City city) {
        this.name = name;
        contactInfo = contact;
        location = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contact) {
        this.contactInfo = contact;
    }

    public City getLocation() {
        return location;
    }

    public void setLocation(City location) {
        this.location = location;
    }
}
