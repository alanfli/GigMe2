package bonetasticbooleans.gigme;

/**
 * Created by alan on 10/14/17.
 * Represents a basic user with a username and password
 */

public class User {
    private String username;
    private String password;
    private boolean isMusician;

    public User(String username, String password, Boolean isMusician) {
        this.username = username;
        this.password = password;
        this.isMusician = isMusician;
    }
}
