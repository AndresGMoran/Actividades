package com.andresmcon.Actividades;
import java.util.Scanner;

public class Actividad25 {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        final int LIMIT = 50;
        int[] array = new int [LIMIT];
        for(int i = 0; i< LIMIT; i++){
            System.out.println("Dime un numero:");
            array[i]= lector.nextInt();
        }
        getEvens(array);
    }

    /**
     * Imprime los elementos pares del array
     */
    public static void getEvens(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.println(array[i]);
        }
    }
}
