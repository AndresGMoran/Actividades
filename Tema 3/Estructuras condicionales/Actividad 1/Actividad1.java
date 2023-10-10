import java.util.Scanner;
	public class Actividad1 {
		public static void main(String[] args) {

			Scanner lector = new Scanner(System.in);

			int num1;
			
			System.out.println("Dime un numero");
			num1 = Integer.parseInt (lector.nextLine());

			if (num1/2 == 0) {
				System.out.println("Numero es primo");
			} else {
				System.out.println("Numero es impar");
			}
		}
	}
			
			
