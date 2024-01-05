package com.example.proyecto;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.

 */
public class FragmentoRegistrarse extends Fragment {

    private EditText elCorreo;
    private EditText elNombre;
    private EditText laPassword;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_registrarse, container, false);
        elCorreo = view.findViewById(R.id.editTextTextEmailAddress);
        elNombre = view.findViewById(R.id.editTextText);
        laPassword = view.findViewById(R.id.editTextTextPassword);
        Button button1 = view.findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                registrarse(v);
            }
        });
        return view;
    }

    public void registrarse(View v) {
        registrarse_actividad admin = new registrarse_actividad(getContext(),
                "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String correo = elCorreo.getText().toString();
        String nombre = elNombre.getText().toString();
        String password = laPassword.getText().toString();
        ContentValues registro = new ContentValues();
        registro.put("correo", correo);
        registro.put("nombre", nombre);
        registro.put("password", password);
        bd.insert("lista", null, registro);
        bd.close();
        elCorreo.setText("");
        elNombre.setText("");
        laPassword.setText("");
        Toast.makeText(getContext(), "Datos almacenados",
                Toast.LENGTH_SHORT).show();
    }





}