import java.util.Scanner;
	public class Rectangulo {
		public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			System.out.println("Dime el alto del rectangulo:");
			double alto = Double.parseDouble(lector.nextLine());
			System.out.println("Dime el ancho del rectangulo");
			double ancho = Double.parseDouble(lector.nextLine());
			lector.close();
			
			double perimetro;
			double area;
			perimetro = alto * 2 + ancho * 2;
			area = alto * ancho;
			System.out.println("El perimetro del rectangulo es:" + perimetro);
			System.out.println("El area del rectangulo es:" + area);
		}
	}
			