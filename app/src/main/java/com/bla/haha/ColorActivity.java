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
        setTitleColor(R.color.colorBanner);

        ArrayList<Words> listOfWords = new ArrayList<Words>();

        listOfWords.add(new Words("Black", "黑", R.drawable.color_black));
        listOfWords.add(new Words("Brown", "咖啡", R.drawable.color_brown));
        listOfWords.add(new Words("Dusty yellow", "髒髒的黃", R.drawable.color_dusty_yellow));
        listOfWords.add(new Words("Gray", "灰", R.drawable.color_gray));
        listOfWords.add(new Words("Green", "綠", R.drawable.color_green));
        listOfWords.add(new Words("Mustard yellow", "芥末黃", R.drawable.color_mustard_yellow));
        listOfWords.add(new Words("Red", "紅", R.drawable.color_red));
        listOfWords.add(new Words("White", "白", R.drawable.color_white));

        WordAdapter arrayAdapter = new WordAdapter(this, listOfWords);

        ListView colorList = findViewById(R.id.colorList);
        colorList.setAdapter(arrayAdapter);
    }
}
