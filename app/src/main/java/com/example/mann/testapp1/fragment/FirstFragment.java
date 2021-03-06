package com.example.mann.testapp1.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mann.testapp1.DAO.Item;
import com.example.mann.testapp1.R;
import com.example.mann.testapp1.adapter.ItemListAdapter;

import java.util.ArrayList;

public class FirstFragment extends Fragment {


    private ArrayList<Item> itemList;

    public FirstFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_first, container, false);

        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_first_fragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        itemList = createItemsList();

        recyclerView.setAdapter(new ItemListAdapter(getContext(), createItemsList()));

        return viewGroup;
    }

    private ArrayList<Item> createItemsList() {

        ArrayList<Item> itemsList = new ArrayList<>();
        itemsList.add(new Item("Item 1", "Available"));
        itemsList.add(new Item("Item 2", "Available"));
        itemsList.add(new Item("Item 3", "Available"));


        return itemsList;
    }

}
