package com.andresmcon.Actividades;

public class Actividad12 {
    public static void main(String[] args){
        String frase = "«esto1234es5678bueno900";

        System.out.println(firstChanges(frase));
        System.out.println();

        System.out.println(secondChanges(frase));
    }
    public static String firstChanges(String frase){
        return frase.replaceAll("es", "no por");
    }
    public static String secondChanges(String frase){
        return frase.replaceAll("\\d+","*");
    }
}
