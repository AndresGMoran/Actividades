package com.andresmcon.Pruebas;

public class Arrays1 {
    public static void main(String[] args) {
        int[] vector = {53, 15, -22, 60, 6, 8, 14, -75, 12, -233, 64};
        int minimo = Integer.MAX_VALUE;
        for (int i : vector) {
            if (i < minimo)
                minimo = i;
        }
        System.out.println(minimo);


    }
}