package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ChaquetaMujer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaqueta_mujer);
    }

    public void zaraweb2(View view) {
        navegar("https://www.zara.com/es/es/cazadora-corta-doble-faz-p08073235.html?v1=324598113&v2=2352724");
    }

    public void mangoweb(View view) {
        navegar("https://shop.mango.com/es/mujer/chaquetas-y-americanas-chaquetas/chaqueta-borreguito-efecto-vintage_57097711.html");
    }

    private void navegar(String url) {
        Uri pagina = Uri.parse(url);
        Intent verWeb = new Intent(Intent.ACTION_VIEW, pagina);
        startActivity(verWeb);
    }
}