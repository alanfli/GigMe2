package bonetasticbooleans.gigme;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by alan on 10/14/17.
 * Represents a singleton for firebase.
 */

public class FirebaseManager {
    private static FirebaseManager firebaseManager = new FirebaseManager();
    private FirebaseDatabase database;

    public static FirebaseManager getInstance() {
        return firebaseManager;
    }

    public FirebaseManager() {
        database = FirebaseDatabase.getInstance();
    }

    /**
     * Puts a username into the database
     * @param username the username of added user
     * @param password the password of added user
     * @param isMusician whether user is a Musician
     * @return the user object specified
     */
    public Account writeNewAccount(String username, String password, Boolean isMusician) {
        DatabaseReference myRef = database.getReference("Accounts");
        Account user = new Account(username, password, isMusician);
        myRef.child(username).setValue(user);
        return user;
    }

    /**
     * Creates a user authenticator. Firebase uses this to determine whether the user already exists
     * @param username the username of the user
     * @return the database reference firebase will use for authentication
     */
    public DatabaseReference authenticateListener(String username) {
        DatabaseReference myRef = database.getReference("Accounts").child(username);
        return myRef;
    }


}
