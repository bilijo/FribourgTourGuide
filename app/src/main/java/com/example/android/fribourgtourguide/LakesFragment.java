package com.example.android.fribourgtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LakesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Add the view to inflate
        View view = inflater.inflate(R.layout.activity_page_fragment, container, false);

        // create a list of lakes item
        ArrayList<Lakes> lakesArrayList = new ArrayList<>();
        lakesArrayList.add(new Lakes(R.drawable.lac_murten, getString(R.string.txt_lacMorat_name), getString(R.string.txt_lacMorat_adress)));
        lakesArrayList.add(new Lakes(R.drawable.lac_de_gruyere, getString(R.string.txt_lacdegruyere_name), getString(R.string.txt_lacdegruyere_adress)));
        lakesArrayList.add(new Lakes(R.drawable.lac_noir, getString(R.string.txt_lacNoir_name), getString(R.string.txt_lacNoir_adress)));
        lakesArrayList.add(new Lakes(R.drawable.lac_schiffenen, getString(R.string.txt_lacschiffenen_name), getString(R.string.txt_lacschiffenen_adress)));
        // Create an instance of LakesAdapter class
        LakesAdapter lakesAdapter = new LakesAdapter(getActivity(), lakesArrayList);

        // Into the layout list, populate listView with object
        ListView listLakesView = (ListView) view.findViewById(R.id.item_list);
        listLakesView.setAdapter(lakesAdapter);
        return view;

    }
}
