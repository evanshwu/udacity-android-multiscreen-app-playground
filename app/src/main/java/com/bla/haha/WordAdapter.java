package com.bla.haha;

import android.app.Activity;
import android.graphics.Color;
import android.speech.tts.TextToSpeech;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class WordAdapter extends ArrayAdapter<Words> {
    public TextToSpeech t2s;

    public WordAdapter(Activity context, ArrayList<Words> wordsList){
        super(context, 0, wordsList);
        t2s = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR){
                    t2s.setLanguage(Locale.ENGLISH);
                }
            }
        });
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Create new View object
        View listedItemsView = convertView;
        if(listedItemsView==null){
            listedItemsView = LayoutInflater.from(getContext()).inflate(R.layout.listed_items, parent, false);
        }

        Words currentWords = getItem(position);

        final TextView subTextView = listedItemsView.findViewById(R.id.sub_text_item);
        subTextView.setText(currentWords.getSubWord());

        final TextView originTextView = listedItemsView.findViewById(R.id.origin_text_item);
        originTextView.setText(currentWords.getOriginWord());
        originTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2s.speak(originTextView.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        final ImageView iconImage = listedItemsView.findViewById(R.id.image_item);
        if(currentWords.hasImage()){
            iconImage.setImageResource(currentWords.getImageResId());
        }else{
            LinearLayout imageLinearLayout = listedItemsView.findViewById(R.id.imageLinearLayout);
            imageLinearLayout.setVisibility(View.GONE);
            iconImage.setVisibility(View.GONE);
        }

//        Random rnd = new Random();
//        listedItemsView.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

        return listedItemsView;
    }
}
