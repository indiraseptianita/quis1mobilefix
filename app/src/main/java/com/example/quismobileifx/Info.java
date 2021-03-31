package com.example.quismobileifx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
    }

    public void finish(View view) {
        finish();
    }

    public void tryExit(View view) {
        MainActivity.tryExit(this);
    }
}