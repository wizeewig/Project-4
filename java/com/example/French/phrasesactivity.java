package com.example.French;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class phrasesactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word("Greetings", "Les Salutations"));
        word.add(new Word("FGood Morning","Bonjour"));
        word.add(new Word("Good Afternoon","Bon Aprés-midi"));
        word.add(new Word("Good Evening", "Bonsoir"));
        word.add(new Word("Good Night","Bonne Nuit"));
        word.add(new Word("Goodbye","Au Revoir"));
        word.add(new Word("Nice to meet you","Enchanté"));
        word.add(new Word("Have a good day","Bonne journeé"));
        word.add(new Word("See you soon","À bientôt"));
        word.add(new Word("See you tomorrow","À demain"));
        word.add(new Word("See you very soon","À tout á l'heure"));
        word.add(new Word("Thank you very much","Merci beaucoup"));
        word.add(new Word("Welcome","Bienvenue!"));
        word.add(new Word("Excuse me","Excusez-moi"));
        word.add(new Word("Yes","Oui"));
        word.add(new Word("No","Non"));
        word.add(new Word("Congratulations","Félicitations"));
        word.add(new Word("I am sorry","Ja suis désolé"));
        WordAdapter adapter = new WordAdapter(this,word, R.color.category_phrases);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}