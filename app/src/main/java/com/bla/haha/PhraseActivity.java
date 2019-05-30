package com.bla.haha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);
        setTitle("Phrases");
        setTitleColor(R.color.colorBanner);

        ArrayList<Words> listOfWords = new ArrayList<Words>();
        listOfWords.add(new Words("Where are you going?", "你要去哪裡?"));
        listOfWords.add(new Words("What is your name?", "你的名字是?"));
        listOfWords.add(new Words("My name is...", "我的名字是..."));
        listOfWords.add(new Words("How are you feeling?", "你覺得怎麼樣?"));
        listOfWords.add(new Words("I'm feeling good.", "我現在很好。"));
        listOfWords.add(new Words("Are you coming?", "你要過來嗎?"));
        listOfWords.add(new Words("Let's go.", "我們走吧。"));

        WordAdapter arrayAdapter = new WordAdapter(this, listOfWords);

        ListView phraseList = findViewById(R.id.phraseList);
        phraseList.setAdapter(arrayAdapter);
    }
}
