import java.util.Scanner;
public class Actividad6{
    public static void main(String[] args){
		
		Scanner lector = new Scanner(System.in);
        String cadena = ('a',3,2);
        System.out.println(cadena);
        lector.close();
    }

    public static String print(char c, int filas, int columnas){
        String result = "";
        for(int i = 1; i <= filas; i++){
            for(int j = 1; j <= columnas; j++){
                result = result + c;
            }
            result +="\n";
        }
        return result;
    }

    public static String print(char c, int veces){
        String result = "";
		for (int i = 0; i < veces; i++){
			System.out.print(c);
            result = result + c;
        }
        
    }
}