package com.example.alessio.project6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.montallegro_name), getString(R.string.montallegro_address), getString(R.string.montallegro_description), R.drawable.montallegro));
        places.add(new Place(getString(R.string.brinca_name), getString(R.string.brinca_address), getString(R.string.brinca_description), R.drawable.brinca));
        places.add(new Place(getString(R.string.ruscin_name), getString(R.string.ruscin_address), getString(R.string.ruscin_description), R.drawable.ruscin));
        places.add(new Place(getString(R.string.baita_name), getString(R.string.baita_address), getString(R.string.baita_description), R.drawable.baita));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
