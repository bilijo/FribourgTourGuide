package com.example.android.fribourgtourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MountainsFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    // Create fragment and give it an argument specifying the item it should show
    public static MountainsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        MountainsFragment fragment = new MountainsFragment();
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

     // create a list of mountains item
        ArrayList<Mountains> mountainsArrayList = new ArrayList<>();
        mountainsArrayList.add(new Mountains(R.drawable.mountains_kaiseregg_240px,"ttt","gggg"));

    // Create an instance of MountainsAdapter class
        MountainsAdapter mountainsAdapter = new MountainsAdapter(getActivity(), mountainsArrayList);
// Into the layout list, populate listView with object
        ListView listMountainView = (ListView)view.findViewById(R.id.item_list);
        listMountainView.setAdapter(mountainsAdapter);
        return view;

    }
}
