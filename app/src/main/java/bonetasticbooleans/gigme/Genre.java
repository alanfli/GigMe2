package bonetasticbooleans.gigme;

import java.io.Serializable;

/**
 * Created by dwarr on 10/14/2017.
 */

public enum Genre implements Serializable {
    JAZZ("Jazz"),
    ROCK("Rock"),
    ORCHESTRA("Orchestra");



    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return genre;
    }
}
