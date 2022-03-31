import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;

public class Server {
    public static void main(String args[]) {
        try {
            Scanner scan = new Scanner(System.in);
            IntfCalculator server = new IntfCalculatorRemote();
            Naming.rebind("rmi://localhost:3000/test", server);
            System.out.println("Servidor Iniciado");
            
            Boolean next = true;
            while(next){
                String message = scan.nextLine().trim();
                if ((message.equals("EXIT")) || (message.equals("exit"))){
                    System.out.println("Cerrando calculadora");
                    break;
                } else{
                    next = true;
                }
            }
            scan.close();
            System.exit(0);

        } catch (Exception e) {
            System.out.println("Fallo de servidor: "+e);
        }
    }    
}