package sanjay.bullberry.liquorapp.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import sanjay.bullberry.liquorapp.R;

public class OtpVerifyScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verify_screen);
        getSupportActionBar().hide();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
