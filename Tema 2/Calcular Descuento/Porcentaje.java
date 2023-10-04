import java.util.Scanner;

public class Porcentaje {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
			double precio1 = 85;
			double descuento = 15;
			double resultado;
			double precio2;
		precio2 = (precio1 * descuento) / 100;
		resultado = precio1 - precio2;
		System.out.println("El descuento es de:" + precio2);
		System.out.println("El precio final de los zapatos son:" + resultado);
		
	}
}
		
		
		
		