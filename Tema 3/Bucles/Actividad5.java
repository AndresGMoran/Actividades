import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {

        int i;
        int pares = 0; 
        int sumaPares = 0;
        int impares = 0; 
        int sumaImpares = 0;
        int multiplosDe5 = 0;
        int sumaMultiplosDe5 = 0;

        for (i = 1; i <= 100; i++) { //Muestra los numeros del 1 al 100
            System.out.print(i);

            if (i % 2 == 0) {
                System.out.print("Es Par");
                pares++; //Suma uno a pares cada vez que haya un numero par
                sumaPares += i; //La suma de todos los pares que hay entre 1 y 100
            } else {
                System.out.print("Es Impar");
                impares++; //Suma uno a impares cada vez que haya un numero impar
                sumaImpares += i; //La suma de todos los impares que hay entre 1 y 100
            }

            if (i % 5 == 0) {
                System.out.print(" Es multiplo de 5");
                multiplosDe5++; //Suma uno a multiplosde5 cada vez que haya un numero multiplo de 5
                sumaMultiplosDe5 += i; //La suma de todos los multiplos de 5 que hya entre el 1 y 100
            }

            System.out.println(); // Imprime correctamnte todo lo anterior
        }

        System.out.println("Total:");
        System.out.println("Números pares: " + pares + ", Suma: " + sumaPares);
        System.out.println("Números impares: " + impares + ", Suma: " + sumaImpares);
        System.out.println("Múltiplos de 5: " + multiplosDe5 + ", Suma: " + sumaMultiplosDe5);
    }
}
