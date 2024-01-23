package com.example.proyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class pantalon_hombre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalon_hombre);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(pantalon_hombre.this, MainActivity2.class);
                        startActivity(intent);
                        return true;
                    case R.id.settings:
                        Intent intent2 = new Intent(pantalon_hombre.this, Ajustes.class);
                        startActivity(intent2);
                        return true;
                    case R.id.profil:
                        Intent intent3 = new Intent(pantalon_hombre.this, Usuario.class);
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
    public void elcortecargo(View view) {
        navegar("https://www.elcorteingles.es/moda-hombre/A48063006-pantalones-p-3-cargo-de-hombre/?parentCategoryId=999.39089846013&color=Negro");
    }
    public void hmcargo(View view) {
        navegar("https://www2.hm.com/es_es/productpage.1183062001.html?gad_source=1&gclid=EAIaIQobChMIx_2BoajygwMVnpFoCR0LJQm1EAQYBSABEgK0EfD_BwE");
    }
    public void pullandbearjean(View view) {
        navegar("https://www.pullandbear.com/es/jeans-baggy-l08686518?cS=427&pelement=593528186");
    }
    public void bershkajean(View view) {
        navegar("https://www.bershka.com/es/jeans-baggy-c0p152025730.html?colorId=432&gad_source=1&gclid=EAIaIQobChMI8ry16ajygwMVB6x3Ch2jYgQiEAQYAiABEgITh_D_BwE");
    }
}