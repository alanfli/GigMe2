package bonetasticbooleans.gigme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class FilloutPageClient extends AppCompatActivity {
    private Spinner clientSpinner;
    private EditText clientEmail;
    private  EditText clientPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fillout_page_client);

        clientSpinner = (Spinner) findViewById(R.id.cityClientSpinner);
        clientEmail = (EditText) findViewById(R.id.clientEmail);
        clientPhone = (EditText) findViewById(R.id.clientPhoneNumber);

        ArrayAdapter<City> adapter = new ArrayAdapter<City>(this, android.R.layout.simple_spinner_item, City.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        clientSpinner.setAdapter(adapter);



    }
}
