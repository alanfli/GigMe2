package bonetasticbooleans.gigme;


/**
 * Created by Alexander on 10/14/2017.
 */

public class Client extends User {
    private int rating;
    private int totalRatings;
    private int numRatings;

    Client(String name, String contact, City city) {
        super(name, contact, city);
    }

    /**
     * Sends request to GigMe app with information about gig, which returns list of
     * available musicians.
     *
     * @return Musician[] of available musicians
     */
    public Musician[] sendRequest(City location, String date, Talent talent, Genre genre) {
        return new Musician[0];
    }

    public void updateRating(int rating) {
        rating = (totalRatings + rating) / (numRatings + 1);
    }
}