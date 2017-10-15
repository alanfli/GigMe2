package bonetasticbooleans.gigme;

import java.util.ArrayList;

/**
 * Created by Alexander on 10/14/2017.
 * Represents a musician with talent
 */

public class Musician extends User {
    private boolean visibility;
    private double rating;
    private int totalRatings;
    private int numRatings;
    private String bio;
    private ArrayList<String> reviews = new ArrayList<String>();
    private ArrayList<Talent> talents = new ArrayList<Talent>();

    public Musician(String username) {
        super(username);
        this.visibility = true;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public void addTalent(Talent talent) {
        talents.add(talent);
    }

    public void removeTalent(Talent talent) {
        talents.remove(talent);
    }


    public boolean hasTalent(Talent talent) {
        for (int i = 0; i < talents.size(); i++) {
            if (talents.get(i).equals(talent)) {
                return true;
            }
        }
        return false;
    }

    public void updateRating(int rating) {

        numRatings++;
        totalRatings += rating;
        this.rating = (totalRatings + 0.0) / (numRatings);

    }

    public void addReview(String review) {
        reviews.add(review);
    }

    /*
    public void acceptRequest(Request r) {
        r.setStatus(ACCEPTED);
        sendContact(r.getClient());
    }
    */
}
