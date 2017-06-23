package com.example.android.fribourgtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseesFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_page_fragment, container, false);

        // create a list of musees item
        ArrayList<Musees> museesArrayList = new ArrayList<>();
        museesArrayList.add(new Musees("Musée Gruyérien", "De juin à septembre, du mardi au samedi, le musée est ouvert non-stop, 10h-17h. "));
        museesArrayList.add(new Musees("Musée d'histoire naturelle", "Le musée d’histoire naturelle de Fribourg, en Suisse, est créé en 1823"));
        museesArrayList.add(new Musees("Maison Cailler, la chocolaterie ", "Do you dream of visiting a real chocolate factory? At Maison Cailler, we open the door for you to explore Cailler’s chocolate world. Experience with all your senses the secrets aroundthe origins and manufacturing of our chocolate. "));
        museesArrayList.add(new Musees("La Maison du Gruyère AOP", "Ouvert tous les jours, dernière entrée 30 min avant la fermeture\n" +
                "Juin à septembre: 9h00 à 18h30 | Octobre à mai: 9h00 à 18h00 "));
        museesArrayList.add(new Musees("Musée suisse de\n" +
                " la machine à coudre", "250 machines à coudre, 2000 objets insolites: visites guidées en français, allemand et anglais sur rendez-vous "));

        // Create an instance of MuseesAdapter class
        MuseesAdapter museesAdapter = new MuseesAdapter(getActivity(), museesArrayList);

        // Into the layout list, populate listView with object
        ListView listMuseesView = (ListView) view.findViewById(R.id.item_list);
        listMuseesView.setAdapter(museesAdapter);
        return view;

    }
}
