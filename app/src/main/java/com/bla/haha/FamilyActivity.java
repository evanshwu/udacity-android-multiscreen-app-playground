package com.bla.haha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        setTitle("Family members");
        setTitleColor(R.color.colorBanner);

        ArrayList<Words> listOfWords = new ArrayList<Words>();
        listOfWords.add(new Words("father", "爸爸", R.drawable.family_father));
        listOfWords.add(new Words("mother", "媽媽", R.drawable.family_mother));
        listOfWords.add(new Words("son", "兒子", R.drawable.family_son));
        listOfWords.add(new Words("daughter", "女兒", R.drawable.family_daughter));
        listOfWords.add(new Words("grandmother", "阿罵", R.drawable.family_grandmother));
        listOfWords.add(new Words("grandfather", "阿公", R.drawable.family_grandfather));
        listOfWords.add(new Words("older brother", "大哥", R.drawable.family_older_brother));
        listOfWords.add(new Words("older sister", "大姊", R.drawable.family_older_sister));

        WordAdapter arrayAdapter = new WordAdapter(this, listOfWords);

        ListView familyList = findViewById(R.id.familyList);
        familyList.setAdapter(arrayAdapter);
    }
}
