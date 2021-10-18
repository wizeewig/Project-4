package com.example.French;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class numbersactivity extends AppCompatActivity {
private MediaPlayer mediaPlayer;
    private MediaPlayer media;
    private AudioManager maudmanager;
    AudioManager.OnAudioFocusChangeListener afChangeListener=new AudioManager.OnAudioFocusChangeListener(){
        @Override
        public void onAudioFocusChange(int focuschange) {
            if (focuschange ==  AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focuschange ==  AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                media.pause();
                media.seekTo(0);
            } else if (focuschange == AudioManager.AUDIOFOCUS_GAIN) {
                media.start();
            } else if (focuschange == AudioManager.AUDIOFOCUS_LOSS) {
              mediaplayerrelease();
            }
        
            }
        };
            
    private MediaPlayer.OnCompletionListener comlistener= new MediaPlayer.OnCompletionListener(){
        @Override
        public void onCompletion(MediaPlayer mp) {
            mediaplayerrelease();
        }
    };
    private ComponentName RemoteControlReciever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        maudmanager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);
        final ArrayList<Word> word = new ArrayList<Word>();
        word.add(new Word("One", "Un", R.drawable.oneapple, R.raw.aud));
        word.add(new Word("Two", "Deux", R.drawable.twoapples));
        word.add(new Word("Three", "Trois", R.drawable.threeapples));
        word.add(new Word("Four", "Quatre", R.drawable.fourapples));
        word.add(new Word("Five", "Cing", R.drawable.fiveapples));
        word.add(new Word("Six", "Six", R.drawable.six));
        word.add(new Word("Seven", "Sept", R.drawable.seven));
        word.add(new Word("Eight", "Heut", R.drawable.eight));
        word.add(new Word("Nine", "Neuf", R.drawable.nine));
        word.add(new Word("Ten", "Dix", R.drawable.tenapples));
        WordAdapter adapter = new WordAdapter(this, word, R.color.category_numbers);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @NonNull

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word worrd = word.get(position);
                mediaplayerrelease();
                int result = maudmanager.requestAudioFocus(afChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    maudmanager.registerMediaButtonEventReceiver(RemoteControlReciever);
                
                mediaPlayer = MediaPlayer.create(numbersactivity.this, worrd.getaudresid());
                mediaPlayer.start();
                media.setOnCompletionListener(comlistener);
            }
            }
        });
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        mediaplayerrelease();
    }

           private void mediaplayerrelease() {
        
            if( media!=null)
            {media.release();
            media=null;
            maudmanager.abandonAudioFocus(afChangeListener);
            }
        }

}
        
