public class Actividad4 {
    public static void main(String[] args) {
        
        int i;
        int contador = 0;

        for (i = 1; i <= 100; i += 2) {
            System.out.println(i);
            contador++;
        }

        System.out.println("Total de números impares: " + contador);
    }
}
