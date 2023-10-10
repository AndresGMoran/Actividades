import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int suma = 0;
        int num;

        do {
            System.out.print("Ingrese un número: ");
            num = scanner.nextInt();
            suma += num;
        } while (num != 0);

        System.out.println("La suma de los números introducidos es: " + suma);
    }
}
