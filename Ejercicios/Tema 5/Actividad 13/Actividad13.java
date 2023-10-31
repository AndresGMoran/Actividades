import java.util.Scanner;
    public class Actividad13 {
        public static void main(String[] args){
            Scanner lector = new Scanner(System.in);

           //Solicitamos el nombre al usuario
            System.out.println("Dime tu nombre"); 
            String usersName = lector.nextLine();
           
           //Solicitamos el idioma al usuario enseñado un listado de los idiomas
            System.out.println("Dime tu idioma");
            System.out.println("1. Castellano");
            System.out.println("2. Ingles");
            System.out.println("3. Valenciano");
            int language = Integer.parseInt(lector.nextLine());

            //Llamamos al metodo y lo imprimimos con las variables solicitadas anteriormente
            System.out.println(languageout(language, usersName));
        }
        
        public static String languageout(int language, String name){
            String lang = "";
            switch (language) {
                case 1:
                    System.out.println("Buenos días " + name) ;
                    break;
                case 2:
                    System.out.println("Good morning " + name);
                    break;
                case 3:
                    System.out.println("Bon dia " + name);
                }
            return lang;
        }


    }
