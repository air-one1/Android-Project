package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
    }

    public void registrar(View view) {
        Intent intent = new Intent(this, RegistrarActividad.class);
        startActivity(intent);
    }

    public void connecter(View view) {
        String email = editTextEmail.getText().toString().trim();
        String motDePasse = editTextPassword.getText().toString().trim();

        DatabaseHelper databaseHelper = new DatabaseHelper(this);

        if (databaseHelper.verifierUtilisateur(email, motDePasse)) {
            // Utilisateur trouvé dans la base de données, connexion réussie
            // Ajoutez ici le code pour rediriger vers l'activité suivante après une connexion réussie
            Toast.makeText(this, "¡Conectado!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        } else {
            // Aucun utilisateur trouvé dans la base de données, connexion échouée
            Toast.makeText(this, "Correo o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }

    }
}
