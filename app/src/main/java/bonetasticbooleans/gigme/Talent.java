package bonetasticbooleans.gigme;

import java.io.Serializable;

/**
 * Created by dwarr on 10/14/2017.
 * Represents a musician's specialty
 */

public enum Talent implements Serializable {
    TROMBONE ("Trombone"),
    TRUMPET ("Trumpet"),
    TUBA ("Tuba"),
    CLARINET ("Clarinet"),
    FLUTE ("Flute"),
    SAXOPHONE ("Saxophone"),
    BARITONE ("Baritone"),
    VIOLIN ("Violin"),
    SINGER ("Singer");

    private String talent;

    Talent(String talent) {
        this.talent = talent;
    }

    public String getTalent() {
        return talent;
    }

    public String toString() {
        return talent;
    }
}
