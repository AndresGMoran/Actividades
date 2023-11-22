package com.andresmcon.Pruebas;

public class Array2 {
    public static void main(String[] args){
        int[] array1 = {-5, 3, 10, 56, -34, 23};
        int[] array2 = array1;

        array2[2]=1;

        for (int dato : array1)
            System.out.println(dato + " ");

        System.out.println();

        for (int dato : array2)
            System.out.println(dato + " ");
    }
}
