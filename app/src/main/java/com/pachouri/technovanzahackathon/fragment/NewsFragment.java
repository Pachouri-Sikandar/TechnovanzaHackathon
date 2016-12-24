package com.pachouri.technovanzahackathon.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pachouri.technovanzahackathon.R;

/**
 * Created by ankit on 12/24/16.
 */
public class NewsFragment extends Fragment {
    private RecyclerView recyclerViewNews;
    public NewsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_news_fragment, container, false);
        return view;
    }

    private void initView(View view){
        recyclerViewNews = (RecyclerView) view.findViewById(R.id.recyclerViewNews);
    }

    private void initialiseAdapter(){

    }
}
