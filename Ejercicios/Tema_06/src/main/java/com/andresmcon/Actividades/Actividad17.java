package com.andresmcon.Actividades;
import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args){
        Scanner lector = new Scanner (System.in);

        double[] estatura = new double[15];
        double estaturas = 0;

        //Solictar numeros.
        for(int i = 0; i < estatura.length; i++){
            System.out.println("Dime la estaturas: " + i);
            estatura[i] = lector.nextDouble();

            //Sumamos los numeros que inserta el usuario.
            estaturas += estatura[i];
        }

        //Calcular media.
        double media = estaturas/estatura.length;
        System.out.println("La media de las estaturas es: " + media);

        //Numeros superiores a la media.
        System.out.print("Los numeros superiores a la media son: ");
        for(double overMedia : estatura)
            if(overMedia > media)
                System.out.print( overMedia + ", ");
        lector.close();
    }
}
