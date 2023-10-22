import java.util.Scanner;
    public class Actividad9{
        public static void main(String[] args){

            Scanner lector = new Scanner(System.in);

            String ciudad;
            int d, m, a;
            int h, min, s;
            int velocidadViento;
            double temperatura;
            double presionAtmosferica;
            int probabilidadLluvia;
            int UVI;
            
            //Solicitar ciudad
            System.out.println("Dime una ciudad:");
            ciudad = lector.nextLine();

            //Solictar fecha
            System.out.println("Dime una fecha");
            System.out.println("Dia:");
            d = Integer.parseInt(lector.nextLine());
            System.out.println("Mes: ");
            m = Integer.parseInt(lector.nextLine());
            System.out.println("Año: ");
            a = Integer.parseInt(lector.nextLine());

            //Solicitar hora
            System.out.println("Dime una hora: ");
            System.out.println("Hora: ");
            h = Integer.parseInt(lector.nextLine());
            System.out.println("Minutos: ");
            min = Integer.parseInt(lector.nextLine());
            System.out.println("Segundos");
            s = Integer.parseInt(lector.nextLine());

            //Solicitar velocidad del viento
            System.out.println("Dime la velocidad del viento: ");
            velocidadViento = Integer.parseInt(lector.nextLine());

            //Solicitar temperatura
            System.out.println("Dime la temperatura: ");
            temperatura = Double.parseDouble(lector.nextLine());

            //Solictar presion atmosferica
            System.out.println("Dime la presion atmosferica");
            presionAtmosferica = Double.parseDouble(lector.nextLine());
            
            //Solicitar probabilidad lluvia entre 0% y 100 %
            do{
                System.out.println("Dime la probabilidad de lluvia entre 0% y 100%:");
                probabilidadLluvia = Integer.parseInt(lector.nextLine());
            }while(probabilidadLluvia < 0 || probabilidadLluvia > 100);
            
            //Solictar UVI
            System.out.println("Dime el UVI: ");
            UVI = Integer.parseInt(lector.nextLine());


            System.out.printf("\u001B[00;00;45m** DATOS ESTACION METEREOLOGICA **\u001B[0m\n");

            
            //Mostar ciudad
            System.out.printf("Ciudad:\t\t\t %s\n", ciudad);

            //Mostrar fecha
            System.out.printf("Fecha:\t\t\t %02d/%02d/%02d\n", d, m, a);

            //Mostrar hora
            System.out.printf("Hora de la mesura:\t %02d:%02d:%02d\n", h, min, s);

            //Mostrar velocidad del viento
            if(velocidadViento < 30){ //Se mostrara del color verde
                System.out.printf("Velocidad del viento:\t \u001B[1;32;40m", velocidadViento); 
                System.out.printf("%d", velocidadViento);
                System.out.printf("\u001b[0m km/h\n"); 
            }else if(velocidadViento >= 30 && velocidadViento < 60){ //Se mostrara de color amarillo
                System.out.printf("Velocidad del viento:\t \u001B[1;33;40m", velocidadViento);
                System.out.printf("%d", velocidadViento);
                System.out.printf("\u001b[0m km/h\n"); 
            }else if(velocidadViento >= 60){ //Se mostrara de color rojo
                System.out.printf("Velocidad viento:\t \u001B[1;31;40m", velocidadViento);
                System.out.printf("%d", velocidadViento );
                System.out.printf("\u001b[0m km/h\n");
            }

            //Mostrar temperatura
            if(temperatura < 22){ //Se mostrara de color azul
                System.out.printf("Temperatura:\t\t \u001B[1;34;40m", temperatura);
                System.out.printf("%.2f", temperatura);
                System.out.printf("\u001b[0m Cº\n"); 
            }else if(temperatura >= 22 && temperatura < 27){ //Se mostrara de color verde
                System.out.printf("Temperatura:\t\t \u001B[1;32;40m", temperatura);
                System.out.printf("%.2f", temperatura);
                System.out.printf("\u001b[0m Cº\n"); 
            }else if(temperatura >= 27 && temperatura < 35){ //Se mostrara de color amarillo
                System.out.printf("Temperatura:\t\t \u001B[1;33;40m", temperatura);
                System.out.printf("%.2f", temperatura);
                System.out.printf("\u001b[0m Cº\n");   
            }else if(temperatura >= 35){ //Se mostrara de color rojo
                System.out.printf("Temperatura:\t\t \u001B[1;31;40m", temperatura);
                System.out.printf("%.2f", temperatura);
                System.out.printf("\u001b[0m Cº\n");   
            }

            //Mostar presion Atmosferica
            System.out.printf("Presion atmosferica:\t %.1f hPa\n", presionAtmosferica);

            //Mostrar probabilidad de lluvia
            if(probabilidadLluvia < 35){ //Se mostrara de color verde
                System.out.printf("Probabilidad lluvia:\t \u001B[1;32;40m", probabilidadLluvia);
                System.out.printf("%d ", probabilidadLluvia);
                System.out.printf("\u001b[0m");
                System.out.print("%");
                System.out.printf("\n"); 
            }else if(probabilidadLluvia >= 35 && probabilidadLluvia < 70){ //Se mostrara de color amarillo
                System.out.printf("Probabilidad lluvia:\t \u001B[1;33;40m", probabilidadLluvia);
                System.out.printf("%d ", probabilidadLluvia);
                System.out.printf("\u001b[0m");
                System.out.print("%");
                System.out.printf("\n"); 
            }else if(probabilidadLluvia >= 70){ //Se mostrara de color rojo
                System.out.printf("Probabilidad lluvia:\t \u001B[1;31;40m", probabilidadLluvia);
                System.out.printf("%d ", probabilidadLluvia);
                System.out.printf("\u001b[0m");
                System.out.print("%");
                System.out.printf("\n");
            }  

            //Mostrar UVI
            if(UVI <= 2){ //Se mostrara de color verde
                System.out.printf("UVI:\t\t\t \u001B[1;32;40m", UVI);
                System.out.printf("%d", UVI);
                System.out.printf("\u001b[0m"); 
            }else if(UVI >= 3 && UVI <= 5){ //Se mostrara de color azul
                System.out.printf("UVI:\t\t\t \u001B[1;34;40m", UVI);
                System.out.printf("%d", UVI);
                System.out.printf("\u001b[0m"); 
            }else if(UVI >= 6 && UVI <= 7){ //Se mostrara de color amarillo
                System.out.printf("UVI:\t\t\t \u001B[1;33;40m", UVI);
                System.out.printf("%d", UVI);
                System.out.printf("\u001b[0m");
            }else if(UVI >= 8 && UVI < 10){
                System.out.printf("UVI:\t\t\t \u001B[1;31;40m", UVI); //Se mostrara de color rojo
                System.out.printf("%d", UVI);
                System.out.printf("\u001b[0m");
            }else if(UVI >= 10){ //Se mostrara en color magenta
                System.out.printf("UVI:\t\t\t \u001B[1;35;40m", UVI);
                System.out.printf("%d", UVI);
                System.out.printf("\u001b[0m");
            }

            lector.close();
            
        }
    }