package bonetasticbooleans.gigme;

import java.util.ArrayList;

/**
 * Created by Alexander on 10/14/2017.
 */

public class Musician extends User {
    private boolean visibility;
    private int rating;
    private int totalRatings;
    private int numRatings;
    private ArrayList<String> reviews = new ArrayList<String>();
    private String name;
    private String bio;
    private String contactInfo;
    private City location;
    private ArrayList<Talent> talents = new ArrayList<Talent>();

    Musician(String name, String bio, String contact, City location) {
        super();
        this.name = name;
        this.bio = bio;
        this.contactInfo = contact;
        this.location = location;
        visibility = true;
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
        rating = (totalRatings + rating) / (numRatings + 1);
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
