package com.example.proyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ChaquetaMujer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaqueta_mujer);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(ChaquetaMujer.this, MainActivity2.class);
                        startActivity(intent);
                        return true;
                    case R.id.settings:
                        Intent intent2 = new Intent(ChaquetaMujer.this, Ajustes.class);
                        startActivity(intent2);
                    default:
                        return false;
                }
            }
        });
    }

    public void mangochaquetaweb(View view) {
        navegar("https://shop.mango.com/es/mujer/chaquetas-y-americanas-chaquetas/chaqueta-borreguito-efecto-vintage_57097711.html");
    }

    public void zarachaquetaweb(View view) {
        navegar("https://www.zara.com/es/es/cazadora-corta-doble-faz-p08073235.html?v1=324598113&v2=2352724");
    }

    public void vilactiweb(View view) {
        navegar("https://www.elcorteingles.es/moda-mujer/A49259769-blazer-de-mujer-lentejuelas/?parentCategoryId=999.39090688013&color=Negro");
    }

    public void tintorettoctiweb(View view) {
        navegar("https://www.elcorteingles.es/moda-mujer/A47809242-chaqueta-corta-de-lentejuelas-mujer/?parentCategoryId=999.39090688013&color=Negro");
    }

    private void navegar(String url) {
        Uri pagina = Uri.parse(url);
        Intent verWeb = new Intent(Intent.ACTION_VIEW, pagina);
        startActivity(verWeb);
    }
}