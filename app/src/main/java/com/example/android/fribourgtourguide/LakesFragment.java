package com.example.android.fribourgtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LakesFragment extends Fragment {  
    public static final String ARG_PAGE = "PICTURE";

    // Store instance variables
    private int imageResource;
    private String title;
    private String height;

    // Create fragment and give it an argument specifying the item it should show
    public static LakesFragment newInstance(int imageResourceId, String vName, String vHeight) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, imageResourceId);
        args.putString("name", vName);
        args.putString("height", vHeight);

        LakesFragment fragment = new LakesFragment();
        fragment.setArguments(args);
        return fragment;
    }
    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // mPage = getArguments().getInt(ARG_PAGE);
        imageResource = getArguments().getInt(ARG_PAGE);
        title = getArguments().getString("name");
        height = getArguments().getString("height");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_page_fragment, container, false);

        // create a list of lakes item
        ArrayList<Lakes> lakesArrayList = new ArrayList<>();
        lakesArrayList.add(new Lakes(imageResource,title,height));

        // Create an instance of LakesAdapter class
        LakesAdapter lakesAdapter = new LakesAdapter(getActivity(), lakesArrayList);
// Into the layout list, populate listView with object
        ListView listLakesView = (ListView)view.findViewById(R.id.item_list);
        listLakesView.setAdapter(lakesAdapter);
        return view;

    }
}
