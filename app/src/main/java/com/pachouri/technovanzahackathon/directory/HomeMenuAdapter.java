package com.pachouri.technovanzahackathon.directory;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.pachouri.technovanzahackathon.R;
import com.pachouri.technovanzahackathon.widgets.AppTextView;

import java.util.ArrayList;

public class HomeMenuAdapter extends RecyclerView.Adapter<HomeMenuAdapter.ViewHolder> {

    ArrayList<String> menuString;
    ArrayList<Integer> menuImage;
    Context context;

    public HomeMenuAdapter(Context context, ArrayList<String> menuString,ArrayList<Integer> menuImage){
        this.context=context;
        this.menuImage=menuImage;
        this.menuString=menuString;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_menu,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.appTextView.setText(menuString.get(position));
        holder.imageView.setImageResource(menuImage.get(position));
    }

    @Override
    public int getItemCount() {
        return menuImage.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public AppTextView appTextView;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
        }

    }
}
