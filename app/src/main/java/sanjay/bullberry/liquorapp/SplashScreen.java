package sanjay.bullberry.liquorapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import sanjay.bullberry.liquorapp.auth.LoginScreen;

import static java.lang.Thread.sleep;

public class SplashScreen extends AppCompatActivity {

    /**
     * Constants
     */
    private final int SPLASH_DELAY = 1500;

    /**
     * Fields
     */
    private ImageView mImageViewLogo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        getWindow().setBackgroundDrawable(null);

        initializeViews();
        animateLogo();
        goToMainPage();
    }

    /**
     * This method initializes the views
     */
    private void initializeViews() {
        mImageViewLogo = findViewById(R.id.image_view_logo);
    }

    /**
     * This method takes user to the main page
     */
    private void goToMainPage() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this, LoginScreen.class));
                SplashScreen.this.finish();
            }
        }, SPLASH_DELAY);
    }

    /**
     * This method animates the logo
     */
    private void animateLogo() {
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in_without_duration);
        fadeInAnimation.setDuration(SPLASH_DELAY);

        mImageViewLogo.startAnimation(fadeInAnimation);
    }

}
