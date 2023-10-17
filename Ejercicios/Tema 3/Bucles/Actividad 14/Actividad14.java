import java.util.Random;
	public class Actividad14{
		public static void main(String [] args){

            final int uno = 1;
		    final int dos = 2;
            final int tres = 3;
            final int cuatro = 4;
            final int cinco = 5;
            final int seis = 6;
			int numUno = 0;
			int numDos = 0;
            int numTres = 0;
            int numCuatro = 0;
            int numCinco = 0;
            int numSeis = 0;
			int aleatorio;
            double porcentajeUno;
            double porcentajeDos;
            double porcentajeTres;
            double porcentajeCuatro;
            double porcentajeCinco;
            double porcentajeSeis;

            Random random = new Random();

            for (int i = 0; i <=1000000000; i++){	
				
				aleatorio = random.nextInt(7);
				switch (aleatorio){
					case uno:
						numUno++;
						break;
					case dos:
						numDos++;
						break;
                    case tres:
						numTres++;
						break;
                    case cuatro:
						numCuatro++;
						break;
                    case cinco:
						numCinco++;
						break;
                    case seis:
						numSeis++;
						break;
			    }		
		    }

            System.out.println("Veces que a salido el 1: " + numUno);
            System.out.println("Veces que a salido el 2: " + numDos);
            System.out.println("Veces que a salido el 3: " + numTres);
            System.out.println("Veces que a salido el 4: " + numCuatro);
            System.out.println("Veces que a salido el 5: " + numCinco);
            System.out.println("Veces que a salido el 6: " + numSeis);

            porcentajeUno = ((double)numUno / (numUno + numDos + numTres + numCinco + numSeis)) * 100;
            porcentajeDos = ((double)numDos / (numUno + numDos + numTres + numCinco + numSeis)) * 100;
            porcentajeTres = ((double)numTres / (numUno + numDos + numTres + numCinco + numSeis)) * 100;
            porcentajeCuatro = ((double)numCuatro / (numUno + numDos + numTres + numCinco + numSeis)) * 100;
            porcentajeCinco = ((double)numCinco / (numUno + numDos + numTres + numCinco + numSeis)) * 100;
            porcentajeSeis = ((double)numSeis / (numUno + numDos + numTres + numCinco + numSeis)) * 100;

            System.out.println("El porcentaje de unos es: " + porcentajeUno);
            System.out.println("El porcentaje de doses es: " + porcentajeDos);
            System.out.println("El porcentaje de treses es: " + porcentajeTres);
            System.out.println("El porcentaje de cuatros es: " + porcentajeCuatro);
            System.out.println("El porcentaje de cincos es: " + porcentajeCinco);
            System.out.println("El porcentaje de seises es: " + porcentajeSeis);
        }
    }
