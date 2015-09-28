/*
 * Cliente.java
 *
 * Ejemplo de muy simple de rmi
 */

import java.rmi.Naming;                    /* lookup         */
import java.rmi.registry.Registry;         /* REGISTRY_PORT  */

import java.net.MalformedURLException;     /* Exceptions...  */
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class Cliente {
    
    /** Crea nueva instancia de Cliente */
    public Cliente(String[] args) 
    {
        try
        {
            String host = args[0];
            String rname = "//" + host + ":" + Registry.REGISTRY_PORT + "/ObjetoRemoto";
            InterfaceRemota objetoRemoto = (InterfaceRemota)Naming.lookup (rname);
            String rname2 = "//" + host + ":" + Registry.REGISTRY_PORT + "/ObjetoRemoto2";
            InterfaceRemota2 objetoRemoto2 = (InterfaceRemota2)Naming.lookup (rname2);
            
            
            int operador1 = Integer.parseInt(args[2]);
            int operando2 = Integer.parseInt(args[3]);

            switch (args[1]) {
                case "+":   System.out.print (operador1 + "+" + operando2 +"= ");
                            System.out.println (objetoRemoto.suma(operador1,operando2));
                            break;
                case "-":   System.out.print (operador1 + "-" + operando2 +"= ");
                            System.out.println (objetoRemoto.resta(operador1,operando2));
                            break;
                case ".":   System.out.print (operador1 + "*" + operando2 +"= ");
                            System.out.println (objetoRemoto2.multiplicacion(operador1,operando2));
                            break;
                case "/":   System.out.print (operador1 + "/" + operando2 +"= ");
                            System.out.println (objetoRemoto2.division(operador1,operando2));
                            break;
                default:  System.out.println("Operador no valido");
            }
            
        } catch (MalformedURLException e) {
	       e.printStackTrace();
        } catch (RemoteException e) {
	       e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("Los operandos no son enteros");
        } catch (NotBoundException e) {
	       e.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Cliente(args);
    }
    
}
