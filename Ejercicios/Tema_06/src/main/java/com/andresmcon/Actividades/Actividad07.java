package com.andresmcon.Actividades;
import java.util.Scanner;

public class Actividad07 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Dime una frase: ");
        String frase = lector.nextLine();

        lector.close();

        mostrarPalabrasEnLineas(frase);
    }
    public static void mostrarPalabrasEnLineas(String frase) {
        String[] palabras = frase.split(" ");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
