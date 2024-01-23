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

public class chaquetaa_hombre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaquetaa_hombre);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(chaquetaa_hombre.this, MainActivity2.class);
                        startActivity(intent);
                        return true;
                    case R.id.settings:
                        Intent intent2 = new Intent(chaquetaa_hombre.this, Ajustes.class);
                        startActivity(intent2);
                        return true;
                    case R.id.profil:
                        Intent intent3 = new Intent(chaquetaa_hombre.this, Usuario.class);
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
    public void chaquetasprdy(View view) {
        navegar("https://www.superdry.es/homme/vestes/details/243092/chaqueta-acolchada-de-corte-cuadrado-con-capucha");
    }
    public void chaquetatnf(View view) {
        navegar("https://www.thenorthface.es/shop/es/tnf-es/chaqueta-plegable-1996-retro-nuptse-para-hombre-3c8d?variationId=LE4&gad_source=1&gclid=EAIaIQobChMIy67yjNjygwMVdJhQBh31zA7JEAQYBCABEgI75fD_BwE&gclsrc=aw.ds");
    }
    public void parkath(View view) {
        navegar("https://es.tommy.com/parka-rockie-th-warm-con-relleno-de-plum%C3%B3n-mw0mw32778gwj?utm_source=google&utm_medium=organic&utm_campaign=es_free-cpc-shopping&cmpid=ch:cpc|so:google|ca:|cr:|lb:18218670223|ag:|pi:&gad_source=1&gclid=EAIaIQobChMIg-rpn9fygwMVW5pQBh26eQxPEAQYAyABEgLPPfD_BwE&gclsrc=aw.ds");
    }
    public void parkatnf(View view) {
        navegar("https://www.thenorthface.es/shop/es/tnf-es/parka-artic-gore-tex-para-hombre-84i3");
    }
}