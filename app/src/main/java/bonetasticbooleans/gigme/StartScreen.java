package bonetasticbooleans.gigme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        System.out.print("Wtf");
    }

//    public void onSignPressed(View v) {
//        Intent intent = new Intent(this, SignIn.class);
//        startActivity(intent);
//    }


    public void onRegistrationPressed(View v) {
        Intent intent = new Intent(StartScreen.this, RegistrationActivity.class);
        startActivity(intent);
    }
}
