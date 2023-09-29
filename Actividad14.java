import java.util.Scanner;
	public class Actividad14 {
		public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			double longitud;
			double area;
			System.out.println("Dime el radio:");
			double radio = Double.parseDouble(lector.nextLine());
			longitud = (2*Math.PI*radio);
			System.out.println("La longitud es:" + longitud);
			area = (Math.PI*radio*radio);
			System.out.println("El area es:" + area);
		}
	}
			
			