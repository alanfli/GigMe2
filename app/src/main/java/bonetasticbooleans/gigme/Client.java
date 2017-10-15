package bonetasticbooleans.gigme;


/**
 * Created by Alexander on 10/14/2017.
 */

public class Client extends User {

    private double rating;
    private int totalRatings;
    private int numRatings;

    Client(String name) {
        super(name);
    }

    Client(String name, String contact, City city) {
        super(name, contact, city);
    }

    /**
     * Sends request to GigMe app with information about gig, which returns list of
     * available musicians.
     *
     * @return Musician[] of available musicians
     */
    public Musician[] requestMusicians(City location, String date, Talent talent, Genre genre) {
        return new Musician[0];
    }

    public void updateRating(int rating) {

        numRatings++;
        totalRatings += rating;
        this.rating = (totalRatings + 0.0) / (numRatings);

    }

}
