package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityWoman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_woman);
    }

    public void pantalonMM(View view) {
        Intent intent = new Intent(this, PantalonMujer.class);
        startActivity(intent);
    }

    public void camisetaMM(View view) {
        Intent intent = new Intent(this, CamisetaMujer.class);
        startActivity(intent);
    }
    public void chaquetaMM(View view) {
        Intent intent = new Intent(this, ChaquetaMujer.class);
        startActivity(intent);
    }

    public void zapatoMM(View view) {
        Intent intent = new Intent(this, ZapatoMujer.class);
        startActivity(intent);
    }
}