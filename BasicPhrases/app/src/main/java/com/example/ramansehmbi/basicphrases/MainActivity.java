package com.example.ramansehmbi.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void playPhrase(View view)
    {
        Button buttonPressed =(Button) view;
        String buttonTag = buttonPressed.getTag().toString();
        Log.i("Tag", " THE BUTTON PRESSED IS --> " + buttonTag);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(buttonTag,"raw",getPackageName()));
        mediaPlayer.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
