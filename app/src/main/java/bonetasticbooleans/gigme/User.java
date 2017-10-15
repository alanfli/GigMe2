package bonetasticbooleans.gigme;

import java.io.Serializable;

/**
 * Created by Alexander on 10/14/2017.
 * Represents a user in the app
 */

public abstract class User implements Serializable {
    private String name;
    private String contactInfo;
    private City location;
    private String username;

    User(String username) {
        this.username = username;
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
