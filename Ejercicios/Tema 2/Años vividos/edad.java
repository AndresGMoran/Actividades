import java.util.Scanner;
	public class edad {
		public static void main (String[] args) {
		Scanner lector = new Scanner(System.in);
		int edad;
		double año = 365;
		double resultado;
		System.out.println("Cual es tu edad:");
		edad = (int) lector.nextInt();
		resultado = edad * año;
		System.out.println("Has vivido:" + resultado + "dias");
		
		
		
		
	}
		}		