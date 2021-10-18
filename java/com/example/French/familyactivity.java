package com.example.French;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class familyactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word("Father", "Pére"));
        word.add(new Word("Mother","Mére"));
        word.add(new Word("Grandfather","Grand-pére"));
        word.add(new Word("Grandmother", "Grand-mére"));
        word.add(new Word("Grandson","Petit filsly"));
        word.add(new Word("Granddaughter","Petite fille"));
        word.add(new Word("Grandparents","grands-parents"));
        word.add(new Word("Grandchildren","Petits enfants"));
        word.add(new Word("Brother","Frére"));
        word.add(new Word("Sister","Sceur"));
        word.add(new Word("Son","Fils"));
        word.add(new Word("Daughter","Fille"));
        word.add(new Word("Uncle","Oncle"));
        word.add(new Word("Aunt","Tante"));
        word.add(new Word("Nephew","Neveu"));
        word.add(new Word("Niece","Niéce"));
        WordAdapter adapter = new WordAdapter(this,word,R.color.category_family);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}