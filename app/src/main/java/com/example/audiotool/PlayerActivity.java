package com.example.audiotool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

import java.util.ArrayList;

public class PlayerActivity extends AppCompatActivity {
    private final static String TAG = PlayerActivity.class.getName();

    private Handler handler = null;

    private ServiceConnection serviceConnection = null;

    private Button backBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
    }
}