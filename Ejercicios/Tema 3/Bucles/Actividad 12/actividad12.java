import java.util.Scanner;
import java.util.Random;
    public class actividad12 {
        public static void main(String[] args) {

            Scanner lector = new Scanner(System.in);
            
            int aleatorio;
            int numAdivinado = 0;
            int intentos;

            System.out.println("En este juego, tendras 5 intentos para adivinar el numero entre 1 y 100.");

            Random rnd = new Random();
            aleatorio = rnd.nextInt(101); //Elegira un numero random entre 1 y 100

            do{
                for (intentos = 1; intentos <= 5; intentos++) { //Limitara los intentos a 5
                    System.out.println("¿Que numero crees que es?");
                    numAdivinado = lector.nextInt();

                    if (aleatorio == numAdivinado){ //Si adivina el numero random del ordenador
                        System.out.println("Correcto, has adivinado el numero");
                        break;
                    } else if (aleatorio != numAdivinado && intentos < 5)//Si no adivina el numero random del ordenador
                        System.out.println("Incorrecto, vuelve a intentarlo");
                    
                    
                    if (numAdivinado < aleatorio && intentos < 5) //Indicara si el numero es mayor al que se a dicho
                        System.out.println("El numero es mayor");
                    else if (numAdivinado > aleatorio && intentos < 5) //Indicara si el numero es menor al que se a dicho
                        System.out.println("El numero es menor");

                    if (intentos == 5){ //Si se le a acbado los intentos
                        System.out.println("MALA SUERTE, no lo has adivinado");
                        System.out.println("El numero era: " + aleatorio);
                    }
                    
                }
            } while (intentos <=5 && aleatorio != numAdivinado); // El bucle se repetira hasta que haya echo los 5 intentos o haya adivinado el numero

            lector.close();
        }
    }