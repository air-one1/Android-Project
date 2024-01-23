package com.example.proyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PantalonMujer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalon_mujer);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(PantalonMujer.this, MainActivity2.class);
                        startActivity(intent);
                        return true;
                    case R.id.settings:
                        Intent intent2 = new Intent(PantalonMujer.this, Ajustes.class);
                        startActivity(intent2);
                        return true;
                    case R.id.profil:
                        Intent intent3 = new Intent(PantalonMujer.this, Usuario.class);
                        startActivity(intent3);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    public void zarajeanweb(View view) {
        navegar("https://www.zara.com/es/es/jeans-z1975-mom-fit-p07223022.html?v1=311292706");
    }

    public void pulljeanweb(View view) {
        navegar("https://www.pullandbear.com/es/jeans-mom-comfort-l07686331?pelement=593540669&cS=407");
    }

    public void hmjeanweb(View view) {
        navegar("https://www2.hm.com/es_es/productpage.1045459027.html");
    }

    public void bershkajeanweb(View view) {
        navegar("https://www.bershka.com/es/jeans-90%C2%B4s-wide-c0p153259226.html?colorId=428&stylismId=2");
    }

    private void navegar(String url) {
        Uri pagina = Uri.parse(url);
        Intent verWeb = new Intent(Intent.ACTION_VIEW, pagina);
        startActivity(verWeb);
    }
}