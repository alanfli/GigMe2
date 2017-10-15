package bonetasticbooleans.gigme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * Created by alan on 10/15/17.
 */

public class GenreFilloutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_fillout);

        final Musician musician = (Musician) this.getIntent().getSerializableExtra("user");

        final CheckBox jazzCheckBox = (CheckBox) findViewById(R.id.jazzCheckBox);
        final CheckBox rockCheckbox = (CheckBox) findViewById(R.id.rockCheckBox);
        final CheckBox orchestraCheckBox = (CheckBox) findViewById(R.id.orchestraCheckBox);
        final CheckBox latinCheckBox = (CheckBox) findViewById(R.id.latinCheckBox);
        final CheckBox countryCheckBox = (CheckBox) findViewById(R.id.countryCheckBox);
        final CheckBox theatricalCheckBox = (CheckBox) findViewById(R.id.theatricalCheckBox);
        final CheckBox danceCheckBox = (CheckBox) findViewById(R.id.danceCheckBox);
        final CheckBox alternativeCheckBox = (CheckBox) findViewById(R.id.alternativeCheckBox);
        final CheckBox soloCheckBox = (CheckBox) findViewById(R.id.soloCheckBox);
        final CheckBox ambientCheckBox = (CheckBox) findViewById(R.id.ambientCheckBox);

        Button submitButton = (Button) findViewById(R.id.submitGenreButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Genre> genres = new ArrayList<Genre>();

                if (jazzCheckBox.isChecked()) {
                    genres.add(Genre.JAZZ);
                }
                if (rockCheckbox.isChecked()) {
                    genres.add(Genre.ROCK);
                }
                if (orchestraCheckBox.isChecked()) {
                    genres.add(Genre.ORCHESTRA);
                }
                if (latinCheckBox.isChecked()) {
                    genres.add(Genre.LATIN);
                }
                if (countryCheckBox.isChecked()) {
                    genres.add(Genre.COUNTRY);
                }
                if (theatricalCheckBox.isChecked()) {
                    genres.add(Genre.THEATRICAL);
                }
                if (danceCheckBox.isChecked()) {
                    genres.add(Genre.DANCE);
                }
                if (alternativeCheckBox.isChecked()) {
                    genres.add(Genre.ALTERNATIVE);
                }
                if (soloCheckBox.isChecked()) {
                    genres.add(Genre.SOLO);
                }
                if (ambientCheckBox.isChecked()) {
                    genres.add(Genre.AMBIENT);
                }
                musician.setGenres(genres);

                FirebaseManager firebaseManager = FirebaseManager.getInstance();
                DatabaseReference authenticator = firebaseManager.authenticateListener(musician.getUsername());
                authenticator.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Account account = dataSnapshot.getValue(Account.class);
                        account.setMusicianUser();
                        Log.d("Account set", "Set data for " + musician.getUsername());
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Toast.makeText(getApplicationContext(), "Something went wrong.", Toast.LENGTH_SHORT).show();
                    }
                });

                Intent i = new Intent(GenreFilloutActivity.this, FilloutPageClient.class);
                i.putExtra("user", musician);
                startActivity(i);

            }
        });
    }
}
