package com.bla.haha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.SyncFailedException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitleColor(R.color.colorBanner);
        setTitle("Miwok");

        TextView colorText = findViewById(R.id.colorText);
        colorText.setText("Colors");
        colorText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorIntent = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(colorIntent);
            }
        });

        TextView phraseText = findViewById(R.id.phraseText);
        phraseText.setText("Phrases");
        phraseText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phraseIntent = new Intent(MainActivity.this, PhraseActivity.class);
                startActivity(phraseIntent);
            }
        });

        TextView familyText = findViewById(R.id.familyText);
        familyText.setText("Family members");
        familyText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyText = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyText);
            }
        });

        TextView numberText = findViewById(R.id.numberText);
        numberText.setText("Numbers");
        numberText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent numberIntent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(numberIntent);
            }
        });
    }
}
