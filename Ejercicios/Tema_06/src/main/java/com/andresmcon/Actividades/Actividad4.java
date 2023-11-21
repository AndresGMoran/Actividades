package com.andresmcon.Actividades;

public class Actividad4 {
    public int contarVocales(String palabra){
        int numVocales = 0;
        palabra = palabra.toLowerCase();
        String vocales = "aeiou";

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (palabra.charAt(i) == vocales.charAt(j)) {
                    numVocales ++;
                }
            }
        }
        return numVocales;
    }
    public int numConsonantes(String palabra){
        String vocales = "aeiou ";
        boolean esCon = true;
        int consonantes = 0;
        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (palabra.charAt(i) == vocales.charAt(j))
                    esCon = false;
            }
            if (esCon)
                consonantes++;

            esCon = true;
        }
        return consonantes;
    }
}
