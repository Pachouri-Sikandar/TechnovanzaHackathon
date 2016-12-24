package com.pachouri.technovanzahackathon.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import com.pachouri.technovanzahackathon.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankit on 12/24/16.
 */
public class MusicFragment extends Fragment {

    public MusicFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_music_fragment, container, false);

        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);

        setSpinner(spinner);
        return view;
    }

    private void setSpinner(Spinner spinner){

        List<String> categories = new ArrayList<String>();
        categories.add("Games");
        categories.add("Application");
        categories.add("Movies");
        categories.add("Books");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(),R.layout.simple_layout, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

}
