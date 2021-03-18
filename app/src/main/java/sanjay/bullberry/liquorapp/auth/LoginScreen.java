package sanjay.bullberry.liquorapp.auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import sanjay.bullberry.liquorapp.MainActivity;
import sanjay.bullberry.liquorapp.R;

public class LoginScreen extends AppCompatActivity {

    private EditText edtEmail, edtPassword;
    private Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        getSupportActionBar().hide();

        edtEmail = findViewById(R.id.loginEmail);
        edtPassword = findViewById(R.id.loginPassword);
        loginbtn = findViewById(R.id.loginBtn);

        loginbtn.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        });
    }

    public void registerScreen(View view) {
        startActivity(new Intent(LoginScreen.this,RegisterScreen.class));
    }

    public void forgotpasspage(View view) {
        startActivity(new Intent(LoginScreen.this,ForgotPasswordScreen.class));
    }

    public void skip(View view) {
        startActivity(new Intent(LoginScreen.this, MainActivity.class));
    }
}
