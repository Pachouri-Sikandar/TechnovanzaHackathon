package com.pachouri.technovanzahackathon.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pachouri.technovanzahackathon.R;

/**
 * Created by ankit on 12/24/16.
 */
public class MusicFragment extends Fragment {

    public MusicFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_music_fragment, container, false);
        return view;
    }

}