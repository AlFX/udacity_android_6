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
        places.add(new Place(getString(R.string.virgo_name), getString(R.string.virgo_address), getString(R.string.virgo_description), R.drawable.virgo));
        places.add(new Place(getString(R.string.banano_name), getString(R.string.banano_address), getString(R.string.banano_description), R.drawable.banano));
        places.add(new Place(getString(R.string.mako_name), getString(R.string.mako_address), getString(R.string.mako_description), R.drawable.mako));
        places.add(new Place(getString(R.string.estoril_name), getString(R.string.estoril_address), getString(R.string.estoril_description), R.drawable.estoril));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }

}
