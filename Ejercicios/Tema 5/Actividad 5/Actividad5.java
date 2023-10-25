import java.util.Scanner;

public class Actividad5 {

    public static void imprimirCaracter(char carac, int veces){
		for (int i = 0; i < veces; i++){
			System.out.print(carac);	
		}
		System.out.println("");
	}
    public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		char caracter = ' ';
		int numeroVeces;
		
		//Se piden datos.
		System.out.println("Ingresa un carácter a imprimir:");
		caracter = lector.next().charAt(0);
		lector.nextLine();
		
		System.out.println("Indica cuántas veces quieres imprimir el carácter:");
		numeroVeces = Integer.parseInt(lector.nextLine());		
		
		//Se llama al método.
		imprimirCaracter(caracter, numeroVeces);
		
		lector.close();
		
				
	}
	
}

