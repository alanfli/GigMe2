package bonetasticbooleans.gigme;

/**
 * Created by dwarr on 10/14/2017.
 */

public class Client extends User{

    private int rating;
    private int totalRatings;
    private int numRatings;

    Client(String name, String contact, City city) {
        super(name, contact, city);
    }
}
