package com.pachouri.technovanzahackathon.fragment;

import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import com.pachouri.technovanzahackathon.R;
import com.pachouri.technovanzahackathon.activity.MainActivity;

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

        ImageView imageView = (ImageView) view.findViewById(R.id.iv_play);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Google Music");
                builder.setMessage("The Best Music Player since last 5 years");

                String positiveText = "Dismiss";
                builder.setPositiveButton(positiveText,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
/*
                String negativeText = getString(android.R.string.cancel);
                builder.setNegativeButton(negativeText,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // negative button logic
                            }
                        });*/

                AlertDialog dialog = builder.create();
                // display dialog
                dialog.show();
            }
        });

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
