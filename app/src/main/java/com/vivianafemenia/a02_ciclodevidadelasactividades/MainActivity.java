package com.vivianafemenia.a02_ciclodevidadelasactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("ESTADOS","1 - ESTOR EN onDetroy");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e("ESTADOS","1 - ESTOR EN onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","1 - ESTOR EN onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","1 - ESTOR EN onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","1 - ESTOR EN onStar");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("ESTADOS","1 - ESTOR EN ONCREATE");
    }
}