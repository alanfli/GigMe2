package bonetasticbooleans.gigme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;


/**
 * Created by alan on 10/14/17.
 * Represents the activity launched when a user is entering a registration screen
 */

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        final String logTag = "RegistrationActivity";

        final EditText usernameButton = (EditText) findViewById(R.id.usermameInput);
        final EditText passwordButton = (EditText) findViewById(R.id.passwordInput);
        final CheckBox checkbox = (CheckBox) findViewById(R.id.isMusicianCheckBox);

        Button registerButton = (Button) findViewById(R.id.registerButton);

        // when register button is clicked
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FirebaseManager firebaseManager = FirebaseManager.getInstance();
                final String username = usernameButton.getText().toString().trim();
                final String password = passwordButton.getText().toString().trim();
                final boolean isMusician = checkbox.isChecked();

                DatabaseReference authenticator = firebaseManager.authenticateListener(username);

                authenticator.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Account account = dataSnapshot.getValue(Account.class);
                        // if account is null, then the user doesnt exist, and firebase adds you
                        // to the database
                        if (account == null) {
                            Account.setAccount(firebaseManager.writeNewAccount(username,
                                    password, isMusician));
                            account = Account.getCurrentAccount();

                            if (isMusician) {
                                Intent musicianRegistration = new Intent(RegistrationActivity.this
                                        , FilloutPageClient.class);   // <----different screens for different account types

                                musicianRegistration.putExtra("user", new Musician(username));
                                startActivity(musicianRegistration);
                            } else {
                                Intent clientRegistration = new Intent(RegistrationActivity.this,
                                        FilloutPageClient.class);
                                clientRegistration.putExtra("user", new Client(username));
                                startActivity(clientRegistration);
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Username is taken",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Toast.makeText(getApplicationContext(), "Registration failed",
                                Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


    }
}
