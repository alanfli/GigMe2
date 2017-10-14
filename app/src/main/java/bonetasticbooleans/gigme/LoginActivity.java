package bonetasticbooleans.gigme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button logInButton = (Button) findViewById(R.id.logInButton);
        final EditText usernameText = (EditText) findViewById(R.id.usernameText);
        final EditText passwordText = (EditText) findViewById(R.id.passwordText);

        // when login button is pressed
        logInButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                FirebaseManager firebaseManager = FirebaseManager.getInstance();
                final String username = usernameText.getText().toString().trim();
                final String password = passwordText.getText().toString().trim();
                DatabaseReference authenticator = firebaseManager.authenticateListener(username);
                authenticator.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Account account = dataSnapshot.getValue(Account.class);

                        //Authenticator gets the user and determines login
                        if (account != null && account.username.equals(username)
                                && account.password.equals(password)) {
                            account.setAccount(account);
                            Log.d("LoginActivity", "succesful login with " + username);
                        } else {
                            Toast.makeText(getApplicationContext(), "Username and password" +
                                    " do not match", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Toast.makeText(getApplicationContext(), "Login Failed",
                                Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
    }
}