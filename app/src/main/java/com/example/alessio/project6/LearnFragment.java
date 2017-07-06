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
        places.add(new Place("Università degli Studi di Genova - Engineering","Via Montallegro, 1","You could not care but you don't see an engineering department inside a XVI century italian villa everyday.", R.drawable.ingegneria));
        places.add(new Place("Museo di Storia Naturale Giacomo Doria","Via Brigata Liguria, 9","A nice early XX century building filled with naturalistic knowledge. Kind of dusty.", R.drawable.storianaturale));
        places.add(new Place("Osservatorio Astronomico del Righi","Via Mura delle Chiappe, 44","The place to go if you like astronomy. Lots of divulgative events, lovely little place run by friendly volunteers.", R.drawable.osservatorio));
        places.add(new Place("Sottomarino Nazario Sauro","Calata De Mari, 1","A diesel-powered submarine turned into a museum, yes, it will make your day.", R.drawable.sottomarino));
        places.add(new Place("Biblioteca Civica Lercari","Via S. Fruttuoso, 74","A public library inside XV century villa, inside a big park. What else?", R.drawable.lercari));
        places.add(new Place("Cimitero Monumentale di Staglieno","Piazzale Resasco","World-famous early XIX century cemetery. The Cure fans will love this.", R.drawable.staglieno));
        places.add(new Place("Via Garibaldi - già Strada Nuova","Via Garibaldi","Only renaissance nobility palaces here. UNESCO protected heritage or something like that.", R.drawable.garibaldi));

        /*Declare the adapter that associates Places with Fragments*/
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        /*Declare the ListView and associate it to its layout*/
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /*Associating listView to adapter is like telling adapter how to populate the listView*/
        listView.setAdapter(adapter);

        return rootView;
    }

}
