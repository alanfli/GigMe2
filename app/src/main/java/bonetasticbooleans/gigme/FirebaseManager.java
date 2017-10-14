package bonetasticbooleans.gigme;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by alan on 10/14/17.
 * Represents a singleton for firebase.
 */

public class FirebaseManager {
    private static FirebaseManager firebaseManager = new FirebaseManager();
    private FirebaseDatabase database;

    public static FirebaseManager getFirebaseManager() {
        return firebaseManager;
    }

    public FirebaseManager() {
        database = FirebaseDatabase.getInstance();
    }

    
}
