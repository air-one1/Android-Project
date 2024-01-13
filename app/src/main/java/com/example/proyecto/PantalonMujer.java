package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PantalonMujer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalon_mujer);
    }

    public void zaraweb(View view) {
        navegar("https://www.zara.com/es/es/jeans-z1975-mom-fit-p07223022.html?v1=311292706");
    }

    public void hmweb(View view) {
        navegar("https://www2.hm.com/es_es/productpage.1045459027.html");
    }

    private void navegar(String url) {
        Uri pagina = Uri.parse(url);
        Intent verWeb = new Intent(Intent.ACTION_VIEW, pagina);
        startActivity(verWeb);
    }
}