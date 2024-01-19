package com.example.proyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.MenuItem;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivityMen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_men);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(MainActivityMen.this, MainActivity2.class);
                        startActivity(intent);
                        return true;
                    case R.id.settings:
                        Intent intent2 = new Intent(MainActivityMen.this, Ajustes.class);
                        startActivity(intent2);
                    default:
                        return false;
                }
            }
        });
    }
}