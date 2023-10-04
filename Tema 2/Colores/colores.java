import java.util.Scanner;
	public class colores {
			public enum Colores {
				RED, GREEN, BLUE
			}
			public static void main(String[] args) {
				Colores color = Colores.BLUE;
				System.out.println("El color es:" + color);
				color = Colores.RED;
				System.out.println("Ahora es:" + color);
	}
			}