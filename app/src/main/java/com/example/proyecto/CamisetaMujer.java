package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CamisetaMujer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camiseta_mujer);
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