package bonetasticbooleans.gigme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FilloutPageClient extends AppCompatActivity {
    private Spinner userSpinner;
    private EditText userEmail;
    private  EditText userPhone;
    private TextView userName;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fillout_page_client);
        final User user = (User)this.getIntent().getSerializableExtra("user");
        final DatabaseReference database = FirebaseDatabase.getInstance().getReference();

        userSpinner = (Spinner) findViewById(R.id.cityUserSpinner);
        userEmail = (EditText) findViewById(R.id.userEmail);
        userPhone = (EditText) findViewById(R.id.userPhoneNumber);
        userName = (TextView) findViewById(R.id.actualName);
        submit = (Button) findViewById(R.id.submitGeneralInfoButton);


        ArrayAdapter<City> adapter = new ArrayAdapter<City>(this, android.R.layout.simple_spinner_item, City.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        userSpinner.setAdapter(adapter);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setContactInfo(userPhone.getText().toString(), userEmail.getText().toString());
                user.setLocation((City) userSpinner.getSelectedItem());
                user.setName(userName.getText().toString());
                String[] contact = user.getContactInfo();
                if (!(user.getName().isEmpty() || contact[0].isEmpty() || contact[1].isEmpty()) && user instanceof Client) {
                    System.out.println("I'm here");
                    System.out.println(user.getName());
                    System.out.println(contact[0]);
                    System.out.println(contact[1]);
                    database.child(user.getUsername()).setValue(user);
//                    Intent intent = new Intent(FilloutPageClient.this, clientHomePage.class);
//                    startActivity(intent);
                } else if (!(user.getName().isEmpty() || contact[0].isEmpty() || contact[1].isEmpty())) {
                    database.child(user.getUsername()).setValue(user);
//                    Intent intent = new Intent(FilloutPageClient.this, musicianHomePage.class);
//                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Please fill out all the information", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }

    public void onSubmitPressed(View v) {

    }
}
