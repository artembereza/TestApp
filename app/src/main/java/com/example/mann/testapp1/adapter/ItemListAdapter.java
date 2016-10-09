package com.example.mann.testapp1.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mann.testapp1.DAO.Item;
import com.example.mann.testapp1.R;

import java.util.ArrayList;


public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ItemViewHolder> {

    private ArrayList<Item> data;
    private Context context;

    public ItemListAdapter(Context context, ArrayList<Item> data) {
        this.data = data;
        this.context = context;

    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.itemTitle.setText(data.get(position).getItemTitle());
        holder.itemStatus.setText(data.get(position).getItemStatus());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView itemTitle;
        TextView itemStatus;


        public ItemViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardView);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemStatus = (TextView) itemView.findViewById(R.id.item_status);

        }
    }
}
