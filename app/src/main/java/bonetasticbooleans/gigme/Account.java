package bonetasticbooleans.gigme;

/**
 * Created by alan on 10/14/17.
 * Represents a basic account with a username and password
 */

public class Account {
    private String username;
    private String password;
    private boolean isMusician;

    public Account(String username, String password, Boolean isMusician) {
        this.username = username;
        this.password = password;
        this.isMusician = isMusician;
    }

    //null account for Firebase casting when retrieving
    public Account() {
        username = null;
        password = null;
        isMusician = false;
    }

    //static singleton User for current user
    private static Account currentAccount = null;

    public static void setAccount(Account newUser) {
        currentAccount = newUser;
    }
    public static Account getCurrentAccount() {
        return currentAccount;
    }

    public static void clearAccount() {
        currentAccount = null;
    }
}
