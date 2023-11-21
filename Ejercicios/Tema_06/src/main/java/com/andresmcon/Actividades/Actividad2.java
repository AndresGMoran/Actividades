package com.andresmcon.Actividades;

public class Actividad2 {
    public void numVocConso(String palabra) {
        int contador = palabra.length();
        int contador1 = 0;
        int contador2 = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if ((palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'e') || (palabra.charAt(i) == 'i') ||
                    (palabra.charAt(i) == 'o') || (palabra.charAt(i) == 'u'))
                contador1++;
            else
                contador2++;
        }


        System.out.println("Numero de vocales:" + contador1);
        System.out.println("Numero de consonantes:" + contador2);


    }

}
