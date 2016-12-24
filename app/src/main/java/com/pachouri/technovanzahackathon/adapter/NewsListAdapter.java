package com.pachouri.technovanzahackathon.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pachouri.technovanzahackathon.R;

/**
 * Created by ankit on 12/24/16.
 */

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsListViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;

    public NewsListAdapter(Context context) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public NewsListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.layout_item_row_news, parent, false);
        NewsListViewHolder viewHolder = new NewsListViewHolder(view);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onBindViewHolder(NewsListViewHolder holder, int position) {

    }

    public static class NewsListViewHolder extends RecyclerView.ViewHolder {
        public NewsListViewHolder(View itemView) {
            super(itemView);
        }
    }
}

