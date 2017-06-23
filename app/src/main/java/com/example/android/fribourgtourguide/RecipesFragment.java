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
        recipesArrayList.add(new Recipes(R.drawable.fondue_fribourg, "Fondue moitié moitié",
                "Half Gruyère cheese, half Vacherin – that’s how you make a Fribourg fondue, Switzerland's favourite. Exactly why this warm \"cheese soup\" became our national dish is unclear.  "));
        recipesArrayList.add(new Recipes(R.drawable.cuchaule, "Cuchaule",
                "La cuchaule est un pain brioché originaire du canton de Fribourg. La base est une sorte de brioche au lait à laquelle est ajouté du safran, ce qui lui donne une couleur jaune "));
        recipesArrayList.add(new Recipes(R.drawable.gateau_du_vully, "Gâteau du Vully",
                "Half Gruyère cheese, half Vacherin – that’s how you make a Fribourg fondue, Switzerland's favourite. Exactly why this warm \"cheese soup\" became our national dish is unclear.  "));
        recipesArrayList.add(new Recipes(R.drawable.roesti_singinois, "Roesti à la Singinoise",
                "Cuire les pommes de terre le matin et laisser refroidir. Eplucher les pommes de terre et les râper avec une râpe à röstis. Mettre dans une poêle le saindoux ou un peu d’huile. Ajouter l'oignon, faire revenir doucement. Ajouter le lard et les pommes de terre,saler. Remuer plusieurs fois au début et ensuite laisser dorer de chaque côte. "));


        // Create an instance of RecipesAdapter class
        RecipesAdapter recipesAdapter = new RecipesAdapter(getActivity(), recipesArrayList);

        // Into the layout list, populate listView with object
        ListView listRecipesView = (ListView) view.findViewById(R.id.item_list);
        listRecipesView.setAdapter(recipesAdapter);
        return view;

    }
}
