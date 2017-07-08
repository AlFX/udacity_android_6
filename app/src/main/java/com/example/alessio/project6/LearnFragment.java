package com.example.alessio.project6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LearnFragment extends Fragment {


    public LearnFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /*Inflate the layout that will host the Places*/
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        /*Declare the ArrayList (variable array of objects)*/
        final ArrayList<Place> places = new ArrayList<>();

        /*populate it*/
        places.add(new Place(getString(R.string.ingegneria_name),getString(R.string.ingegneria_address),getString(R.string.ingegneria_description), R.drawable.ingegneria));
        places.add(new Place(getString(R.string.storianaturale_name),getString(R.string.storianaturale_address),getString(R.string.staglieno_description), R.drawable.storianaturale));
        places.add(new Place(getString(R.string.osservatorio_name),getString(R.string.osservatorio_address),getString(R.string.osservatorio_description), R.drawable.osservatorio));
        places.add(new Place(getString(R.string.sottomarino_name),getString(R.string.sottomarino_address),getString(R.string.sottomarino_description), R.drawable.sottomarino));
        places.add(new Place(getString(R.string.lercari_name),getString(R.string.lercari_address),getString(R.string.lercari_description), R.drawable.lercari));
        places.add(new Place(getString(R.string.staglieno_name),getString(R.string.staglieno_address),getString(R.string.staglieno_description), R.drawable.staglieno));
        places.add(new Place(getString(R.string.garibaldi_name),getString(R.string.garibaldi_address),getString(R.string.garibaldi_description), R.drawable.garibaldi));

        /*Declare the adapter that associates Places with Fragments*/
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        /*Declare the ListView and associate it to its layout*/
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /*Associating listView to adapter is like telling adapter how to populate the listView*/
        listView.setAdapter(adapter);

        return rootView;
    }

}
