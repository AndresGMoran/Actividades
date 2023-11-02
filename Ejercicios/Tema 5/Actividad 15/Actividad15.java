import java.util.Scanner;
public class Actividad15{
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        
        showMenu();
        System.out.println("Dime que opcion quieres ver:");
        int optionSelected = Integer.parseInt(lector.nextLine());
        String firstWord, secondWord,thirdWord, word = "";
        
        do{
            switch(optionSelected){
                case 1:
                    System.out.println("Dime una palabra:");
                    firstWord = lector.nextLine();
                    System.out.println("Dime una segunda palabra:");
                    secondWord = lector.nextLine();
                    System.out.println("Dime una tercera palabra:");
                    thirdWord = lector.nextLine();
                    System.out.println("La palabra mas larga es:");
                    System.out.println(optionOne(firstWord, secondWord, thirdWord));
                    break;
                case 2:
                    System.out.println("Dime una palabra:");
                    firstWord = lector.nextLine();
                    System.out.println("Dime una segunda palabra:");
                    secondWord = lector.nextLine();
                    System.out.println("Dime una tercera palabra:");
                    thirdWord = lector.nextLine();
                    System.out.println("La palabra mas corta es:");
                    break;
                case 3:
                    System.out.println("Dime una palabra:");
                    word = lector.nextLine();
                    System.out.println("La palabra tiene:");
            }
        }while(optionSelected != 0);

    }
    public static void showMenu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("=================");
        System.out.println("1. Palabra mas larga");
        System.out.println("2. Palabra más corta");
        System.out.println("3. Numero de vocales");
        System.out.println("---------------------------");
        System.out.println("0.Salir");
    }
    public static String optionOne(String firstWord, String secondWord, String thirdWord){

        if (firstWord.length() > secondWord.length() && firstWord.length() > thirdWord.length())
            return  firstWord;
        else if (secondWord.length() > firstWord.length() && secondWord.length() > thirdWord.length())
            return secondWord;
        else if (thirdWord.length() > firstWord.length() && thirdWord.length() > secondWord.length())
            return thirdWord;

    }

}