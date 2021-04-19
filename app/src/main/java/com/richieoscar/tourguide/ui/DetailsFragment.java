package com.richieoscar.tourguide.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.richieoscar.tourguide.R;
import com.richieoscar.tourguide.databinding.FragmentDetailsBinding;
import com.richieoscar.tourguide.model.Attraction;

public class DetailsFragment extends Fragment {

    private FragmentDetailsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false);
        Attraction attraction = getArguments().getParcelable("Item");
        binding.name.setText(attraction.getName());
        binding.location.setText(attraction.getLocation());
        binding.openHours.setText(attraction.getOpenHours());
        binding.phone.setText(attraction.getPhoneNumber());
        binding.image.setImageResource(attraction.getImage());
        binding.showDirection.setOnClickListener(v -> {
            showDirections(binding.name.getText().toString());
        });
        return binding.getRoot();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        TourGuideActivity activity = (TourGuideActivity) getActivity();
        if (activity != null) {
            activity.showUpButton();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                ((TourGuideActivity) getActivity()).onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showDirections(String name) {
        String format = "geo:0,0?q=" + name;
        Uri uri = Uri.parse(format);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}