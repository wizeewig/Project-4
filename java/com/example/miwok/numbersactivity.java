package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class numbersactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbersactivity);
      ArrayList <String> word= new ArrayList<>();
      word.add("One");
        word.add("Two");
        word.add("Three");
        word.add("Four");
        word.add("Five");
        word.add("Six");
        word.add("Seven");
        word.add("Eight");
        word.add("Nine");
        word.add("Ten");
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,word);
        ListView listview =(ListView) findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
    }
}