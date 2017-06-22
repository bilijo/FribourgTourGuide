package com.example.android.fribourgtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LakesFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    // Create fragment and give it an argument specifying the item it should show
    public static LakesFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        LakesFragment fragment = new LakesFragment();
        fragment.setArguments(args);
        return fragment;
    }
    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_page_fragment, container, false);

       /* TextView textView = (TextView) view;
        textView.setText("Fragment #" + mPage);
        return view; */

     // create a list of Lakes item
        ArrayList<Lakes> lakesArrayList = new ArrayList<>();
        lakesArrayList.add(new Lakes(R.drawable.lac_morat_240px,"ttt","gggg"));

    // Create an instance of LakesAdapter class
        LakesAdapter lakesAdapter = new LakesAdapter(getActivity(), lakesArrayList);
// Into the layout list, populate listView with object
        ListView listLakeView = (ListView)view.findViewById(R.id.item_list);
        listLakeView.setAdapter(lakesAdapter);
        return view;

    }
}
