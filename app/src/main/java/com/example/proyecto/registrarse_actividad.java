package com.example.proyecto;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class registrarse_actividad extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "nombre_de_la_base_de_datos";
    private static final int DATABASE_VERSION = 1;

    public registrarse_actividad(Context context, String administracion, Object o, int i) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE lista(correo TEXT PRIMARY KEY, nombre TEXT, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS lista");
        onCreate(db);
    }
}
