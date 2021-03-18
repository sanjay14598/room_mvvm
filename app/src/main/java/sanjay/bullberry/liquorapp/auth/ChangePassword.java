package sanjay.bullberry.liquorapp.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import sanjay.bullberry.liquorapp.R;

public class ChangePassword extends AppCompatActivity {

    private EditText newPassword, cfNewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        getSupportActionBar().hide();

        newPassword = findViewById(R.id.newpasword);
        cfNewPassword = findViewById(R.id.cfNewPassword);
    }

    public void cutLogin(View view) {
        finish();
    }
}
