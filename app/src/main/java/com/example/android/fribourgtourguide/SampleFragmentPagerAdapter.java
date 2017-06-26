package com.example.android.fribourgtourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ArrayAdapter;
import android.widget.Toast;


/**
 * Created by dam on 21.06.2017.
 */

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    String tabTitles[] = new String[]{};
    private Context context;
    //private String tabTitles[] = new String[]{"Mountains", "Lakes", "Musees", "Recipes"};


    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
           tabTitles = new String[]{context.getString(R.string.tab_title_mountains),
                   context.getString(R.string.tab_title_lakes),context.getString(R.string.tab_title_musees),
                   context.getString(R.string.tab_title_recipes)};

    }

    // Returns total number of tabs (pages)
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: // Fragment # 0 - This will show MountainsFragment
                return new MountainsFragment();
            case 1: // Fragment # 1 - This will show LakesFragment
                return new LakesFragment();
            case 2: // Fragment # 2- This will show MuseesFragment
                return new MuseesFragment();
            case 3: // Fragment # 3- This will show RecipesFragment
                return new RecipesFragment();
            default:
                return new RecipesFragment();
        }

    }


    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}

