import java.util.Scanner;
	public class CuentaKilometros {
		public static void main(String[] args) {

			Scanner lector = new Scanner(System.in);
		
			//Definir variables
			
			double PrecioLitro;
			double PrecioLleno;
			double CuentaKilometros;
			double TamañoDeposito;
			double PrecioLitro2;
			double PrecioLleno2;
			double CuentaKilometros2;
			double CuentaKilometros3;
			double TotalLitros;
			double TotalKilometros;
			double ConsumoCienKm;
			double CostoKm;

			//1º vez repostando
			
			System.out.println("1º vez repostando");
			System.out.println("¿Cuanto vale 1 litro de gasolina?");
			PrecioLitro = Double.parseDouble (lector.nextLine());
			System.out.println("¿Cuanto te has costado llenar el deposito?");
			PrecioLleno =  Double.parseDouble (lector.nextLine());
			System.out.println("¿Cuanto marca el cuenta kilometros despues de llenar el deposito?");
			CuentaKilometros = Double.parseDouble (lector.nextLine());

			//2º vez repostando
	
			System.out.println("2º vez repostando");
			TamañoDeposito = (PrecioLleno*1) / PrecioLitro;
			System.out.println("¿Cuanto vale 1 litro de gasolina?");
			PrecioLitro2 = Double.parseDouble (lector.nextLine());
			PrecioLleno2 = TamañoDeposito*PrecioLitro2;
			System.out.println("Llenar el deposito cuesta:" + PrecioLleno2);
			


			//3º vez repostando 
			
			System.out.println("3º vez repostando");
			System.out.println("¿Cuanto marca el cuenta kilometros despues de llenar el deposito?");
			CuentaKilometros3 = Double.parseDouble (lector.nextLine());

			//Calculos
			
			TotalLitros = TamañoDeposito*3;
			System.out.println("El total de litros respostado las 3 veces son:" + TotalLitros);

			CuentaKilometros2 = (PrecioLleno2*CuentaKilometros)/PrecioLleno;
			System.out.println("La segunda vez que repostaste tenias: " + CuentaKilometros2 + "km de autonomia");

			TotalKilometros = CuentaKilometros+CuentaKilometros2+CuentaKilometros3;
			System.out.println("El total de km que has recogido es:" + TotalKilometros);

			ConsumoCienKm = (TotalLitros/TotalKilometros)*100;
			System.out.println("El consumo por cada 100km es: " + ConsumoCienKm);
			
			
			CostoKm = ConsumoCienKm/100;
			System.out.println("El coste por km es:" + CostoKm);
	
			lector.close();
		
	}
		}

			