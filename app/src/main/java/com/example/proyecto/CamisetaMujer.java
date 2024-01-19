package com.example.proyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CamisetaMujer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camiseta_mujer);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent1 = new Intent(CamisetaMujer.this, MainActivity2.class);
                        startActivity(intent1);
                        return true;
                    case R.id.settings:
                        Intent intent2 = new Intent(CamisetaMujer.this, Ajustes.class);
                        startActivity(intent2);
                    default:
                        return false;
                }
            }
        });
    }

    public void bershkaweb(View view) {
        navegar("https://www.bershka.com/es/camiseta-manga-corta-rib-c0p138883714.html?colorId=600");
    }

    public void pullweb(View view) {
        navegar("https://www.pullandbear.com/es/camiseta-manga-corta-tarot-l03241341?pelement=593527798&cS=807");
    }

    private void navegar(String url) {
        Uri pagina = Uri.parse(url);
        Intent verWeb = new Intent(Intent.ACTION_VIEW, pagina);
            startActivity(verWeb);
    }
}