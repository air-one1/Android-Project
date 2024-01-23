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

public class zapato_hombree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zapato_hombree);
        @SuppressLint("MissingInflatedId") BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(zapato_hombree.this, MainActivity2.class);
                        startActivity(intent);
                        return true;
                    case R.id.settings:
                        Intent intent2 = new Intent(zapato_hombree.this, Ajustes.class);
                        startActivity(intent2);
                        return true;
                    case R.id.profil:
                        Intent intent3 = new Intent(zapato_hombree.this, Usuario.class);
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
    public void zapatoECI(View view) {
        navegar("https://www.elcorteingles.es/deportes/A37806852-zapatillas-casual-de-hombre-stan-smith-adidas-originals/");
    }
    public void zapatoFL(View view) {
        navegar("https://www.footlocker.es/es/product/~/314101996404.html?utm_source=google&utm_medium=cpc&utm_campaign=_1:es_2:performance_3:google_4:c_5:pmax+shopping_6:product_7:mix_8:always+on_9:multiple_10:na_16:%27(6-8)%27&gad_source=1&acs_info=ZmluYWxfdXJsOiAiaHR0cHM6Ly93d3cuZm9vdGxvY2tlci5lcy9lcy9wcm9kdWN0L34vMzE0MTAxOTk2NDA0Lmh0bWwiCg&gclid=EAIaIQobChMIxayjpdHzgwMVnFBBAh0jTAx_EAQYAyABEgLrDfD_BwE&gclsrc=aw.ds");
    }
    public void newbalanceFL(View view) {
        navegar("https://www.footlocker.es/es/product/~/314209138404.html?utm_source=google&utm_medium=cpc&utm_campaign=&gad_source=1&gclid=EAIaIQobChMIip3cz9LzgwMVAI5QBh2znQcsEAQYASABEgJQS_D_BwE&gclsrc=aw.ds");
    }
    public void newbalanceNB(View view) {
        navegar("https://www.newbalance.es/pd/530/MR530SG-D-085.html?cq_src=google_ads&cq_cmp=17431390231&cq_con=&cq_term=&cq_med=pla&cq_plac=&cq_net=x&cq_pos=&cq_plt=gp&gad_source=1&gclid=EAIaIQobChMIkcm3w-DzgwMVBp2DBx01wQs1EAQYASABEgKzM_D_BwE&gclsrc=aw.ds");
    }
}