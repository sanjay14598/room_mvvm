package sanjay.bullberry.liquorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import sanjay.bullberry.liquorapp.auth.ChangePassword;

public class UserProfileActivity extends AppCompatActivity {

    TextView fullname, email, phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        getSupportActionBar().hide();

        fullname = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);

       // showAllUserData();
    }

    private void showAllUserData() {
        Intent intent = getIntent();

        String user_name = intent.getStringExtra("name");
        String user_email = intent.getStringExtra("email");
        String user_phone = intent.getStringExtra("phone");


        fullname .setText(user_name);
        email .setText(user_email);
        phone .setText(user_phone);

    }

    public void changePassword(View view) {
        startActivity(new Intent(UserProfileActivity.this, ChangePassword.class));

    }

    public void Location(View view) {
        startActivity(new Intent(UserProfileActivity.this, MapsActivity.class));
    }
}
