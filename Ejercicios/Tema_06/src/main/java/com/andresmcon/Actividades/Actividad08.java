package com.andresmcon.Actividades;
import java.util.Scanner;
public class Actividad08 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = lector.nextLine();

        lector.close();

        imprimirPalabrasYLongitud(frase);
    }
    public static void imprimirPalabrasYLongitud(String frase) {
        String[] palabras = frase.split(" ");

        System.out.println("Palabra\tLongitud");
        for (String palabra : palabras) {
            System.out.println(palabra + "\t" + palabra.length());
        }
    }
}
