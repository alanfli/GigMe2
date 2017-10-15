package bonetasticbooleans.gigme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class TalentFilloutActivity extends AppCompatActivity {

    ArrayList<Talent> talents = new ArrayList<Talent>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talent_fillout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Musician musician = (Musician) this.getIntent().getSerializableExtra("user");

        final CheckBox tromboneButton = (CheckBox) findViewById(R.id.tromboneButton);
        final CheckBox trumpetButton = (CheckBox) findViewById(R.id.trumpetButton);
        final CheckBox tubaButton = (CheckBox) findViewById(R.id.tubaButton);
        final CheckBox clarinetButton = (CheckBox) findViewById(R.id.clarinetButton);
        final CheckBox fluteButton = (CheckBox) findViewById(R.id.fluteButton);
        final CheckBox saxaphoneButton = (CheckBox) findViewById(R.id.saxaphoneButton);
        final CheckBox baritoneButton = (CheckBox) findViewById(R.id.baritoneButton);
        final CheckBox violinButton = (CheckBox) findViewById(R.id.violinButton);
        final CheckBox singerButton = (CheckBox) findViewById(R.id.singerButton);
        final CheckBox bodyButton = (CheckBox) findViewById(R.id.bodyButton);

        Button continueButton = (Button) findViewById(R.id.confirmButton);

        continueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(tromboneButton.isChecked()) {
                    talents.add(Talent.TROMBONE);
                }
                if(trumpetButton.isChecked()) {
                    talents.add(Talent.TRUMPET);
                }
                if(tubaButton.isChecked()) {
                    talents.add(Talent.TUBA);
                }
                if(clarinetButton.isChecked()) {
                    talents.add(Talent.CLARINET);
                }
                if(fluteButton.isChecked()) {
                    talents.add(Talent.FLUTE);
                }
                if(saxaphoneButton.isChecked()) {
                    talents.add(Talent.SAXOPHONE);
                }
                if(baritoneButton.isChecked()) {
                    talents.add(Talent.BARITONE);
                }
                if(violinButton.isChecked()) {
                    talents.add(Talent.VIOLIN);
                }
                if(singerButton.isChecked()) {
                    talents.add(Talent.SINGER);
                }
                if(bodyButton.isChecked()) {
                    talents.add(Talent.MYBODY);
                }

                if(talents.size() == 0) {
                    Toast.makeText(getApplicationContext(), "Please Make a selection",
                            Toast.LENGTH_SHORT).show();
                } else {
                    musician.setTalents(talents);
                    Intent genreRegistration =  new Intent(TalentFilloutActivity.this
                            , GenreFilloutActivity.class);
                    genreRegistration.putExtra("user", musician);
                    startActivity(genreRegistration);
                }
            }
        });


    }
}
