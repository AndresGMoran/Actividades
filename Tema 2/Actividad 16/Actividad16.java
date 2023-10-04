import java.util.Scanner;
	public class Actividad16 {
		public static void main(String[] args) {
			double euro;
			double libra;
			double dolar;

			Scanner lector = new Scanner(System.in);

			System.out.println("Dime un cantidad de euros:");
			euro = Double.parseDouble (lector.nextLine());
			dolar = euro * 1.06;
			libra = euro * 0.86;
			System.out.println("En dolares seria:" + dolar + " y en libras seria:" + libra);
		} 
	}