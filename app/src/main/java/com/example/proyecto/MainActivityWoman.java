package com.example.proyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivityWoman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_woman);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(MainActivityWoman.this, MainActivity2.class);
                        startActivity(intent);
                        return true;
                    case R.id.settings:
                        Intent intent2 = new Intent(MainActivityWoman.this, Ajustes.class);
                        startActivity(intent2);
                        return true;
                    case R.id.profil:
                        Intent intent3 = new Intent(MainActivityWoman.this, Usuario.class);
                        startActivity(intent3);
                        return true;
                    default:
                        return false;
                }
            }
        });
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