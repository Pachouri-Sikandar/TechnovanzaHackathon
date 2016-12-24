package com.pachouri.technovanzahackathon.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pachouri.technovanzahackathon.R;
import com.pachouri.technovanzahackathon.adapter.NewsListAdapter;
import com.pachouri.technovanzahackathon.model.NewsListModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankit on 12/24/16.
 */
public class NewsFragment extends Fragment {
    private Context attachContext;
    private RecyclerView recyclerViewNews;

    public NewsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_news_fragment, container, false);
        initView(view);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        attachContext = context;
    }

    @Override
    public void onDestroyView() {
        attachContext = null;
        super.onDestroyView();
    }

    private void initView(View view) {
        recyclerViewNews = (RecyclerView) view.findViewById(R.id.recyclerViewNews);
        initialiseAdapter();
    }

    private void initialiseAdapter() {
        List<NewsListModel> newsList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            NewsListModel newsListModel = new NewsListModel("Android Nougat", "August 2016", "7" +
                    ".0", "Android 7.0–7.1.1 Nougat (codenamed Android N during development)[4] " +
                    "is the seventh major version of the Android operating system. First released" +
                    " as a beta build on March 9, 2016,[5] it was officially released on August " +
                    "22, 2016, with Nexus devices being the first to receive the update, though the LG V20 was the first new smartphone released with Nougat. Nougat introduces notable changes to the operating system and its development platform, including the ability to display multiple apps on-screen at once in a split-screen view, support for inline replies to notifications, as well as an OpenJDK-based Java environment and support for the Vulkan graphics rendering API, and seamless system updates on supported devices.", "Latest release 7.1.1");
            newsList.add(newsListModel);
        }
        if (attachContext != null) {
            LinearLayoutManager manager = new LinearLayoutManager(attachContext);
            recyclerViewNews.setLayoutManager(manager);
            NewsListAdapter newsListAdapter = new NewsListAdapter(attachContext, newsList);
            recyclerViewNews.setAdapter(newsListAdapter);
        }
    }
}
