public class Actividad5 {
    public static void main(String[] args) {
        

        String almacen = "";

        for (int i = 1; i < 10; i++) {
            almacen += i;

        System.out.printf("\u001B[" + (29 + i) + "m %10s \u001B\n[0m", almacen );
           
            

        }
    }
}