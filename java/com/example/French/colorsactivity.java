package com.example.French;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colorsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word("Red", "Le Rouge",R.drawable.red));
        word.add(new Word("Yellow","Le Jaune",R.drawable.yellow));
        word.add(new Word("Blue","Le Bleu",R.drawable.blue));
        word.add(new Word("Black", "Le Noir",R.drawable.black));
        word.add(new Word("White","Le Blanc",R.drawable.white));
        word.add(new Word("Green","Le Vert",R.drawable.green));
        word.add(new Word("Orange","L'Orange",R.drawable.orange));
        word.add(new Word("Grey","Le Gris",R.drawable.grey));
        word.add(new Word("Pink","Le Rose",R.drawable.pink));
        word.add(new Word("Silver","L'Argent",R.drawable.silver));
        word.add(new Word("Gold","L'Or",R.drawable.gold));
        word.add(new Word("Brown","L'Marron",R.drawable.maroon));
        word.add(new Word("Violet","Le Violet",R.drawable.violet));
        word.add(new Word("Purple","Le Pourpre",R.drawable.purple));
        WordAdapter adapter = new WordAdapter(this,word,R.color.category_colors);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}