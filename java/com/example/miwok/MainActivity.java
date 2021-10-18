package com.example.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView numbers =(TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener((android.view.View.OnClickListener) v -> {
            Intent intent = new Intent(v.getContext(), numbersactivity.class);
            startActivity(intent);

        });
        TextView family = findViewById(R.id.family);
        family.setOnClickListener((android.view.View.OnClickListener) v -> {
            Intent intent = new Intent(v.getContext(), familyactivity.class);
            startActivity(intent);
        });
        TextView phrases = findViewById(R.id.phrases);
        phrases.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), phrasesactivity.class);
            startActivity(intent);
        });
        TextView colors = findViewById(R.id.colors);
        colors.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), colorsactivity.class);
            startActivity(intent);
        });
    }


}