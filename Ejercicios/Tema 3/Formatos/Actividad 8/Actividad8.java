public class Actividad8 {
    public static void main(String[] args) {

        for (int b = 0; b <= 1; b++){
            String s = "" + b;

            for(int fg = 30; fg <= 37; fg++){
               System.out.printf("\n");
                
                for(int bg = 40; bg <= 47; bg++){
                    System.out.printf("\u001b[%d;%d;%dm ", b, fg, bg);
                    System.out.printf("%d;%d;%d ", b, fg, bg);
                    System.out.printf("\u001b[0m "); 

                    
                }
            }
        }
    }
}
