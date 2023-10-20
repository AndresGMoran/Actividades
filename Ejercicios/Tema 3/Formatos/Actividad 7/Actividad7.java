public class Actividad7 {
    public static void main(String[] args) {
        

        String almacen = "";
        String almacen2 = "";

        for (int i = 1; i < 10; i++) {
            almacen += i;

            System.out.printf("%9s", almacen);
            
            for (int j = i; j >= 1; j--){

            System.out.printf("%-1s", j );
            }
            
            System.out.printf("\n");
        }
            
           
            

        
    }
}