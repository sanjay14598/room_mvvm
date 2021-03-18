package sanjay.bullberry.liquorapp.auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import sanjay.bullberry.liquorapp.R;

public class ForgotPasswordScreen extends AppCompatActivity {

    private EditText edtEmail;
    private Button sentLink;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_screen);
        getSupportActionBar().hide();

        edtEmail = findViewById(R.id.forgotPassEmail);
        sentLink = findViewById(R.id.sendLinkBtn);
    }

    public void cutLogin(View view) {
        startActivity(new Intent(ForgotPasswordScreen.this,LoginScreen.class));
        finish();
    }
}
