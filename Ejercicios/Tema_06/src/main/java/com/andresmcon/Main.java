package com.andresmcon;

import com.andresmcon.Actividades.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palabra = "hola";

        System.out.println("Actividad 1:");

        Actividad01 mayus = new Actividad01();
        System.out.println(palabra + " = "+ mayus.primeraLetraMayus(palabra));

        System.out.println();

        System.out.println("Actividad 2:");

        Actividad02 vocaYCons = new Actividad02();
        System.out.println("la palabra " + palabra + " se compone de:" );
        vocaYCons.numVocConso(palabra);

        System.out.println();

        String frase = "Hola buenas tardes";

        System.out.println("Actividad 3:");

        Actividad03 contPalabras = new Actividad03();
        System.out.println("La frase tiene " + contPalabras.contPalabras(frase) + " palabras");

        System.out.println();

        System.out.println("Actividad 4:");

        Actividad04 contVoclsYCons = new Actividad04();
        String[] listaPalabras = frase.split("\\s+");

        for (String palabra1 : listaPalabras) {
            System.out.println(palabra1 + ": tiene un total de " + contVoclsYCons.contarVocales(palabra1) + " vocales y tiene un total de " + contVoclsYCons.numConsonantes(palabra1) + " consonantes");
        }

        System.out.println();

        String frase2 = "Me llamo Andres";

        System.out.println("Actividad 5");

        Actividad05 buscaPalabra = new Actividad05();
        buscaPalabra.encontrarPalabraMayorLongitud(frase2);

        System.out.println();

        System.out.println("Actividad 6");

        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String fraseSolicitada = lector.nextLine();
        System.out.print("Ingresa un factor de multiplicación: ");
        int numeroSolicitado = lector.nextInt();

        lector.close();

        Actividad06 repeFrase = new Actividad06();
        repeFrase.repetirFrase(fraseSolicitada, numeroSolicitado);

        System.out.println();

        System.out.println("Actividad 7");

    }
}