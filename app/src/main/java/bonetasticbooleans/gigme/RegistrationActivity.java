package bonetasticbooleans.gigme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;

import com.google.firebase.database.DatabaseReference;

import bonetasticbooleans.gigme.R;

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

        registerButton.setOnLongClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("HEy", "he");
            }
        });


    }
}
