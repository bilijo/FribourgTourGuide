package com.example.android.fribourgtourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MountainsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_page_fragment, container, false);

     // create a list of mountains item
        ArrayList<Mountains> mountainsArrayList = new ArrayList<>();
        mountainsArrayList.add(new Mountains(R.drawable.kaiseregg2,"kaiseregg","Altitude : 2 185 m"));
        mountainsArrayList.add(new Mountains(R.drawable.mountains_vanilnoir,"kaiseregg","Altitude : 2 185 m"));

    // Create an instance of MountainsAdapter class
        MountainsAdapter mountainsAdapter = new MountainsAdapter(getActivity(), mountainsArrayList);
// Into the layout list, populate listView with object
        ListView listMountainView = (ListView)view.findViewById(R.id.item_list);
        listMountainView.setAdapter(mountainsAdapter);
        return view;

    }
}
