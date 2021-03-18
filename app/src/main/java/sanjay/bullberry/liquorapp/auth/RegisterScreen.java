package sanjay.bullberry.liquorapp.auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import sanjay.bullberry.liquorapp.MainActivity;
import sanjay.bullberry.liquorapp.R;

public class RegisterScreen extends AppCompatActivity {

    private EditText edtFullName, edtEmail, edtPhone, edtPassword;
    private Button crateAccountbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
        getSupportActionBar().hide();

        edtFullName = findViewById(R.id.regName);
        edtEmail = findViewById(R.id.regEmail);
        edtPhone = findViewById(R.id.regPhone);
        edtPassword = findViewById(R.id.regPassword);
        crateAccountbtn  = findViewById(R.id.createAccountBtn);

        crateAccountbtn.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        });

    }


    public void registerScreen(View view) {
        startActivity(new Intent(RegisterScreen.this,LoginScreen.class));
        finish();
    }
}
