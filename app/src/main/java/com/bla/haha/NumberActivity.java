package com.bla.haha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        setTitle("Numbers");
        setTitleColor(R.color.colorBanner);

        ArrayList<Words> listOfWords = new ArrayList<Words>();
        listOfWords.add(new Words("One", "1", R.drawable.number_one));
        listOfWords.add(new Words("Two", "2", R.drawable.number_two));
        listOfWords.add(new Words("Three", "3", R.drawable.number_three));
        listOfWords.add(new Words("Four", "4", R.drawable.number_four));
        listOfWords.add(new Words("Five", "5", R.drawable.number_five));
        listOfWords.add(new Words("Six", "6", R.drawable.number_six));
        listOfWords.add(new Words("Seven", "7", R.drawable.number_seven));
        listOfWords.add(new Words("Eight", "8", R.drawable.number_eight));
        listOfWords.add(new Words("Nine", "9", R.drawable.number_nine));
        listOfWords.add(new Words("Ten", "10", R.drawable.number_ten));

        WordAdapter arrayAdapter = new WordAdapter(this, listOfWords);

        ListView numberList = findViewById(R.id.numberList);
        numberList.setAdapter(arrayAdapter);
    }
}
