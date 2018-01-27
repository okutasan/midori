package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class belummakan extends AppCompatActivity {
    Button buttonback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belummakan);
    }

    public void buttonback(View view) {
        Intent pindah = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(pindah);
    }
}
