package com.andresmcon.Actividades;

public class Actividad09 {
    public static void main(String[] args){
        String frase = "Holaa Pepee listo";

        System.out.println(PosicionImpares(frase));
    }
    public static String PosicionImpares(String frase) {
        StringBuilder sb = new StringBuilder();
        frase.trim().replaceAll("\\s+", " ");

        for (int i = 0; i < frase.length(); i++) {
            if (i % 2 != 0)
                sb.append(frase.charAt(i));

        }
        return sb.toString();
    }

}
