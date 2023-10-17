import java.util.Scanner;
    public class Actividad15 {
        public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);

	        int h = 0;
            int m = 0;
            int s = 0;

            System.out.print("Ingrese una hora : ");
                h = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese unos minutos : ");
                m = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese unos segundos : ");
                s = Integer.parseInt(scanner.nextLine());

            boolean horaValida = (h >= 0 && h <= 23) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59);
        
            if (horaValida) {
                System.out.println("La hora es válida.");
                System.out.println("Son las " + h + ":" + m + ":" + s);
            } else {
                System.out.println("La hora no es válida.");
            }	
        
            scanner.close();
        
    }
}