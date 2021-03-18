package sanjay.bullberry.liquorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetailsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_screen);
        getSupportActionBar().hide();
    }

    public void personal(View view) {
        startActivity(new Intent(DetailsScreen.this,PersonalDetails.class));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
