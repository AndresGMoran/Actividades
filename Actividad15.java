import java.util.Scanner;
	public class Actividad15 {
		public static void main(String[] args) {
			double centigrados;
			double kelvin;
			double farenheit;
			
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Dime una temperatura en grados centigrados");
			centigrados = Double.parseDouble (lector.nextLine());
			kelvin = centigrados + 273.15;
			farenheit = centigrados*(9/5) + 32;
			System.out.println("En kelvin seria:" + kelvin + " y en farenheit seria:" + farenheit);

		}
	}