import java.util.Random;
    public class Actividad11{
        public static void main(String[] args){
            for(int i = 1; i <= 15; i++){
                String partido = "";
                partido = quiniela(1, 3, i);
                System.out.println(partido);
            }

        }
        public static String quiniela(int min, int max, int jugadas){
            String partido = "";
            int num = aleatorio(min, max);

            switch(num){
                case 1:
                    partido = String.format("Partido %2d", jugadas) + "   1";
                    break;
                case 2:
                    partido = String.format("Partido %2d", jugadas) + "   x";
                    break;
                case 3:
                    partido = String.format("Partido %2d", jugadas) + "   2";
                   
            }

            return partido;

        }
        public static int aleatorio(int min, int max){
            Random rnd = new Random();
            int num = rnd.nextInt(max - min +1) + min;

            return num;
        }

    }