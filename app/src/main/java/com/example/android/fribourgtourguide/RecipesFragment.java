package com.example.android.fribourgtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RecipesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_page_fragment, container, false);

        // create a list of recipes item
        ArrayList<Recipes> recipesArrayList = new ArrayList<>();
        recipesArrayList.add(new Recipes(R.drawable.fondue_fribourg, getString(R.string.txt_recipeFondue_name),
                getString(R.string.txt_recipeFondue_info), getString(R.string.txt_recipeFondue_adress)));

        recipesArrayList.add(new Recipes(R.drawable.cuchaule, getString(R.string.txt_recipeCuchaule_name),
                getString(R.string.txt_recipeCuchaule_info), getString(R.string.txt_recipeCuchaule_adress)));

        recipesArrayList.add(new Recipes(R.drawable.gateau_du_vully, getString(R.string.txt_recipeGateauVully_name),
                getString(R.string.txt_recipeGateauVully_info), getString(R.string.txt_recipeGateauVully_adress)));

        recipesArrayList.add(new Recipes(R.drawable.roesti_singinois, getString(R.string.txt_recipeRosti_name),
                getString(R.string.txt_recipeRosti_info), getString(R.string.txt_recipeRosti_adress)));


        // Create an instance of RecipesAdapter class
        RecipesAdapter recipesAdapter = new RecipesAdapter(getActivity(), recipesArrayList);

        // Into the layout list, populate listView with object
        ListView listRecipesView = (ListView) view.findViewById(R.id.item_list);
        listRecipesView.setAdapter(recipesAdapter);
        return view;

    }
}
