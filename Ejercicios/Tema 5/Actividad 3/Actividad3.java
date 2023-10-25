import java.util.Scanner;
public class Actividad3 {

    public static double mayor(double primerNum, double segundoNum){
		if(primerNum >= segundoNum){
			return primerNum;
		}else {
			return segundoNum;
		}
	}
    public static void main(String[] args){

		Scanner lector = new Scanner(System.in);

		double num1, num2;

		System.out.println("Ingresa un número:");
		num1 = Double.parseDouble(lector.nextLine());
		System.out.println("Ingresa un número:");
		num2 = Double.parseDouble(lector.nextLine());

		System.out.printf("El número %.0f es mayor", mayor(num1, num2));

		lector.close();
	}
	
}

