package com.richieoscar.tourguide.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.richieoscar.tourguide.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button takeTour = findViewById(R.id.button_take_tour);
        takeTour.setOnClickListener(v->{
            startActivity(new Intent(this, TourGuideActivity.class));
        });
    }
}