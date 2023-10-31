import java.util.Random;
public class Actividad12{
    public static void main(String[] args){
        for(int i = 1; i <= 50; i++){
            String resultados = resultados(i);
            int notas = notas(i);
            System.out.println("Tu nota es: " + (notas) + " que es: "+ (resultados));
        }
    }
    public static int notas(int nota){
        Random rnd = new Random();
        nota = rnd.nextInt(11);
        return nota;
    }
    public static String resultados(int nota1){
        String resultado = "";
        nota1 = notas(0);

        if(nota1 >= 0 && nota1 < 5 )
            resultado = "Insuficiente";
        else if (nota1 >= 5 && nota1 < 6)
            resultado = "Suficiente";
        else if (nota1 >= 6 && nota1 <= 7)
            resultado = "Bien";
        else if (nota1 > 7 && nota1 < 9)
            resultado = "Notable";
        else if (nota1 >= 9 && nota1 <= 10)
            resultado = "Excelente";

        return resultado;
    }
}