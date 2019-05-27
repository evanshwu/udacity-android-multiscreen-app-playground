package com.bla.haha;

import android.app.ActionBar;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        setTitle("Colors");

        ArrayList<Words> listOfWords = new ArrayList<Words>();
        listOfWords.add(new Words("Red", "紅"));
        listOfWords.add(new Words("Orange", "橙"));
        listOfWords.add(new Words("Yellow", "黃"));
        listOfWords.add(new Words("Green", "綠"));
        listOfWords.add(new Words("Blue", "藍"));
        listOfWords.add(new Words("Indigo", "靛"));
        listOfWords.add(new Words("Violet", "紫"));

        WordAdapter arrayAdapter = new WordAdapter(this, listOfWords);

        ListView colorList = findViewById(R.id.colorList);
        colorList.setAdapter(arrayAdapter);
    }
}
