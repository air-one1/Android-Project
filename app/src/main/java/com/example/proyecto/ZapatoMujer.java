package com.example.proyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ZapatoMujer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zapato_mujer);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(ZapatoMujer.this, MainActivity2.class);
                        startActivity(intent);
                        return true;
                    case R.id.settings:
                        Intent intent2 = new Intent(ZapatoMujer.this, Ajustes.class);
                        startActivity(intent2);
                    default:
                        return false;
                }
            }
        });
    }

    public void conversectiweb(View view) {
        navegar("https://www.elcorteingles.es/deportes/A48518491-zapatillas-casual-unisex-chuck-taylor-all-star-seasonal-color-alta-converse/?parentCategoryId=999.53663013&color=Marrón");
    }

    public void converselolaweb(View view) {
        navegar("https://lolarey.es/zapatillas-mujer/zapatilla-converse-fall-tone-a04559c-toad-50878_656736#/189-tallas-36/205-colores-beige");
    }

    public void unisactiweb(View view) {
        navegar("https://www.elcorteingles.es/moda-mujer/MP_0517524_WADIXPCR-botines-de-mujer-de-piel-con-puntera-cuadrada/?color=Negro&parentProduct=MP_0517524_WADIXPCR&parentCategoryId=999.39073041013");
    }

    public void unisaweb(View view) {
        navegar("https://www.unisa-europa.com/es-ES/wadix-pcr-8562");
    }

    private void navegar(String url) {
        Uri pagina = Uri.parse(url);
        Intent verWeb = new Intent(Intent.ACTION_VIEW, pagina);
        startActivity(verWeb);
    }
}