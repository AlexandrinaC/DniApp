package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ActividadDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_dos);
        Log.d("MIAPP", "Actividad 2");
        Intent intent = getIntent();
        char letra = intent.getCharExtra("LETRA",'0'); //Va a coger de Letra la A, pero, en caso de que no este presente esa letra, el valor que coge, es 0.
        Log.d("MIAPP", "Letra enviada " + letra);
    }
}
