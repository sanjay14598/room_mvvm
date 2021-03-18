package sanjay.bullberry.liquorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import sanjay.bullberry.liquorapp.auth.OtpVerifyScreen;

public class PersonalDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);
        getSupportActionBar().hide();
    }

    public void otp(View view) {
        startActivity(new Intent(PersonalDetails.this, OtpVerifyScreen.class));
    }

    public void back(View view) {
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
