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
import java.util.List;

/* Copyright (C) 2016 The Android Open Source Project
 * Used by dam on 22.06.2017.
 */

public class MountainsAdapter extends ArrayAdapter<Mountains> {

    private static final String LOG_TAG = MountainsAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     */
    public MountainsAdapter(@NonNull Context context, @NonNull ArrayList<Mountains> objects) {
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
                    R.layout.list_mountains, parent, false);
        }

        // Get the {@link Mountains} object located at this position in the list
        Mountains currentMountain = getItem(position);

        // Find the TextView in the list_mountains.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);
        // Get the version name from the current Mountains object and
        // set this text on the name TextView
        nameTextView.setText(currentMountain != null ? currentMountain.getmMountainName() : null);

        // Find the TextView in the list_mountains.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);

        // Get the version number from the current Mountains object and
        // set this text on the number TextView
        numberTextView.setText(currentMountain != null ? currentMountain.getMountainHigh() : null);

        // Find the ImageView in the list_mountains.xml layout with the ID list_item_icon
        ImageView pictureView = (ImageView) listItemView.findViewById(R.id.list_item_picture);

        // Get the image resource ID from the current Mountains object and
        // set the image to iconView
        pictureView.setImageResource(currentMountain != null ? currentMountain.getImageResourceId() : 0);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}