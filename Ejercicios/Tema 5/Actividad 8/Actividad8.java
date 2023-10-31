import java.util.Scanner;
    public class Actividad8 {
        public static void main(String[] args){
            Scanner lector = new Scanner(System.in);

            System.out.println("Dime un numero");
            int num1 = Integer.parseInt(lector.nextLine());
            System.out.println("Dime otro numero");
            int num2 = Integer.parseInt(lector.nextLine());
            System.out.println("Dime otro numero");
            int num3 = Integer.parseInt(lector.nextLine());
            System.out.println("Dime otro numero");
            int num4 = Integer.parseInt(lector.nextLine());

            System.out.printf("Es:", Capicua(num1, num2, num3, num4));

            lector.close();
            

        }
        public static boolean Capicua(int n1, int n2, int n3, int n4){
            //String s = "" + n1 + n2 + n3 + n4
            String s= String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4);
            String reverse = "";
            for(int i = s.length() - 1; i >=0;i--){
                reverse += s.charAt(i);
            }
            return  s.equals(reverse);
        }
    }