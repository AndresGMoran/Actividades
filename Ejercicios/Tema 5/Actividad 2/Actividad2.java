import java.util.Scanner;
public class Actividad2 {
    
    //Metodo para calcular el area
    public static double calculoArea(double radio){
		double calculoArea = Math.PI*(radio*radio);
		return calculoArea;
	}

    //Metodo para calcular la longituud
	public static double calculoLongitud(double radio){
		double calculoLongitud = 2*Math.PI*radio;
		return calculoLongitud;
	}
	public static void main(String[] args){

		Scanner lector = new Scanner(System.in);
		
        double radioUser;

		System.out.println("Dime el radio de la circunferencia en centímetros:");
		radioUser = Double.parseDouble(lector.nextLine());

		System.out.printf("El área de la circunferencia es: %.2f\n", calculoArea(radioUser));
		System.out.printf("La longitud de la circunferencia es: %.2f", calculoLongitud(radioUser));

		lector.close();		
	}

}
    

