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
public class ServidorMulDivision
{
    
    /** Crea nueva instancia de Servidor rmi */
    public ServidorMulDivision() {
        try 
        {

            InterfaceRemota2 objetoRemoto = new ObjetoRemoto2();
            String rname = "//localhost:" + Registry.REGISTRY_PORT  + "/ObjetoRemoto2";
                Naming.rebind (rname, objetoRemoto);
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    

    public static void main(String[] args) {
        new ServidorMulDivision();
    }
}
