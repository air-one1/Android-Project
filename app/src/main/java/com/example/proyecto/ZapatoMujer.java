package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ZapatoMujer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zapato_mujer);
    }

    public void corteinglesweb1(View view) {
        navegar("https://www.elcorteingles.es/deportes/A14564918-zapatillas-casual-unisex-chuck-taylor-all-star-alta-lona-converse/?size=37%252C%252C37%252C5&parentCategoryId=999.53678013&color=Gris+oscuro");
    }

    public void corteinglesweb2(View view) {
        navegar("https://www.elcorteingles.es/moda-mujer/A47983645-botines-de-mujer-tipo-cowboy-en-piel-grabada-y-puntera-afilada/?parentCategoryId=999.39073041013&color=Negro");
    }

    private void navegar(String url) {
        Uri pagina = Uri.parse(url);
        Intent verWeb = new Intent(Intent.ACTION_VIEW, pagina);
        startActivity(verWeb);
    }
}