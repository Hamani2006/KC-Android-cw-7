package com.example.cw7;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter {
     List <Items> Itemlist;
    public ItemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        Itemlist = objects ;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View view = LayoutInflater.from(getContext()).inflate(R.layout.listview_row, parent, false);
        Items item = Itemlist.get(position);


        TextView Tv1 = view.findViewById(R.id.ItemNameTV);
        TextView Tv2 = view.findViewById(R.id.ItemPriceTV);
        ImageView IMG = view.findViewById(R.id.ItemImg);

        Tv1.setText(item.getItemName());
        IMG.setImageResource(item.getItemImage());
        Tv2.setText(String.valueOf(item.getItemPrice()));


        return view;


    }
}

