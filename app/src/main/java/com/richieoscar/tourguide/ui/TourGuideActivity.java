package com.richieoscar.tourguide.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.richieoscar.tourguide.R;
import com.richieoscar.tourguide.adapters.TourGuidePagerAdapter;
import com.richieoscar.tourguide.databinding.ActivityTourGuideBinding;

public class TourGuideActivity extends AppCompatActivity {

    private ViewPager viewPager;
    ActivityTourGuideBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tour_guide);
        getSupportActionBar().setElevation(0);
        viewPager = binding.viewPager;
        TourGuidePagerAdapter adapter = new TourGuidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(viewPager);
    }

    public void displayDetailFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.container, fragment, fragment.toString());
        viewPager.setVisibility(View.GONE);
        transaction.addToBackStack(fragment.toString());
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        viewPager.setVisibility(View.VISIBLE);
        FragmentManager fm = getSupportFragmentManager();
        if (fm.getBackStackEntryCount()<2){
            fm.popBackStack();
        }
        else {
        super.onBackPressed();
        }
    }

    public void showUpButton(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void hideUpButton(){
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
}