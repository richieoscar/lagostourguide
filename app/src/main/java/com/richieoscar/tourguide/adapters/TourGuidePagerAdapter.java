package com.richieoscar.tourguide.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.richieoscar.tourguide.ui.AttractionsFragment;
import com.richieoscar.tourguide.ui.BeachesFragment;
import com.richieoscar.tourguide.ui.HotelsFragment;
import com.richieoscar.tourguide.ui.TheatreFragment;

public class TourGuidePagerAdapter extends FragmentPagerAdapter {

    private static final int COUNT = 4;

    public TourGuidePagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new TheatreFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new BeachesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Centres";
            case 1:
                return "Theatres";
            case 2:
                return "Hotels";
            case 3:
                return "Beaches";
            default:
                return super.getPageTitle(position);
        }
    }
}
