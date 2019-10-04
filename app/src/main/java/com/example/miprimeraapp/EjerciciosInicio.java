package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class EjerciciosInicio extends AppCompatActivity {

    private char letra ='M';
    private String cadena = "ABCDEFG";


    private int suma (int n1, int n2)
    {
        int resultado = 0;

            resultado = n1+n2;

        return resultado;
    }


    // **Ejercicio 1** HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER PERTENECE A LA CADENA O NO




    public boolean buscarCaracterEnCadena(String cadena, char letra_buscada) {
        boolean encontrado = false;
        int i = 0;
        char letra_actual;

        while (i < cadena.length() && !encontrado) {
            letra_actual = cadena.charAt(i);
            encontrado = (letra_actual == letra_buscada);
            i = i + 1;//i++;
        }

        return encontrado;
    }

        // **Ejercicio 2**  HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA CUANTAS VECES APARECE ESE CARACTER EN LA CADENA
        public int buscarCaracterEnCadenaNVeces(String cadena, char letra_buscada){
            int neveces=0;
            int i = 0;
            char letra_actual;

            while (i < cadena.length())
            {
                letra_actual = cadena.charAt(i);//pillo la letra actual
                if (letra_actual==letra_buscada)
                {
                    neveces++;
                }
                i= i+1;//i++; ir al siguiente letra
            }

            return neveces;
        }





   /* public boolean buscar (){
        char letrita = 'A';
        String cadenita = "ABCAAADAA";
        int i = 0;
        Boolean encontrado = false;
        while (cadenita.length() > i && cadenita.charAt(i) != letrita);{
            ++i;
        }
        if (cadenita.charAt(i) == letrita){
            ++i;
            encontrado = true;
        }
        return encontrado;

    }*/


    //**Ejercicio 5**  HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA SI EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE
    private String clasificarNotaExamen(int notaExamen){
        String tipoDeNota = null;
       //int notaExamen = '8'; Al principio hay que declarar una variable con un valor inicial  = 0 o null, no darle un valor en concreto porque si no, para otros casos ya no funciona;

           if (notaExamen>0 && notaExamen < 5){
               tipoDeNota = "Suspenso";
            }

           else if (notaExamen>= 5 && notaExamen < 6){
               tipoDeNota = "Aprobado";
           }
           else if (notaExamen>=6 && notaExamen < 8){
               tipoDeNota = "Bien";
           }
           else if (notaExamen>= 8 && notaExamen < 9){
               tipoDeNota = "Notable";
           }
           else {
               tipoDeNota = "Sobresaliente";
           }
            Log.d("miapp", "Busca pertenece = " + tipoDeNota);

           return tipoDeNota;

    }

    //**Ejercicio 4** HACER UN MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE EDAD O NO


    public void mayorDeEdad (int edadUsuario) {

        if (edadUsuario >= 18) {
            Log.d("MIAPP", "Mayor de edad");
        } else {
            Log.d("MIAPP", "Menor de edad");
        }

    }

    //**Ejercicio 3**  HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO

    public boolean numeroPArImoar( int numerito) {
        boolean es_par = false;

        if (numerito % 2 == 0) {
            Log.d("MIAPP", "Numerito par");
            es_par = true;

        } else {
            Log.d("MIAPP", "Numerito impar");
            es_par = false;
        }
        // es_par = (numerito % 2 == 0);

        return es_par;

    }

    //**Ejercicio 7** HACER UN PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99

    private void mostrarSecuenciaFor()
    {
        for (int i = 3; i <= 99; i = i +3)
        {
            Log.d("MIAPP", i+"");
        }
    }

    //TODO Mostrar secuencia usando While y DoWhile
    //e invocar a todos los métodos para comprobar su correcto funcionamiento

    private void mostrarSecuenciaWhile()
    {
        int i = 0;
        while (i < 99 )
        {
            i=i + 3;

            Log.d("MIAPP", i+"");
        }

    }

    private void mostrarSecuenciaDowhile()
    {
        int i = 0;
        do {
            i = i+3;

            Log.d("MIAPP", i+"");
        }
        while (i< 99);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("miapp", "inicio de la app");//debiug menssajes informativos
        //Log.e("miapp", "ha ocurrido un error");//error para mensajes de error
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica_basica);
        //invocación
        int calculo = suma(3,5);
        Log.d("miapp", "Resultado calculo = " + calculo);
        boolean resultado = buscarCaracterEnCadena("Cadena", 'M');
        Log.d("miapp", "Busca pertenece = " + resultado);

        mostrarSecuenciaFor();

        int nveces = buscarCaracterEnCadenaNVeces("VALENTINO", 'L');
        Log.d("miapp", "L aparece = " + nveces + " veces");


        int notaExamen = 9;
        String siAprueba = clasificarNotaExamen(notaExamen);
        Log.d("miapp", "Clasificación obtenida = " + siAprueba);


        int edadUsuario = 23;
        mayorDeEdad(edadUsuario);

        mostrarSecuenciaWhile();

        mostrarSecuenciaDowhile();



    }
}
