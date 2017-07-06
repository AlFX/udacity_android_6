package com.example.alessio.project6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HaveFunFragment extends Fragment {


    public HaveFunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Virgo Discoclub", "Via Carzino, 13r", "Great dance club, great parties, gay-friendly, a must-go.", R.drawable.virgo));
        places.add(new Place("Banano Tsunami", "Porto Antico, Ponte Embriaco", "A dance lounge built on top of a floating platform within Genoa harbor, fancy.", R.drawable.banano));
        places.add(new Place("Makò", "Corso Italia, 28r", "To be honest, you will just find boring posh people there but if your purpose is showing off this is the place to go.", R.drawable.mako));
        places.add(new Place("Estoril", "Corso Italia, 7D", "Same as above but at least there are a restaurant and a beach.", R.drawable.estoril));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }

}
