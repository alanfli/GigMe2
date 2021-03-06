package bonetasticbooleans.gigme;

/**
 * Created by alan on 10/14/17.
 * Represents a basic account with a username and password
 */

public class Account {
    public String username;
    public String password;
    public boolean isMusician;
    public Musician musicianUser;
    public Client clientUser;

    public Account(String username, String password, boolean isMusician) {
        this.username = username;
        this.password = password;
        this.isMusician = isMusician;
        this.musicianUser = null;
        this.clientUser = null;
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


    public void setClientUser(Client client) {
        this.clientUser = client;
    }

    public void setMusicianUser(Musician musician) {
        this.musicianUser = musician;
    }

    public Client getClientUser() {
        return clientUser;
    }

    public  Musician getMusicianUser() {
        return musicianUser;
    }


}
