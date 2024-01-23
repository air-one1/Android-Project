package com.example.proyecto;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class camisetaa_hombre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camisetaa_hombre);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(camisetaa_hombre.this, MainActivity2.class);
                        startActivity(intent);
                        return true;
                    case R.id.settings:
                        Intent intent2 = new Intent(camisetaa_hombre.this, Ajustes.class);
                        startActivity(intent2);
                        return true;
                    case R.id.profil:
                        Intent intent3 = new Intent(camisetaa_hombre.this, Usuario.class);
                        startActivity(intent3);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }
    private void navegar(String url) {
        Uri pagina = Uri.parse(url);
        Intent verWeb = new Intent(Intent.ACTION_VIEW, pagina);
        startActivity(verWeb);
    }
    public void  camisetaTNF(View view) {
        navegar("https://www.elcorteingles.es/deportes/MP_0538405_NF0A2TX5JK3-camiseta-de-hombre-simple-dome-the-north-face/?gad_source=1&gclid=EAIaIQobChMI-pDelsXzgwMV10JBAh3EEANaEAkYBCABEgLcHPD_BwE&gclsrc=aw.ds");
    }
    public void camisetaNECI(View view) {
        navegar("https://www.elcorteingles.es/moda-hombre/A36005436-camiseta-de-hombre-de-manga-corta/?gad_source=1&gclid=EAIaIQobChMI-pDelsXzgwMV10JBAh3EEANaEAQYAyABEgKG4_D_BwE&acs_info=ZmluYWxfdXJsOiAiaHR0cHM6Ly93d3cuZWxjb3J0ZWluZ2xlcy5lcy9jcHRyYWNrIgo&gclsrc=aw.ds&color=Negro");
    }
    public void camisetaECI(View view) {
        navegar("https://www.elcorteingles.es/moda-hombre-ahorra-comprando-2-rebajas/MP_0257360_3318520654-camiseta-de-hombre-termica-de-manga-corta-de-color-gris/");
    }
    public void camisetaHM(View view) {
        navegar("https://www2.hm.com/es_es/productpage.0685816053.html?gad_source=1&gclid=EAIaIQobChMIxrWe38fzgwMVLptQBh01cAHmEAQYASABEgLo_fD_BwE");
    }
}