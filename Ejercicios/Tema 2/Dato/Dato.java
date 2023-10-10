import java.util.Scanner;

public class Dato {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
			int dato;
			int dato2;
			int resultado;
			System.out.println("Dime un numero:");
			dato = (int) lector.nextInt();
			System.out.println("Dime otro numero:");
			dato2 = (int) lector.nextInt();
			resultado = dato + dato2;
			System.out.print("La operación seria:");
			System.out.println(dato + "+" + dato2 + "=" + resultado);
		lector.close();
	}
}