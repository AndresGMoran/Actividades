import java.util.Scanner;
    public class Actividad1{
        public static void main(String[] args){

            Scanner lector = new Scanner(System.in);

            double x;

            System.out.println("Dime un numero");
            x = Double.parseDouble(lector.nextLine());
            System.out.printf("%.2f\n", x);

            lector.close();
        }
    }