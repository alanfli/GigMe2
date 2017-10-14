package bonetasticbooleans.gigme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class SignIn extends AppCompatActivity {
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        TextView signInTitle = (TextView) findViewById(R.id.signInTitle);
        Button logInButton = (Button) findViewById(R.id.logInButton);
        logInButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                EditText usernameText = (EditText) findViewById(R.id.usernameText);
                EditText passwordText = (EditText) findViewById(R.id.passwordText);
                username = usernameText.getText().toString();
                password = passwordText.getText().toString();
                System.out.println("username: " + username);
                System.out.println("password: " + password);
            }
        });
    }
}