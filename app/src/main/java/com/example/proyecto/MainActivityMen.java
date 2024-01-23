package com.example.proyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.MenuItem;

import android.os.Bundle;
import android.view.View;

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
                        return true;
                    case R.id.profil:
                        Intent intent3 = new Intent(MainActivityMen.this, Usuario.class);
                        startActivity(intent3);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }
    public void pantalonH(View view) {
        Intent intent = new Intent(this, pantalon_hombre.class);
        startActivity(intent);
    }
    public void chaquetaH(View view) {
        Intent intent = new Intent(this, chaquetaa_hombre.class);
        startActivity(intent);
    }
    public void camisetaH(View view) {
        Intent intent = new Intent(this, camisetaa_hombre.class);
        startActivity(intent);
    }
    public void zapatoH(View view) {
        Intent intent = new Intent(this, zapato_hombree.class);
        startActivity(intent);
    }
}