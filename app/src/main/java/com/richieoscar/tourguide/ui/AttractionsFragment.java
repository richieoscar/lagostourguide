package com.richieoscar.tourguide.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.richieoscar.tourguide.R;
import com.richieoscar.tourguide.adapters.TourGuideAdapter;
import com.richieoscar.tourguide.data.DataManager;
import com.richieoscar.tourguide.databinding.FragmentAttractionsBinding;

public class AttractionsFragment extends Fragment {

    private FragmentAttractionsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_attractions, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TourGuideAdapter adapter = new TourGuideAdapter(DataManager.getCenteres(), view.getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(),binding.centreRecyclerView.VERTICAL, false);
        DividerItemDecoration decoration = new DividerItemDecoration(view.getContext(), linearLayoutManager.getOrientation());
        binding.centreRecyclerView.setLayoutManager(linearLayoutManager);
        binding.centreRecyclerView.setAdapter(adapter);
        TourGuideActivity activity = (TourGuideActivity) getActivity();
    }

    @Override
    public void onResume() {
        super.onResume();
        TourGuideActivity activity = (TourGuideActivity) getActivity();
        if (activity!=null){
            activity.hideUpButton();
        }
    }
}