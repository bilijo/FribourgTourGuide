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
        museesArrayList.add(new Musees(getString(R.string.txt_museeGruyerien_name), getString(R.string.txt_museeGruyerien_adress)));
        museesArrayList.add(new Musees(getString(R.string.txt_museeHistoireNaturelle_name), getString(R.string.txt_museeHistoireNaturelle_adress)));
        museesArrayList.add(new Musees(getString(R.string.txt_maisonCailler_name), getString(R.string.txt_maisonCailler_adress)));
        museesArrayList.add(new Musees(getString(R.string.txt_maisonduGruyere_name), getString(R.string.txt_maisonduGruyere_adress)));
        museesArrayList.add(new Musees(getString(R.string.txt_museeMachineCoudre_name), getString(R.string.txt_museeMachineCoudre_adress)));
        // Create an instance of MuseesAdapter class
        MuseesAdapter museesAdapter = new MuseesAdapter(getActivity(), museesArrayList);

        // Into the layout list, populate listView with object
        ListView listMuseesView = (ListView) view.findViewById(R.id.item_list);
        listMuseesView.setAdapter(museesAdapter);
        return view;

    }
}
