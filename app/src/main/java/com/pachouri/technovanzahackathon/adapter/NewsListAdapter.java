package com.pachouri.technovanzahackathon.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pachouri.technovanzahackathon.R;
import com.pachouri.technovanzahackathon.model.NewsListModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankit on 12/24/16.
 */

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsListViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<NewsListModel> newList = new ArrayList<>();

    public NewsListAdapter(Context context, List<NewsListModel> newList) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.newList = newList;
    }

    @Override
    public NewsListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.layout_item_row_news, parent, false);
        NewsListViewHolder viewHolder = new NewsListViewHolder(view);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return newList.size();
    }

    @Override
    public void onBindViewHolder(NewsListViewHolder holder, int position) {
        if (newList != null) {
            if (newList.size() > 0) {
                NewsListModel newsListModel = newList.get(position);
                holder.textViewName.setText(newsListModel.getName());
                holder.textViewTime.setText(newsListModel.getTime());
                holder.textViewCity.setText(newsListModel.getCity());
                holder.textViewDescription.setText(newsListModel.getDescription());
                holder.textViewComments.setText(newsListModel.getComments());
            }
        }
    }

    public static class NewsListViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewName;
        private TextView textViewCity;
        private TextView textViewTime;
        private TextView textViewDescription;
        private TextView textViewComments;

        public NewsListViewHolder(View itemView) {
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewCity = (TextView) itemView.findViewById(R.id.textViewCity);
            textViewTime = (TextView) itemView.findViewById(R.id.textViewTime);
            textViewDescription = (TextView) itemView.findViewById(R.id.textViewDescription);
            textViewComments = (TextView) itemView.findViewById(R.id.textViewComments);
        }
    }
}

