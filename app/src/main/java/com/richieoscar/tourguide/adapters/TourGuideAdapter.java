package com.richieoscar.tourguide.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.richieoscar.tourguide.R;
import com.richieoscar.tourguide.model.Attraction;
import com.richieoscar.tourguide.ui.DetailsFragment;
import com.richieoscar.tourguide.ui.TourGuideActivity;

import java.util.ArrayList;

public class TourGuideAdapter extends RecyclerView.Adapter<TourGuideAdapter.TourGuideViewHolder> {
    private ArrayList<Attraction> attractions;
    private Context context;
    private DetailsFragment fragment;

    public TourGuideAdapter(ArrayList<Attraction> attractions, Context context) {
        this.attractions = attractions;
        this.context = context;
    }

    @NonNull
    @Override
    public TourGuideViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        return new TourGuideViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TourGuideViewHolder holder, int position) {
        holder.bind(attractions.get(position));

    }

    private void getFragmentInfo(Attraction item) {
        fragment = new DetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("Item", item);
        fragment.setArguments(bundle);
        displayDetailFragment(R.id.container, fragment);
    }

    public void displayDetailFragment(int id, Fragment fragment) {
        if (context == null) {
            return;
        }
        if ((context instanceof TourGuideActivity)) {
            TourGuideActivity tourGuideActivity = (TourGuideActivity) context;
            Fragment newFrag = fragment;
            tourGuideActivity.displayDetailFragment(fragment);
        }
    }

    @Override
    public int getItemCount() {
        return attractions.size();
    }

    public class TourGuideViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name;
        ImageView image;

        public TourGuideViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView_name);
            image = itemView.findViewById(R.id.imageView_image);
            itemView.setOnClickListener(this);
        }

        void bind(Attraction attraction) {
            name.setText(attraction.getName());
            image.setImageResource(attraction.getImage());
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Attraction attraction = attractions.get(position);
            getFragmentInfo(attraction);
        }
    }
}
