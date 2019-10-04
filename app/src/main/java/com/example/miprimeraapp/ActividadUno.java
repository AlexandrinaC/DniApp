package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActividadUno extends AppCompatActivity {

    //UNA CLASE CON EL CONSTRUCTOR, LOS GETTER Y LOS SETTER -> BEAN, POJO, MODELO, DTO
    public class Dni {


        public static final String SECUENCIA_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";


        //ATRIBUTOS
        //numero, letra
        private int numero;
        private char letra;

        //MÉTODOS



        public Dni(int numero, char letra) {
            this.numero = numero;
            this.letra = letra;
        }

        public Dni(int numero) {
            this.numero = numero;
        }

        public Dni ()
        {
            //constructor por defecto
        }

        //MÉTODOS DE ACCESO GET SET

        public int getNumero() {
            return this.numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public char getLetra() {
            return this.letra;
        }

        public void setLetra(char letra) {
            this.letra = letra;
        }

        // quÉ PUEDO HACER CON OBJETOS DE ESTA CLASE
        // calcularLetra
        public char calcularLetra ()
        {
            char letra = '0';
            int resto = -1;

            resto = this.numero%23;
            letra = SECUENCIA_DNI.charAt(resto);

            return letra;
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_uno);




        Intent intent = null; //Se le da un valor inicial a intent.
        intent = new Intent(this,ActividadDos.class);
        intent.putExtra("LETRA", 'A'); //Pongo que de la palabra LETRA, me coja la A.
        startActivity(intent);



    }
}
