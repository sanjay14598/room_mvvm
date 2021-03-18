package sanjay.bullberry.liquorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.agrawalsuneet.dotsloader.loaders.LazyLoader;

public class MainActivity extends AppCompatActivity {

    private ImageView search, close;
    private RelativeLayout searchLay;
    private RecyclerView recyclerView;
    LazyLoader lazyLoader;
    private TextView add;
    private RelativeLayout viewCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        search = findViewById(R.id.searchbtn);
        close = findViewById(R.id.close);
        searchLay = findViewById(R.id.search_lay);
        lazyLoader = findViewById(R.id.lazyloader);
        add = findViewById(R.id.additem);
        viewCart = findViewById(R.id.viewCardLay);

        LazyLoader loader = new LazyLoader(this, 30, 20, ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_selected));
        loader.setAnimDuration(500);
        loader.setFirstDelayDuration(100);
        loader.setSecondDelayDuration(200);
        loader.setInterpolator(new LinearInterpolator());

        lazyLoader.addView(loader);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                close.setVisibility(View.VISIBLE);
                search.setVisibility(View.GONE);
                searchLay.setVisibility(View.VISIBLE);
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                close.setVisibility(View.GONE);
                search.setVisibility(View.VISIBLE);
                searchLay.setVisibility(View.GONE);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewCart.setVisibility(View.VISIBLE);
            }
        });

    }

    public void profile(View view) {
        startActivity(new Intent(MainActivity.this, UserProfileActivity.class));

    }

    public void detail(View view) {
        startActivity(new Intent(MainActivity.this,DetailsScreen.class));
    }
}
