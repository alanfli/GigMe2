package bonetasticbooleans.gigme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by dwarr on 10/14/2017.
 * Represents the registration process for a musician
 */

public class FilloutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fillout);
        final Musician musician = (Musician) savedInstanceState.getSerializable("musician");

        Spinner instrumentSpinner = (Spinner) findViewById(R.id.instrumentSpinner);
        Spinner genreSpinner = (Spinner) findViewById(R.id.genreSpinner);
        Spinner locationSpinner = (Spinner) findViewById(R.id.locationSpinner);
        Button submitButton = (Button) findViewById(R.id.submitMusicianRegistrationButton);

        ArrayAdapter<Talent> instrumentAdapter = new ArrayAdapter<Talent>(this,
                android.R.layout.simple_spinner_item, Talent.values());
        instrumentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        instrumentSpinner.setAdapter(instrumentAdapter);

        ArrayAdapter<Genre> genreAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, Genre.values());
        instrumentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        genreSpinner.setAdapter(genreAdapter);

        ArrayAdapter<City> locationAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, City.values());
        instrumentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        locationSpinner.setAdapter(locationAdapter);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }
}
