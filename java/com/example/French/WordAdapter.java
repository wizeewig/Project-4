package com.example.French;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    public WordAdapter(Activity context, ArrayList<Word>word, int ColorResourceId ){
        super(context,0, word);
        mColorResourceId=ColorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View listItemview= convertView;
       if (listItemview==null)
        {
            listItemview = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
       Word currword= getItem((position));

        TextView nameengtext=(TextView)listItemview.findViewById(R.id.default_text_view);
        nameengtext.setText(currword.getdefaulttranslation());

        TextView namemiwoktext=(TextView)listItemview.findViewById(R.id.miwok_text_view);
        namemiwoktext.setText(currword.getmiwoktranslation());

            ImageView image = (ImageView) listItemview.findViewById(R.id.imageshow);
        if(currword.hasimage()) {
            image.setImageResource(currword.getimageid());
            image.setVisibility(View.VISIBLE);
        }
        else
        {
            image.setVisibility(View.GONE);
        }

        View textContainer= listItemview.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor((color));
        return listItemview;
    }
}
