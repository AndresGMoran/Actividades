import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
			double num1, num2;
			String opcion;
			double resultado = 0;
			char operador = ' ';
		System.out.println("Introduce un numero");
		num1 = Double.parseDouble (lector.nextLine());
		System.out.println("Introduce otro numero");
		num2 = Double.parseDouble(lector.nextLine());
		System.out.println("s) Sumar");
		System.out.println("r) Restar");
		System.out.println("m) Multiplicar");
		System.out.println("d) Dividir");
		opcion = lector.nextLine();
		if (opcion.equals("s")) {
			resultado = num1 + num2;
			//suma
			operador = '+';
		} else if (opcion.equals("r")) {
			resultado = num1 - num2;
			//resta
			operador = '-';
		} else if (opcion.equals("m")) {
			resultado = num1 * num2;
			//multiplicaion
			operador = '*';
		} else if (opcion.equals("d")) {
			resultado = num1 / num2;
			//division
			operador = '/';
		}
		if (operador != ' '){
			System.out.println(num1 + " " + operador + " " + num2 + " = " + resultado);
		}
		
	}
}