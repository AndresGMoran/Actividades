import java.util.Scanner;
	public class Actividad12 {
		public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			
			double num1;
			double num2;
			
			System.out.println("Dime un numero");
			num1 = Double.parseDouble (lector.nextLine());
			System.out.println("Dime otro numero");
			num2 = Double.parseDouble (lector.nextLine());
			System.out.println(num1/num2);

			lector.close();
		}
	}