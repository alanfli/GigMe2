package bonetasticbooleans.gigme;

<<<<<<< HEAD

/**
 * Created by Alexander on 10/14/2017.
 */

public class Client extends User {
=======
/**
 * Created by dwarr on 10/14/2017.
 */

public class Client extends User{

>>>>>>> 22356d10a7a57ed1204091f3dc861b4c296e3a09
    private int rating;
    private int totalRatings;
    private int numRatings;

<<<<<<< HEAD
    Client(String name) {
        super(name);
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
=======
    Client(String name, String contact, City city) {
        super(name, contact, city);
    }
}
>>>>>>> 22356d10a7a57ed1204091f3dc861b4c296e3a09
