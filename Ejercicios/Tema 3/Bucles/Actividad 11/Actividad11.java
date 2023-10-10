import java.util.Scanner;
    
    public class Actividad11  {
        public static void main(String[] args) {

            double num = 0;
            double media = 0;
            double suma = 0;
            double contador = 0;

            Scanner lector = new Scanner(System.in);

            while (num >= 0) {
             System.out.print("Dime un numero:");
                num = Double.parseDouble(lector.nextLine());
               contador++;
               suma += num;
               media = (suma - num) / (contador - 1);
            }
            System.out.println("La media es:" + media);

         lector.close();

        }
    }