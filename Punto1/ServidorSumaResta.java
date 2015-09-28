/*
 * Javier Abell�n. Servidor.java
 *
 * Created on 2 de abril de 2004, 19:15
 */

import java.rmi.Naming;                    /* lookup         */
import java.rmi.registry.Registry;         /* REGISTRY_PORT  */

/**
 * Servidor para el ejemplo de RMI.
 * Exporte un metodo para sumar dos enteros y devuelve el resultado.
 */
public class ServidorSumaResta
{
    
    /** Crea nueva instancia de Servidor rmi */
    public ServidorSumaResta() {
        try 
        {

            InterfaceRemota objetoRemoto = new ObjetoRemoto();
            String rname = "//localhost:" + Registry.REGISTRY_PORT  + "/ObjetoRemoto";
                Naming.rebind (rname, objetoRemoto);
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    

    public static void main(String[] args) {
        new ServidorSumaResta();
    }
}
