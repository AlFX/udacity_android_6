package com.example.alessio.project6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinkFragment extends Fragment {


    public DrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Bar Imo", "Piazza Attilio Firpo, 1", "The classic dirty ill-famed bar you shouldn't go to. Long drinks feel like gasoline.", R.drawable.imo));
        places.add(new Place("Britannia Pub", "Vico della Casana, 76", "Old fashioned fake-British pub, established in 1972. Kind of pricey, good bet if you really miss England.", R.drawable.britannia));
        places.add(new Place("La Lepre", "Piazza della Lepre, 5/r", "Hipster-favourite, friendly people and great fun. Especially enjoyable during summertime. Girls like it ;-)", R.drawable.lepre ));
        places.add(new Place("Bar delle Vigne (da Nuccio)", "Vico delle Vigne, 4", "The dear old, great place that everybody know and love in the old town. Not fancy at all, kind of working class boozer of choice.", R.drawable.nuccio));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
