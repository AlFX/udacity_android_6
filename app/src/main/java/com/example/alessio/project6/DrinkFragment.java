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
        places.add(new Place(getString(R.string.imo_name), getString(R.string.imo_address), getString(R.string.imo_description), R.drawable.imo));
        places.add(new Place(getString(R.string.britannia_name), getString(R.string.britannia_address), getString(R.string.britannia_description), R.drawable.britannia));
        places.add(new Place(getString(R.string.lepre_name), getString(R.string.lepre_address), getString(R.string.lepre_description), R.drawable.lepre));
        places.add(new Place(getString(R.string.nuccio_name), getString(R.string.nuccio_address), getString(R.string.nuccio_description), R.drawable.nuccio));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
