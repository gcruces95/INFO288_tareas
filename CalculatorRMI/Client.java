import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) {
        try {
            Scanner scan = new Scanner(System.in);

            IntfCalculator client = (IntfCalculator)Naming.lookup("rmi://localhost:3000/test");
            String message = "Cliente conectado al servidor";

            Boolean next = true;

            System.out.println("Cliente conectado");
            System.out.println("");
            System.out.println("###Hola, bienvenido a esta calculadora que funciona con RMI###");

            while(next){
                System.out.println("Selecciones uno de los siguientes números, según la operación aritmética que desea realizar:");
                System.out.println("");
                System.out.println("'1' ====> Suma");
                System.out.println("'2' ====> Resta");
                System.out.println("'3' ====> Multiplicación");
                System.out.println("'4' ====> División");
                System.out.println("'5' ====> Módulo");
                System.out.println("'6' ====> Potencia");
                System.out.println("");
                System.out.println("Para salir de la calucladora, por favor ingrese la palabra 'EXIT' o 'exit'.");

                message = scan.nextLine().trim();

                if (message.equals("1")){
                    System.out.println("Usted seleccionó la operación SUMA");
                    System.out.println("");
                    System.out.println("Ingrese el primer número: ");
                    int x = Integer.parseInt(scan.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int y = Integer.parseInt(scan.nextLine());
                    System.out.println("La suma entre los números es: " + client.sum(x,y));
                    System.out.println("");
                } else if (message.equals("2")){
                    System.out.println("Usted seleccionó la operación RESTA");
                    System.out.println("");
                    System.out.println("Ingrese el primer número: ");
                    int x = Integer.parseInt(scan.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int y = Integer.parseInt(scan.nextLine());
                    System.out.println("La resta entre los números es: " + client.res(x,y));
                    System.out.println("");
                } else if (message.equals("3")){
                    System.out.println("Usted seleccionó la operación MULTIPLICACIÓN");
                    System.out.println("");
                    System.out.println("Ingrese el primer número: ");
                    int x = Integer.parseInt(scan.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int y = Integer.parseInt(scan.nextLine());
                    System.out.println("La multiplicación entre los números es: " + client.mul(x,y));
                    System.out.println("");
                } else if (message.equals("4")){
                    System.out.println("Usted seleccionó la operación DIVISIÓN");
                    System.out.println("");
                    System.out.println("Ingrese el primer número: ");
                    int x = Integer.parseInt(scan.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int y = Integer.parseInt(scan.nextLine());
                    System.out.println("La división entre los números es: " + client.div(x,y));
                    System.out.println("");
                } else if (message.equals("5")){
                    System.out.println("Usted seleccionó la operación MÓDULO");
                    System.out.println("");
                    System.out.println("Ingrese el primer número: ");
                    int x = Integer.parseInt(scan.nextLine());
                    System.out.println("Ingrese el segundo número: ");
                    int y = Integer.parseInt(scan.nextLine());
                    System.out.println("El módulo entre los números es: " + client.mod(x,y));
                    System.out.println("");
                } else if (message.equals("6")){
                    System.out.println("Usted seleccionó la operación POTENCIA");
                    System.out.println("");
                    System.out.println("Ingrese el valor de la base: ");
                    int x = Integer.parseInt(scan.nextLine());
                    System.out.println("Ingrese el valor del exponente: ");
                    int y = Integer.parseInt(scan.nextLine());
                    System.out.println("El valor de la potencia es: " + client.pot(x,y));
                    System.out.println("");
                } else if ((message.equals("EXIT")) || (message.equals("exit"))) {
                    next = false;
                    System.out.println("Cerrando calculadora");
                    break;
                } else{
                    System.out.println("Usted no ingresó una opción válida, intente otra vez.");
                    System.out.println("");
                }
            }
            scan.close();
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Fallo de servidor: "+e);
        }
    }
}
