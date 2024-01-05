package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void registrar(View view) {
            // Code à exécuter lors du clic sur le TextView
            Intent intent = new Intent(this, registrarse_actividad.class);
            startActivity(intent);
        }
    }

}