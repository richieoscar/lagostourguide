package com.richieoscar.tourguide.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.richieoscar.tourguide.R;
import com.richieoscar.tourguide.adapters.TourGuideAdapter;
import com.richieoscar.tourguide.data.DataManager;
import com.richieoscar.tourguide.databinding.FragmentTheatreBinding;


public class TheatreFragment extends Fragment {

    private FragmentTheatreBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_theatre, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TourGuideAdapter adapter = new TourGuideAdapter(DataManager.theaters(), view.getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), binding.theatreRecyclerview.VERTICAL, false);
        DividerItemDecoration decoration = new DividerItemDecoration(view.getContext(), linearLayoutManager.getOrientation());
        binding.theatreRecyclerview.setLayoutManager(linearLayoutManager);
        binding.theatreRecyclerview.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        TourGuideActivity activity = (TourGuideActivity) getActivity();
        if (activity != null) {
            activity.hideUpButton();
        }
    }
}