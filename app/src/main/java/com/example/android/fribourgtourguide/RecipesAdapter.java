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

public class RecipesAdapter extends ArrayAdapter<Recipes> {

    private static final String LOG_TAG = RecipesAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     */
    public RecipesAdapter(@NonNull Context context, @NonNull ArrayList<Recipes> objects) {
        
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inaflte the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_recipes, parent, false);
        }

        // Get the {@link Recipes} object located at this position in the list
        Recipes currentRecipe = getItem(position);

        // Find the TextView in the list_recipes.xml layout with the ID text_recipe_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_recipe_name);
        // Get the  name from the current Recipes object and
        // set this text on the name TextView
        nameTextView.setText(currentRecipe != null ? currentRecipe.getRecipeName() : null);

        // Find the TextView in the list_recipes.xml layout with the ID text_recipe_infos
        TextView infosTextView = (TextView) listItemView.findViewById(R.id.text_recipe_infos);
        // Get the information from the current Recipes object and
        // set this text on the infos TextView
        infosTextView.setText(currentRecipe != null ? currentRecipe.getRecipeInfos() : null);

        // Find the TextView in the list_recipes.xml layout with the ID text_recipe_resto
        TextView restosTextView = (TextView) listItemView.findViewById(R.id.text_recipe_resto);
        // Get the information from the current Recipes object and
        // set this text on the restos TextView
        restosTextView.setText(currentRecipe != null ? currentRecipe.getRecipeRestos() : null);

        // Find the ImageView in the list_recipes.xml layout with the ID list_item_icon
        ImageView pictureView = (ImageView) listItemView.findViewById(R.id.list_item_picture);
        // Get the image resource ID from the current Recipes object and
        // set the image to iconView
        pictureView.setImageResource(currentRecipe != null ? currentRecipe.getImageResourceId() : 0);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}