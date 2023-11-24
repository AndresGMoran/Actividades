package com.andresmcon.Actividades;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime una palabra");
        String palabra = lector.nextLine();
        System.out.println(palabraPalindroma(palabra));
    }

    public static boolean palabraPalindroma(String palabra) {
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        if(palabraInvertida.equals(palabra) )
            return true;
        return false;

    }
}


