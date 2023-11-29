package com.andresmcon.Actividades;
import java.util.Scanner;

public class Actividad14 {
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        char[] characters = new char[10];
        solicitarChars(characters);
        posicionPar(characters);
        posicionImpares(characters);

    }
    public static void solicitarChars(char[] array){
       for (int i = 0; i < array.length; i++){
            System.out.println("Introduce el caracter " + i);
            array[i] = lector.nextLine().charAt(0);
       }
    }
    public static void posicionPar(char[] array){
        System.out.println("Los de poscion par son: ");
        for (int i = 0; i < array.length; i += 2){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
    public static void posicionImpares(char[] array){
        System.out.println("\n" + "Los de posicion impar son: ");
        for(int i = 1; i < array.length; i+= 2){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

}
