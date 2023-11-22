package com.andresmcon.Actividades;

public class Actividad03 {
    public int contPalabras(String frase) {
        int contador = 0;
        frase = frase.trim();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ')
                contador++;
        }
        return contador +1;
    }
}
