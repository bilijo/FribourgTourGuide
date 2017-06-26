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
        mountainsArrayList.add(new Mountains(R.drawable.kaiseregg2,getString(R.string.txt_kaiseregg_name),getString(R.string.txt_kaiseregg_adress )));
        mountainsArrayList.add(new Mountains(R.drawable.mountains_vanilnoir,getString(R.string.txt_vanilNoir_name),getString(R.string.txt_vanilNoir_adress )));
        mountainsArrayList.add(new Mountains(R.drawable.mountains_dentderuth,getString(R.string.txt_dentderuth_name),getString(R.string.txt_dentderuth_adress)));
        mountainsArrayList.add(new Mountains(R.drawable.mountains_gastlosen,getString(R.string.txt_gastlosen_name),getString(R.string.txt_gastlosen_adress)));
    // Create an instance of MountainsAdapter class
        MountainsAdapter mountainsAdapter = new MountainsAdapter(getActivity(), mountainsArrayList);
// Into the layout list, populate listView with object
        ListView listMountainView = (ListView)view.findViewById(R.id.item_list);
        listMountainView.setAdapter(mountainsAdapter);
        return view;

    }
}
