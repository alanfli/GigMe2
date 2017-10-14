package bonetasticbooleans.gigme;

import java.io.Serializable;

/**
 * Created by dwarr on 10/14/2017.
 */

public enum City implements Serializable {
    ATLANTA ("Atlanta"),
    NEWYORK ("New York"),
    BOSTON ("Boston"),
    SANFRANSICO ("San Fransico"),
    CHICAGO ("Chicago"),
    STLOUIS ("St. Louis"),
    NEWORLEANS ("New Orleans"),
    ORLANDO ("Orlando"),
    SEATTLE ("Seattle"),
    KANSASCITY ("Kansas City");


    private String city;

    City (String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return city;
    }
}
