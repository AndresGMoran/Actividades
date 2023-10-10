import java.util.Scanner;
	public class Actividad5 {
		public static void main(String[] args) {
			
			Scanner lector = new Scanner(System.in);
			
			int nota;

			System.out.println("Dime una nota");
			nota = Integer.parseInt(lector.nextLine());

			if (nota<5)
				System.out.println("Insuficiente");

			else if (nota>4&&nota<7)
				System.out.println("Suficiente");

			else if (nota>5&&nota<8)
				System.out.println("Bien");
	
			else if (nota>6&&nota<10)
				System.out.println("Notable");
			
			else if (nota>8&&nota<11)
				System.out.println("Sobresaliente");

			else if (nota>10)
				System.out.println("Error");

			lector.close();
			


		}
	}

			
			