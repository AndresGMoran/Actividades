public class Actividad1{
    
    public static double suma(double num1, double num2){
		double suma = num1 + num2;
		return suma;
	}
    public static void main(String[] args){
		
        double num1 = 7;
		double num2 = 3;

		System.out.printf("La suma es: %.0f", suma(num1, num2));
	}
	
    
}