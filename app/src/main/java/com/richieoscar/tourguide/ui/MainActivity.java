package com.richieoscar.tourguide.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.richieoscar.tourguide.R;
import com.richieoscar.tourguide.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.takeTour.setOnClickListener(v->{
            startActivity(new Intent(this, TourGuideActivity.class));
        });
    }
}