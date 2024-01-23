package com.example.proyecto;

// Ajustes.java
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Locale;

public class Ajustes extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes); // Ajoutez cette ligne

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(Ajustes.this, MainActivity2.class);
                        startActivity(intent);
                        return true;
                    case R.id.settings:
                        Intent intent2 = new Intent(Ajustes.this, Usuario.class);
                        startActivity(intent2);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    public void enregistrerLangue(View view) {
        RadioGroup radioGroupLangue = findViewById(R.id.radioGroupLangue);
        int selectedId = radioGroupLangue.getCheckedRadioButtonId();

        if (selectedId == R.id.radioFrancais) {
            setLocale("fr");
        } else if (selectedId == R.id.radioEspagnol) {
            setLocale("es");
        }else if (selectedId == R.id.radioAnglais) {
            setLocale("en");
        }
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    private void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.setLocale(locale);
        getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());
        recreate(); //
    }
}
