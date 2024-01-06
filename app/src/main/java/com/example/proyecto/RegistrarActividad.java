package com.example.proyecto;
import com.example.proyecto.DatabaseHelper;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class RegistrarActividad extends AppCompatActivity {

    private EditText elCorreo;
    private EditText elNombre;
    private EditText laPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_actividad);

        elCorreo = findViewById(R.id.editTextTextEmailAddress);
        elNombre = findViewById(R.id.editTextText);
        laPassword = findViewById(R.id.editTextTextPassword);

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Appeler la méthode pour ajouter l'utilisateur à la base de données
                ajouterUtilisateur();
            }
        });
    }

    private void ajouterUtilisateur() {
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        String correo = elCorreo.getText().toString();
        String nombre = elNombre.getText().toString();
        String password = laPassword.getText().toString();

        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.COLUMN_CORREO, correo);
        values.put(DatabaseHelper.COLUMN_NOMBRE, nombre);
        values.put(DatabaseHelper.COLUMN_PASSWORD, password);

        long newRowId = db.insert(DatabaseHelper.TABLE_NAME, null, values);

        if (newRowId != -1) {
            Toast.makeText(this, "Utilisateur ajouté avec succès!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Erreur lors de l'ajout de l'utilisateur", Toast.LENGTH_SHORT).show();
        }

        db.close();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
