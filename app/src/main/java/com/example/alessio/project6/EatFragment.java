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
        places.add(new Place("Montallegro", "via Mura delle Chiappe 30r", "Traditional Genovese pizza and focaccia, with a great landscape on the bay. Established in 1913.", R.drawable.montallegro));
        places.add(new Place("La Brinca", "Via Campo di Ne 58, Chiavari", "Premium traditional Genovese food surrounded by countryside and vineyards.", R.drawable.brinca));
        places.add(new Place("Ruscin", "Salita Sella, 198", "If you live in Genoa, you are just a couple of minutes away by drive from the best fried food in the region. Friendly staff.", R.drawable.ruscin));
        places.add(new Place("La Baita", "Via Alpini d' Italia, 8, Recco", "After a day at the beach, why not having some excellent handmade food on the hills?", R.drawable.baita));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
