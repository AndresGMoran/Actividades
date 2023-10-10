import java.util.Scanner;
	public class Actividad2 {
		public static void main(String[] args) {
			
			Scanner lector = new Scanner(System.in);
		
			int num1;
			int num2;

			System.out.println("Dime el primer numero:");
			num1 = Integer.parseInt(lector.nextLine());
			System.out.println("Dime el segundo numero:");
			num2 = Integer.parseInt(lector.nextLine());

			if(num1 > num2) 
				System.out.println("Es mayor");
			 else if (num1 < num2) 
				System.out.println("Es menor");
			 else if (num1 == num2) 
				System.out.println("Es igual");
			

			lector.close();
		}
	} 