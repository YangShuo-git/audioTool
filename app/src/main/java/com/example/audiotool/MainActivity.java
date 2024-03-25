package com.example.audiotool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = MainActivity.class.getName();
    private static final String AUDIO_PLAYER_ACTION_NAME = "com.example.audiotool.PlayerActivity";
    private static Context context;
    private AudioManager audioManager;
    private Intent intent = null;
    private Button backBtn = null;
    private Button playerBtn = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        audioManager = (AudioManager) getSystemService(context.AUDIO_SERVICE);

        ClickListener clickListener = new ClickListener();
        playerBtn = findViewById(R.id.btn_player);
        backBtn = findViewById(R.id.btn_back);

        playerBtn.setOnClickListener(clickListener);
        backBtn.setOnClickListener(clickListener);

        Log.d(TAG, "MainActivity onCreate.");
    }

    private class ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            switch (v.getId()) {
                case R.id.btn_player:
                    intent.setAction(AUDIO_PLAYER_ACTION_NAME);
                    startActivity(intent);
                    Log.i(TAG, "Start player activity!");
                    break;
                case R.id.btn_back:
                    Log.i(TAG, "Finish!");
                    finish();
                    break;
            }
        }
    }
}