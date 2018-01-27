package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton uibelumtidur;
    ImageButton uibanguntidur;
    ImageButton uibelummakan;
    ImageButton uisudahmakan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uibelumtidur (View view) {
        Intent pindah1 = new Intent(getApplicationContext(),belumtidur.class);
        startActivity(pindah1);
    }

    public void uibanguntidur (View view) {
        Intent pindah2 = new Intent(getApplicationContext(),banguntidur.class);
        startActivity(pindah2);
    }

    public void uibelummakan (View view) {
        Intent pindah3 = new Intent(getApplicationContext(),belummakan.class);
        startActivity(pindah3);
    }

    public void uisudahmakan (View view) {
        Intent pindah4 = new Intent(getApplicationContext(),sudahmakan.class);
        startActivity(pindah4);
    }

}
