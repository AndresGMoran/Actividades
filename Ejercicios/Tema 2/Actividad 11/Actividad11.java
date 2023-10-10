import java.util.Scanner;
	public class Actividad11 {
		public static void main(String[] args) {
			double num1;
			double num2;

			Scanner lector = new Scanner(System.in);

			System.out.println("Dime un numero");
			num1 = Double.parseDouble (lector.nextLine());
			System.out.println("Dime otro numero:");
			num2 = Double.parseDouble (lector.nextLine());
			
			lector.close();
			
			System.out.println(num1 - num2);

			
		}
	}