import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int i;
        int num1;
        int num2;
        int producto = 0;

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        for (i = 0; i < num2; i++) 
            producto += num1;
        
        System.out.println("El producto de los dos es: " + producto);
    }
}
