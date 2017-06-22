package com.example.android.fribourgtourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/* Copyright (C) 2016 The Android Open Source Project
 * Used by dam on 22.06.2017.
 */

public class LakesAdapter extends ArrayAdapter<Lakes> {

    private static final String LOG_TAG = LakesAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     */
    public LakesAdapter(@NonNull Context context, @NonNull ArrayList<Lakes> objects) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        super(context, 0, objects);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_lakes, parent, false);
        }

        // Get the {@link Lakes} object located at this position in the list
        Lakes currentLake = getItem(position);

        // Find the TextView in the list_lakes.xml layout with the ID text_lake_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_lake_name);

        // Get the  name from the current Lakes object and
        // set this text on the name TextView
        nameTextView.setText(currentLake != null ? currentLake.getmLakeName() : null);

        // Find the TextView in the list_lakes.xml layout with the ID text_lake_infos
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.text_lake_infos);

        // Get the version number from the current Lakes object and
        // set this text on the number TextView
        numberTextView.setText(currentLake != null ? currentLake.getLakeInfos() : null);

        // Find the ImageView in the list_lakes.xml layout with the ID list_item_icon
        ImageView pictureView = (ImageView) listItemView.findViewById(R.id.list_item_picture);

        // Get the image resource ID from the current Lakes object and
        // set the image to iconView
        pictureView.setImageResource(currentLake != null ? currentLake.getImageResourceId() : 0);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}