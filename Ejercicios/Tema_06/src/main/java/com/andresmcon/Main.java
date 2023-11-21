package com.andresmcon;

import com.andresmcon.Actividades.Actividad1;
import com.andresmcon.Actividades.Actividad2;
import com.andresmcon.Actividades.Actividad3;
import com.andresmcon.Actividades.Actividad4;

public class Main {
    public static void main(String[] args) {
        String palabra = "hola";

        System.out.println("Actividad 1:");
        Actividad1 mayus = new Actividad1();
        System.out.println(palabra + " = "+ mayus.primeraLetraMayus(palabra));

        System.out.println();

        System.out.println("Actividad 2:");
        Actividad2 vocaYCons = new Actividad2();
        System.out.println("la palabra " + palabra + " se compone de:" );
        vocaYCons.numVocConso(palabra);

        System.out.println();

        String frase = "Hola buenas tardes";

        System.out.println("Actividad 3:");
        Actividad3 contPalabras = new Actividad3();
        System.out.println("La frase tiene " + contPalabras.contPalabras(frase) + " palabras");

        System.out.println();

        System.out.println("Actividad 4:");
        Actividad4 contVoclsYCons = new Actividad4();
        String[] listaPalabras = frase.split("\\s+");
        for (String palabra1 : listaPalabras) {
            System.out.println(palabra1 + ": tiene un total de " + contVoclsYCons.contarVocales(palabra1) + " vocales y tiene un total de " + contVoclsYCons.numConsonantes(palabra1) + " consonantes");
        }
    }
}