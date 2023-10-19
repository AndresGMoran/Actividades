import java.util.Scanner;
    public class Actividad2{
        public static void main(String[] args){
            Scanner lector = new Scanner(System.in);

            int h;
            int m;
            int s;

            System.out.println("Dime una hora");
            h = Integer.parseInt(lector.nextLine());

            System.out.println("Dime un minuto");
            m = Integer.parseInt(lector.nextLine());

            System.out.println("Dime un segundo");
           s = Integer.parseInt(lector.nextLine());

            System.out.printf("%02d : %02d : %02d ", h, m, s);
        }
    }