import java.util.Scanner;
	public class Actividad13 {
		public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			int segundos;
			int minutos;
			int horas;
			int dias;
			System.out.println("Dime una cantidad de segundos:");
			segundos = Integer.parseInt (lector.nextInt());
			minutos = segundos / 60;
			System.out.println("Los minutos son:" + minutos);
			horas = minutos / 60;
			System.out.println("Los horas son:" + horas );
			dias = horas / 24;
			System.out.println("Los dias son:" + dias);
		}
	}
			
			