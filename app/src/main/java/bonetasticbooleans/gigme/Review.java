package bonetasticbooleans.gigme;

/**
 * Created by dwarr on 10/14/2017.
 */

public class Review {
    private int value;
    private String comment;
    private String name;

    Review (int value, String comment, User user) {
        this.value = value;
        this.comment = comment;
        this.name = user.getName();
    }

    public int getValue() {
        return  value;
    }

    public String getComment() {
        return comment;

    }

    public String getName() {
        return name;
    }
}
