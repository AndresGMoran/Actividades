import java.util.Scanner; 
	public class Actividad3 {
		public static void main(String[] args) {
			
			Scanner lector = new Scanner(System.in);
		
			int edad;
		
			System.out.println("Dime tu edad:");
			edad = Integer.parseInt(lector.nextLine());

			if (edad < 18) 
				System.out.println("Es menor de edad");
			else if (edad > 18) 
				System.out.println("Es mayor de edad");
			else if (edad == 18)
				System.out.println("Es mayor de edad");

			lector.close();
		}
	}
			