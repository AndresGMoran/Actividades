import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int i;
        int num;
        int producto;

        // Solicitara al usuario un número y validar la entrada
            System.out.print("Dime un numero entre 1 y 10: ");
            num = scanner.nextInt();

        // Mostrar la tabla de multiplicar
        System.out.println("Tabla de multiplicar del " + num + ":");
        for (i = 1; i <= 10; i++) {
            producto = num * i;
            System.out.println(num + " x " + i + " = " + producto);
        }
    }
}
