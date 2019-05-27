package com.bla.haha;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Words> {

    public WordAdapter(Activity context, ArrayList<Words> wordsList){
        super(context, 0, wordsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Create new View object
        View listedItemsView = convertView;
        if(listedItemsView==null){
            listedItemsView = LayoutInflater.from(getContext()).inflate(R.layout.listed_items, parent, false);
        }

        Words currentWords = getItem(position);

        TextView subTextView = listedItemsView.findViewById(R.id.sub_text_item);
        subTextView.setText(currentWords.getSubWord());

        TextView orginTextView = listedItemsView.findViewById(R.id.origin_text_item);
        orginTextView.setText(currentWords.getOriginWord());



        return listedItemsView;
    }
}
