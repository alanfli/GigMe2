package bonetasticbooleans.gigme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;

/**
 * Created by alan on 10/15/17.
 */

class GenreFilloutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_fillout);

        Musician musician = (Musician) this.getIntent().getSerializableExtra("user");

        CheckBox jazzCheckBox = (CheckBox) findViewById(R.id.jazzCheckBox);
        CheckBox rockCheckbox = (CheckBox) findViewById(R.id.rockCheckBox);
        CheckBox orchestraCheckBox = (CheckBox) findViewById(R.id.orchestraCheckBox);
        CheckBox latinCheckBox = (CheckBox) findViewById(R.id.latinCheckBox);
        CheckBox countryCheckBox = (CheckBox) findViewById(R.id.countryCheckBox);
        CheckBox theatricalCheckBox = (CheckBox) findViewById(R.id.theatricalCheckBox);
        CheckBox danceCheckBox = (CheckBox) findViewById(R.id.danceCheckBox);
        CheckBox alternativeCheckBox = (CheckBox) findViewById(R.id.alternativeCheckBox);
        CheckBox soloCheckBox = (CheckBox) findViewById(R.id.soloCheckBox);
        CheckBox ambientCheckBox = (CheckBox) findViewById(R.id.ambientCheckBox);



    }
}
